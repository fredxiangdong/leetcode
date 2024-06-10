package graph;

/**
 * Created by yangxiangdong on 2024/6/10.
 */
public class canFinish {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        boolean rt = true;
        for(int i = 0; i < numCourses; i++){
            if(visited[i] == 2){
                continue;
            }
            rt = rt & dsf(prerequisites, visited, i);
        }
        return rt;
    }

    private boolean dsf(int[][] prerequisites, int[] visited, int i){
        visited[i] = 1;
        boolean rt = true;
        for(int[] num : prerequisites){
            if(num[0] == i){
                if(visited[num[1]] == 2){
                    continue;
                }
                if(visited[num[1]] == 1){
                    return false;
                }
                rt = rt & dsf(prerequisites, visited, num[1]);
            }
        }
        visited[i] = 2;
        return rt;
    }
}
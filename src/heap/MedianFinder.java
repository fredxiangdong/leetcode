package heap;

import java.util.PriorityQueue;

/**
 * Created by yangxiangdong on 2024/3/24.
 */
public class MedianFinder {

    PriorityQueue<Integer> smallQueue;
    PriorityQueue<Integer> bigQueue;

    public MedianFinder() {
        smallQueue = new PriorityQueue<Integer>((a,b) ->(b-a));
        bigQueue = new PriorityQueue<Integer>((a,b)-> (a-b));
    }

    public void addNum(int num) {
        if(smallQueue.isEmpty() || num <= smallQueue.peek()){
            smallQueue.add(num);
            if(bigQueue.size() + 1 < smallQueue.size()){
                bigQueue.add(smallQueue.poll());
            }
        }else {
            bigQueue.add(num);
            if(bigQueue.size() > smallQueue.size()){
                smallQueue.add(bigQueue.poll());
            }
        }
    }

    public double findMedian() {
        if(smallQueue.size() > bigQueue.size()){
            return smallQueue.peek();
        }else {
            return (smallQueue.peek() + bigQueue.peek())/2.0;
        }
    }

}

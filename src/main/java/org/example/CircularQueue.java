package org.example;

/*Implementation the MyCircularQueue
* MyCircularQueue(k) initializes the object with the size of queue to be k.
* int Front() Gets the front item from the queue. If the queue is empty, return -1
* int Rear() Gets the last item from the queue. If the queue is empty, return -1
* boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
* boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
* boolean isEmpty() Checks whether the circular queue is empty or not
* boolean isFull() Checks whether -> (If) the circular queue is full or not*/
public class CircularQueue {
    private static int[] queue;
    private static int size;
    private static int capacity;
    private static int[] newQueue;

    public static void main(String[] args) {
        capacity = 3;
        queue = myCircularQueue(capacity);
        System.out.println(isEmpty());
        System.out.println(enQueue(1));
        System.out.println(enQueue(2));
        System.out.println(enQueue(3));
        System.out.println(isEmpty());
        System.out.println(isFull());
        System.out.println(deQueue(1));

    }

    public static boolean enQueue(int value){
        if(isFull()){
            return false;
        }

        queue[rear() + 1] = value;
        size++;
        return true;
    }

    public static boolean deQueue(int indexRemove) {
        if(isEmpty()){
            return false;
        }
        /*Create a new array with a new size -indexRemove and copy queue without the first index*/

        size--;
        return true;
    }

    public static int[] myCircularQueue(int size){
        return new int[size];
    }

    public static Integer front(){
        return queue[0];
    }

    public static int rear(){
        if(isEmpty()){
            return -1;
        }
        return queue[queue.length -1];
    }

    public static boolean isEmpty(){
        return size == 0;
    }

    public static boolean isFull(){
        return capacity == size;
    }
}

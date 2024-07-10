package Queues;

import java.util.Queue;

public class QueueArray {

    private int [] arr;
    private int tail;
    private int head;
    private int size;


    public QueueArray(int size){
        this.arr = new int[size];
        this.head = -1;
        this.tail = -1;
        this.size = size;
        System.out.println("The queue is successfully created with a size of " + size);
    }

//    isFull
    public Boolean isFull() {
        if (this.head == (size - 1) ) {
            return true;
        } else {
            return false;
        }
    }

//    isEmpty
    public Boolean isEmpty(){
        return (this.head == -1);
    }

//    Enqueue
//    public void enqueue(int value) {
//    if (isFull()) {
//        System.out.println("Queue is full.");
//    } else if (isEmpty()) {
//        head = 0;
//        arr[tail] = value;
//        System.out.println("Successfully inserted " + value + " in the queue.");
//    } else {
//        backOfQueue++;
//        nItems++;
//        arr[backOfQueue] = value;
//        System.out.println("Successfully inserted " + value + " in the queue.");
//
//    }
//    }
//
////    dequeue
//public int dequeue(int value) {
//    if (isEmpty()) {
//        System.out.println("Queue is empty.");
//        return -1;
//    } else {
//        int result = arr[beginningOfQueue];
//        beginningOfQueue++;
//        if (beginningOfQueue > backOfQueue) {
//            beginningOfQueue = backOfQueue = -1;
//        }
//        nItems--;
//        return result;
//
//    }
//}


//Peek
//    delete all
//    print queue



}

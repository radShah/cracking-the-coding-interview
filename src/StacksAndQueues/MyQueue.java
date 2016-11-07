package StacksAndQueues;

import java.util.LinkedList;

/**
 * Created by radha on 11/6/16.
 */
public class MyQueue {
    QueueNode front = new QueueNode();
    QueueNode back = new QueueNode();

    public void enqueue(Object data) {
        QueueNode newNode = new QueueNode(data);
        if (front == null) {
            front = newNode;
        } else {
            back.next = newNode;
        }
    }

    public Object dequeue() {
        if (front != null) {
            Object data = front.data;
            front = front.next;
            return data;
        } else {
            return null;
        }
    }
}

package StacksAndQueues;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * Created by radha on 9/25/16.
 */
public class MyStack<T> {

    private class StackNode<T> {
        public T data;
        public StackNode next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    public StackNode<T> top;

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T item  = top.data ;
        top = top.next;
        return item;
    }

    public void push(T newItem) {
        StackNode<T> newTop = new StackNode(newItem);
        newTop.next = top;
        top = newTop;
    }

    public T peek() {
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }



}

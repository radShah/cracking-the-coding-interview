package StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;
import java.util.jar.Pack200;

/**
 * Created by radha on 11/6/16.
 */
public class SetOfStacks {
    ArrayList<Stack<Object>> stacks;
    Stack currentStack;
    int capacity;

    public SetOfStacks(int capacity) {
        stacks = new ArrayList();
        currentStack = null;
        this.capacity = capacity;
    }

    public Object push(Object o) {
        if (currentStack != null  && currentStack.size() <= capacity) {
            currentStack.push(o);
        } else {
            currentStack = new Stack();
            stacks.add(currentStack);
            currentStack.push(o);
        }
        return o;
    }

    public Object pop() {
        if (currentStack != null) {
            if (!currentStack.isEmpty()) {
                Object o = currentStack.pop();
            } else {
                stacks.remove(currentStack);
                int prevStack = stacks.indexOf(currentStack) - 1;
                if (prevStack >= 0) {
                    currentStack = stacks.get(prevStack);
                    currentStack.pop();
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public void popAt(int stackNum) {
        Stack stack = stacks.get(stackNum);
        stack.pop();
        leftShift(stackNum);
    }

    public void leftShift(int stackIndex) {
        for (int i = stackIndex; i < stacks.size(); i++) {
            Stack currentStack = stacks.get(i);
            Stack nextStack = stacks.get(i+1);
            currentStack.push(nextStack.pop());
        }
    }

}

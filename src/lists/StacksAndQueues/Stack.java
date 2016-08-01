package lists.StacksAndQueues;

import lists.LinkedList;

public class Stack implements StacksAndQueues {
    private LinkedList mainQueue = new LinkedList();
    
    @Override
    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }
    
    @Override
    public String pop() {
        String temp = mainQueue.get(0);
        mainQueue.delete(0);
        return temp;
    }
    
    @Override
    public void push(String value) {
        if (mainQueue.size() > 0) {
        mainQueue.add(value, 0);
        } else {
            mainQueue.add(value);
        }
    }
    
    @Override
    public void clear() {
        mainQueue.clear();
    }
    
    public void print() {
        mainQueue.printList(mainQueue);
    }
}

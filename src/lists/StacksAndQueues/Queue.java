package lists.StacksAndQueues;

import lists.LinkedList;

public class Queue implements StacksAndQueues {
    private LinkedList mainStack = new LinkedList();
    
    @Override
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
    
    @Override
    public String pop() {
        String temp = mainStack.get(0);
        mainStack.delete(0);
        return temp;
    }
    
    @Override
    public void push(String value) {
        mainStack.add(value);
    }
    
    @Override
    public void clear() {
        mainStack.clear();
    }
    
    public void print() {
        mainStack.printList(mainStack);
    }
}

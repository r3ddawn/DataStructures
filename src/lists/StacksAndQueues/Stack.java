package lists.StacksAndQueues;

import lists.LinkedList;

public class Stack implements StacksAndQueues {
    private LinkedList mainStack = new LinkedList();
    
    @Override
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
    
    @Override
    public String pop() {
        String returnValue = mainStack.head.value;
        
        if (mainStack.size() > 0) {
            mainStack.head = mainStack.head.next;
            return returnValue;
        } else {
            mainStack = null;
        }
        return returnValue;
    }
    
    @Override
    public void push(String value) {
        if (mainStack.size() > 0) {
        mainStack.add(value, 0);
        } else {
            mainStack.add(value);
        }
    }
    
    @Override
    public void clear() {
        mainStack.clear();
    }
    
    public void print() {
        mainStack.printList(mainStack);
    }
}

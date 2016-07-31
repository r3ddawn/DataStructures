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
        
        if (mainStack.size() > 1) {
        mainStack.head = mainStack.head.next;
        return returnValue;
        } else {
            mainStack = null;
            return returnValue;
        }
    }
    
    @Override
    public void push(String value) {
        mainStack.add(value, 0);
    }
    
    @Override
    public void clear() {
        mainStack.clear();
    }
    
    public void print() {
        mainStack.printList(mainStack);
    }
}

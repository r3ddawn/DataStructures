package lists;

public class LinkedList implements List {
    public static class Node {
        public Node next = null;
        public String value;
        
        public Node(String value) {
            this.value = value;
        }
    }
    
    public Node head, tail;
    private int size;
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String get(int index) {
        checkBounds(index);
        Node current = head;
        
        for (int i = 0; i < index && i < size; i++) {
            current = current.next;
        }
        return current.value;
    }
    
    @Override
    public void add(String value) {
        Node newNode = new Node(value);
        
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    
    @Override
    public void add(String value, int index) {
        checkBounds(index);
        Node newNode = new Node(value);
        
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        Node current = head;
        Node previous = head;
        
        if (index == 0) {
            head = newNode;
            head.next = current;
            size++;
        } else {
            for (int x = 0; x < size && x < index; x++) {
                previous = current;
                current = current.next;
            }
            previous.next = newNode;
            newNode.next = current;
            size++;
            }
    }
    
    @Override
    public void delete(int index) {
        checkBounds(index);
        // Tests and deletion for a list with only one value
        if (size == 1) {
                head = null;
                size = 0;
                return;
            }
        // Test & deletion if the head index is being deleted
        if (index == 0){
                head = head.next;
                size--;
                return;
        }
        // Deletion for all other indexes and sizes
        Node indexNode = head;
        Node previousIndexNode = head;
        
        for (int i = 0; i < size - 1 && i < index; i++) {
            previousIndexNode = indexNode;
            indexNode = indexNode.next;
        }
        previousIndexNode.next = indexNode.next;
        size--;
    }
    
    @Override
    public void clear() {
        head = null;
        size = 0;
    }
    
    public LinkedList toList (int[] x) {
        LinkedList list = new LinkedList();
        
        for (int i = 0; i < x.length; i++) {
            list.add(Integer.toString(x[i]));
        }
        return list;
    }
    
    public void printList (LinkedList list) {
        for (int x = 0; x < size; x++) {
            // Check for formatting
            if (x == size - 1) {
                System.out.println(list.get(x));
                return;
            }
            System.out.print(list.get(x) + ", ");
        }
    }
    private void checkBounds (int index) {
        if ( size == 0 || index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }
}

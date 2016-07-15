//package lists;
//
//public class JLinkedList implements List {
//    private static class Node {
//        public Node next = null;
//        public String value;
//        
//        public Node(String value) {
//            this.value = value;
//        }
//    }
//    
//    private Node first, mid, tail;
//    private int size = 0;
//    
//    @Override
//    public int size() {
//        return size;
//    }
//    
//    @Override
//    public boolean isEmpty() {
//        return size == 0;
//    }
//    
//    @Override
//    public String get(int index) {
//        Node current = first;
//        
//        for (int i = 0; i < index && i < size; i++) {
//            current = current.next;
//        }
//        
//        return current.value;
//    }
//    
//    @Override
//    public void add(String value) {
//        Node newNode = new Node(value);
//        
//        if (isEmpty()) {
//            first = newNode;
//        }
//        else {
//            Node current = first;
//
//            for (int i = 0; i < size - 1; i++) {
//                current = current.next;
//            }
//        
//            current.next = newNode;
//        }
//        
//        ++size;
//    }
//    
//    @Override
//    public void delete(int index) {
//        
//    }
//    
//    @Override
//    public void clear() {
//        
//    }
//
//}

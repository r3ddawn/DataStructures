package lists;

public class Main {
    public static void main(String[] args) {
//        List array = new Array();
//        List linkedList = new LinkedList();
        LinkedList testList = new LinkedList();

        testList.add("Hello");
        testList.add("Goodbye");
        testList.add("Baseball");
        testList.add("Football");
        testList.add("Soccer");
        
        testList.printList(testList);
    }
}

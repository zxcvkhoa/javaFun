public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.add(6);
        sll.add(9);
        sll.add(23);
        sll.add(7);
        sll.add(25);
        sll.add(13);
        sll.find(23);
        sll.printValues();
    }
}
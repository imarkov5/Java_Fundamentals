public class SLLTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addBack(3);
        sll.addFront(4);
        sll.addFront(10);
        sll.addBack(5);
        sll.addFront(15);
        sll.addBack(20);
        sll.removeBack();
        sll.removeBack();
        sll.displayValues();
    }
}

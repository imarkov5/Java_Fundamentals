public class SLLTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addBack(3);
        sll.addBack(4);
        sll.displayValues();
        sll.addFront(2);
        sll.addFront(1);
        sll.displayValues();
        System.out.println(sll.contains(4));
        System.out.println(sll.contains(5));
        sll.removeBack();
        sll.displayValues();
        sll.removeFront();
        sll.displayValues();
        
    }
}

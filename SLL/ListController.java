public class ListController {
    public static void main(String[] args) {

        //we can create a SLL without a function:
        // Node newNode = new Node(19);
        // Node newNode2 = new Node(29);
        // newNode.next = newNode2;

        SLL sll = new SLL();
        sll.addToList(20);
        sll.addToList(21);
        sll.addToList(22);
        sll.addToList(23);
        sll.addToList(24);
        sll.addToList(25);
        sll.addToList(26);

        sll.displayList();
        System.out.println(sll.searchList(22));
        System.out.println(sll.searchList(24));
        sll.removeFromEndOfList();
        sll.displayList();
        sll.removeAt(2);
        sll.displayList();
    }
}
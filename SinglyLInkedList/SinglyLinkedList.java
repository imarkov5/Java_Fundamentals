public class SinglyLinkedList {
    private SLLNode head;
    public SinglyLinkedList(){
        this.head = null;
    }
    private boolean isEmpty(){
        return this.head == null;
    }
    //SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void addFront(int value){
        SLLNode newNode = new SLLNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addBack(int value){
        SLLNode newNode = new SLLNode(value);
        if(head == null){
            head = newNode;
        } else {
            SLLNode runner = this.head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public boolean contains(int value){
        SLLNode runner = this.head;
        while(runner != null){
            if(runner.value == value){
                return true;
            }
            runner = runner.next;
        }
        return false;
    }
    public void removeFront(){
        if(isEmpty()){
            return;
        }
        head = head.next;
    }
    public Integer removeBack(){
        SLLNode runner = head;
        int valToReturn;
        //if we have 0 nodes, return null
        if(isEmpty()){
            return null;
        }
        //if there is just one node, remove head
        if(head.next == null){
            valToReturn = head.value;
            head = null;
            return valToReturn;
        }
        //otherwise, loop til we are right before the last node
        while(runner.next.next != null){
            runner = runner.next;
        }
        valToReturn = runner.next.value;
        runner.next = null;
        return valToReturn;
    }
    public void displayValues(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        SLLNode runner = this.head;
        while(runner.next != null){
            System.out.println("***********************************");
            String s = String.format("Node Value: %d :: Next Value: %d", runner.value, runner.next.value);
            System.out.println(s);
            runner = runner.next;
        }
        System.out.println("**************************************");
        String s = String.format("Node Value: %d :: Next Value: null", runner.value);
        System.out.println(s);
    }
}

public class DLL {
    public Node head;
    public Node tail;

    public DLL(){
        this.head = null;
        this.tail = null;
    }

    //adding node to the end of the list
    public void push(Node newNode){
        //if there is no head in the list, the newNode becomes the head and tail od the list
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        //find the lastNode in the list
        //set the lstNOde's next to be the newNode
        //set the previous of the lastNode to the lastNode that we found previously
        //set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    public void printValuesForward(){
        //find the first node (head)
        Node current = this.head;

        //while the current node exists..
        while(current != null){
            //print it's value
            System.out.println(current.value);
            //move to the next node
            current = current.next;
        }
    }
}

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    public Node remove() {
        Node runner = this.head;
        while(runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
        return this.head;
    }
    public void printValues() {
        Node runner = this.head;
        while(runner.next != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }

    }
    // public Node removeAt(int value) {
        
    // }
    // public Node find(int target) {
    //     Node runner = this.head;
    //     while(runner.next != null) {
    //         if(runner.next.value == target) {
    //             return runner.next;
    //         } else if(runner.next.value != target) {
    //             runner = runner.next;
    //         }
    //     }
    // }
    



}
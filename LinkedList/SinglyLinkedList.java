public class SinglyLinkedList<T> {
    Node head;
    int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void display() {
        Node curr = this.head;
        while(curr.next != null) {
            System.out.print(String.format("%s -> ", curr.data));
            curr = curr.next;
        }
        System.out.print(String.format("%s\n", curr.data));
    }

    public void insert(T data) {
        Node temp = new Node<T>(data);
        if(this.size == 0) {
            this.head = temp;
        }
        else {
            temp.next = this.head;
            this.head = temp;
        }
        this.size++;
    }

    public void append(T data){
        Node temp = new Node<T>(data);
        Node currentNode =  head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = temp;
        this.size++;
    }
}

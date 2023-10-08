public class SinglyLinkedList<T> {
    Node head;
    int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }

    //Method to display the Linked List
    public void display() {
        Node curr = this.head;
        while(curr.next != null) {
            System.out.print(String.format("%s -> ", curr.data));
            curr = curr.next;
        }
        System.out.print(String.format("%s\n", curr.data));
    }

    //Method to insert a node at the begining
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

    //Method to insert a node at the End
    public void append(T data){
        Node temp = new Node<T>(data);
        Node currentNode =  head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = temp;
        this.size++;
    }

    //Method to add a node at a position
    public void update(T data, int pos){
        Node temp = new Node<T>(data);
        Node currentNode = head;
        int position = 1;
        while (position < pos - 1) {
            currentNode = currentNode.next;
            position++;
        }
        temp.next = currentNode.next;
        currentNode.next = temp;
        this.size++;
    }

    //Method to delete from the start
    public void delete(){
        if(this.size < 2){
            System.out.println("There is no list to delete!!");
        }else{
            head = head.next;
        }
    }

    //Method to delete from the end
    public void pop() {
        if (head == null) {
            System.out.println("There is no list to delete!!");
            return;
        }
        if (head.next == null) {
            head = null;
            this.size--;
            return;
        }
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        this.size--;
    }

    //Method to add a node at a position
    public void remove(int pos){
        Node currentNode = head;
        int position = 1;
        while (position < pos - 1) {
            currentNode = currentNode.next;
            position++;
        }
        currentNode.next = currentNode.next.next;
        this.size--;
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList<Integer>();
        for(int i = 1; i < 5; i++) {
            list.insert(i);
        }
        list.display();
    }
}

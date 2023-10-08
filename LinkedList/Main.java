public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList<Integer>();
        list.insert(1);
        list.append(4);
        list.update(3,2);
        list.update(2, 2);
        list.display();
        list.delete();
        list.pop();
        list.remove(2);
        list.display();
    }
}

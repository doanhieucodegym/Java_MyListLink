public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("//=//=//=/= TESTING /=/=/=/=");
        MyLinkedList listLink =new MyLinkedList(10);
        listLink.addFirst(11);
        listLink.addFirst(12);
        listLink.addFirst(13);

        listLink.add(4,9);
        listLink.add(4,7);
        listLink.printList();
    }
}

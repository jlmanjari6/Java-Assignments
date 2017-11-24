package linkedlists;

/**
 * @author Lakshmi Manjari Alapati
 */
public class Tester {

    public static void main(String[] args) {
        Alapati_ALinkedList<Integer> intList = new Alapati_ALinkedList<>();

        intList.addFirst(17);
        intList.addFirst(25);
        intList.addFirst(47);
        intList.removeFirst();
        intList.addFirst(55);

        System.out.println("Contents of linked list\n"
                + (intList.isEmpty() ? "list is empty" : intList));

        while (!intList.isEmpty()) {
            System.out.println("Deleting " + intList.removeFirst());
        }
        System.out.println();
        System.out.println("Contents of linked list\n"
                + (intList.isEmpty() ? "list is empty" : intList));
    }
}

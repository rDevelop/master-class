package us.rlit.linked.lists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");


        "rob".hashCode();
        printList(placesToVisit);

        placesToVisit.add(placesToVisit.indexOf("Perth"), "Chicago");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> list) {
        System.out.println("Size of list: " + list.size());
        Iterator<String> it = list.iterator();
        while( it.hasNext()) {
            System.out.println("Visiting " + it.next());
        }
        System.out.println();
    }
}

package us.rlit.linked.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String[] args) {
        /*
        Linked list great for adding lots, sorting, moving data
         */
        /*
        Java implemented a double linked list to go back and forth.
         */

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        printList(placesToVisit);
        //playWithLinkedList();
        //inOrder();
        visit(placesToVisit);


    }

    public static void visit(LinkedList cities) {

        ///
        // NEED TO TRACK CURSOR DIRECTION TO MOVE BACK AND FORTH
        boolean forward = true;
        System.out.println();
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> it = cities.listIterator();
        if ( cities.isEmpty()) {
            System.out.println( "No cities in itinerary\n");
            return;
        } else {
            System.out.printf("Now visiting " + it.next() + "\n");
            printMenu();
        }
        while(!quit) {
            int action = s.nextInt();
            s.nextLine();
            switch( action ) {
                case 0:
                    System.out.println("Vacation over\n");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(it.hasNext()) {
                            it.next();
                        }
                        forward = true;
                    }
                    if(it.hasNext()) {
                        System.out.printf("Now visiting " + it.next() + "\n");
                    } else {
                        System.out.println("Reached end of the list\n");
                    }
                    break;
                case 2:
                    if(forward) {
                        if(it.hasPrevious()) {
                            it.previous();
                        }
                        forward = false;
                    }
                    if(it.hasPrevious()) {
                        System.out.printf("Now visiting " + it.previous() + "\n");
                    } else {
                        System.out.println("Reached end of the list\n");

                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    public static void printMenu() {
        System.out.println("Actions:");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
    }

    public static void inOrder() {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addinOrder(placesToVisit,"Sydney");
        addinOrder(placesToVisit,"Melbourne");
        addinOrder(placesToVisit,"Brisbane");
        addinOrder(placesToVisit,"Perth");
        addinOrder(placesToVisit,"Adelaide");
        addinOrder(placesToVisit,"Adelaide");
        addinOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        
    }

    private static void playWithLinkedList() {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        printList(placesToVisit);

        placesToVisit.add(placesToVisit.indexOf("Perth"), "Chicago");
        printList(placesToVisit);

        placesToVisit.remove(6);
        printList(placesToVisit);

        placesToVisit.replaceAll(c -> {
            if (c.contains("a")) {
                return c;
            }
            return "CANCELLED";
        });
        printList(placesToVisit);
        placesToVisit.add(placesToVisit.size()/2, "Vatican");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> list) {
        System.out.println("Size of list: " + list.size());
        Iterator<String> it = list.iterator();
        while( it.hasNext()) {
            System.out.println("Now visiting " + it.next());
        }
        System.out.println("===============================");
    }

    private static boolean addinOrder(LinkedList<String> list, String newCity) {
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
            int comparison  = it.next().compareTo(newCity);
            if( comparison == 0) {
                System.out.println(newCity + " already in list");
                return false;
            } else if ( comparison > 0){
                // greater is after previous so add.
                // get previous entry since next already moved iterator
                it.previous();
                it.add(newCity);
                return true;
            }
        }
        // add city to end
        it.add(newCity);
        return true;
    }

}

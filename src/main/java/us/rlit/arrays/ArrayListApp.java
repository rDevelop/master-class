package us.rlit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListApp {

    private static Scanner s = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while(!quit) {
            System.out.println("Enter your choice:");
            choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case 0:
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    groceryList.printGroceryList();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    processArrayList();
                    break;
                case 99:
                    quit = true;
                    break;
            }
        }
    }

    public static void addItem() {
        System.out.println("Enter item:");
        groceryList.addGroceryItems(s.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter existing item");
        String oldItem = s.nextLine();
        System.out.println("Enter new Item:");
        String newItem = s.nextLine();

        groceryList.modifyGroceryList(oldItem,newItem);

    }

    public static void removeItem() {
        System.out.println("Enter Item");
        String item = s.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}

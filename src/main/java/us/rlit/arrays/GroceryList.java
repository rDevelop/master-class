package us.rlit.arrays;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItems(String item) {
        groceryList.add(item);
    }

//    public String findItem(String item) {
//        String found = null;
//        int position = groceryList.indexOf(item);
//        if( position >= 0) {
//            found = groceryList.get(position);
//        }
//        return found;
//    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items");
        for(int i=0; i < groceryList.size(); i++) {
            System.out.println(i+1 + ". " + groceryList.get(i));
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);

    }
    public void removeGroceryItem(String item){
        int pos = findItem(item);
        if(pos >= 0) {
            removeGroceryItem(pos);
        }
    }

    public void modifyGroceryList(String currentItem, String newItem) {
        int pos = findItem(currentItem);
        if(pos >= 0) {
            modifyGroceryList(pos, newItem);
        }
    }
    private void modifyGroceryList(int pos, String item) {
        groceryList.set(pos, item);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String item) {
        if(findItem(item) >= 0) {
            return true;
        }
        return false;
    }
}

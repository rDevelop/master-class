package us.rlit.abstracts.challenge;

/**
 * Created by rob on 11/28/2018.
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}

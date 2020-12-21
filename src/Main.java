import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // To-do List
        // Field to enter items
        // New item button
        // Delete item button
        // Cross off when completed

        // if (types 'add') {
        //      ItemsToDo.addItems();
        // } else if (types 'delete') {
        //      ItemsToDo.deleteItems();
        // } else if (types 'strike') {
        //      ItemsToDo.strikethroughItems();
        // } else if (types 'print') {
        //      ItemsToDo.printItems
        // }
    }

    public static class ItemsToDo {
        ArrayList<String> itemsToBeAdded = new ArrayList<>();

        public static void addItems() {
            ArrayList<String> itemsInTheList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Please enter an item: ");
                itemsInTheList.add(scanner.next());
                System.out.println(itemsInTheList);

                // User enters add to enter another item
                // Program should stop after every input
            }
        }

        public void deleteItems() {
            ArrayList<String> itemsInTheList = new ArrayList<>();
            // Print list of items
            // Enter which item to delete
        }

        public static void strikethroughItems() {
            ArrayList<String> itemsInTheList = new ArrayList<>();
        }

        public static void printItems() {

        }
    }
}
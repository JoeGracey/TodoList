import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Field to enter items
        // New item button
        // Delete item button
        // Cross off when completed

        // if (0) {
        //      ItemsToDo.addItems();
        // } else if (1) {
        //      ItemsToDo.deleteItems();
        // } else if (2) {
        //      ItemsToDo.strikethroughItems();
        // } else if (3) {
        //      ItemsToDo.printItems();
        // } else if (4) {
        //      ItemsToDo.listItems();
        // }
    }

    public static class ItemsToDo {
        ArrayList<String> itemsToBeAdded = new ArrayList<>();

        public static void listMenu() {
            System.out.println("ToDo List Menu");
            System.out.println("0 - Add a new item");
            System.out.println("1 - Delete an item");
            System.out.println("3 - Cross off an item");
            System.out.println("4 - List all items");
        }

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

        public static void listItems() {

        }
    }
}
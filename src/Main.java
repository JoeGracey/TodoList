import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ItemsToDo.listMenu();
        ItemsToDo.listMenuOptions();
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

        public static void listMenuOptions() {
            Scanner scanner = new Scanner(System.in);
            int menuNumberEntered = scanner.nextInt();

            if (menuNumberEntered == 0) {
                ItemsToDo.addItems();
            } else if (menuNumberEntered == 1) {
                ItemsToDo.deleteItems();
            } else if (menuNumberEntered == 2) {
                ItemsToDo.strikethroughItems();
            } else if (menuNumberEntered == 3) {
                ItemsToDo.printItems();
            } else if (menuNumberEntered == 4) {
                ItemsToDo.listItems();
            }
        }

        public static void addItems() {
            ArrayList<String> itemsInTheList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter an item: ");
            itemsInTheList.add(scanner.next().toLowerCase());
            System.out.println(itemsInTheList);
            System.out.print("Add another item? Y/N ");
            char addAnotherItem = scanner.next().charAt(0);

            if (addAnotherItem == 'y') {
                addItems();
            } else if (addAnotherItem == 'n') {

            } else {
                System.out.print("Please enter 'Y' or 'N'");
                addItems();
            }
            // Option to stop adding item
        }

        public static void deleteItems() {
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
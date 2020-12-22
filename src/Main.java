import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ItemsToDo.listMenu();
        ItemsToDo.listMenuOptions();
    }

    public static class ItemsToDo {
        //ArrayList<String> itemsToBeAdded = new ArrayList<>();

        public static void listMenu() {
            System.out.println("ToDo List Menu");
            System.out.println("0 - Add a new item");
            System.out.println("1 - Delete an item");
            System.out.println("2 - Cross off an item");
            System.out.println("3 - List all items");
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
                listMenuOptions();
            } else {
                System.out.print("Please enter 'Y' or 'N'");
                addItems();
            }
        }

        public static void deleteItems() {
            //ArrayList<String> itemsInTheList = new ArrayList<>();
            // Print list of items
            // Enter which item to delete
            System.out.println("deleteItems");
        }

        public static void strikethroughItems() {
            //ArrayList<String> itemsInTheList = new ArrayList<>();
            System.out.println("strikethroughItems");
        }


        public static void listItems() {
            System.out.println("listItems");
        }
    }
}
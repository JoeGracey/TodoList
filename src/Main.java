import java.util.*;

public class Main {

    public static void main(String[] args) {
        ItemsToDo.listingMenuOptions();
    }

    public static class ItemsToDo {
        static ArrayList<String> itemsInTheList = new ArrayList<>();
        public static Scanner scanner = new Scanner(System.in);
        static int menuNumberEntered;
        static char addAnotherItem;

        public static void listingMenuOptions() {
            menuItems();
            menuNumberEntered = scanner.nextInt();

            if (menuNumberEntered == 0) {
                ItemsToDo.addItems();
            } else if (menuNumberEntered == 1) {
                ItemsToDo.deleteItems();
            } else if (menuNumberEntered == 2) {
                ItemsToDo.listItems();
            } else if (menuNumberEntered == 3) {
                ItemsToDo.indexOf();
            }
        }

        public static void addItems() {
            enteringAnItem();

            System.out.print("Add another item? Y/N ");
            addAnotherItem = scanner.next().toLowerCase().charAt(0);

            if (addAnotherItem == 'y') {
                addItems();
            } else if (addAnotherItem == 'n') {
                listingMenuOptions();
            } else {
                System.out.println("Please enter 'Y' or 'N'");
                addItems();
            }
        }

        public static void deleteItems() {
            System.out.println("Enter the item you want to delete: ");
            boolean doesItContain = itemsInTheList.contains(scanner.next());
            if (doesItContain) {
                System.out.println("True");
                //System.out.println(itemsInTheList.);
            } else {
                System.out.println("False");
            }
        }

        public static void indexOf() {
            System.out.println("Size of list: " + itemsInTheList.size());
        }


        public static void listItems() {
            System.out.println(Arrays.toString(itemsInTheList.toArray()));
        }

        public static void menuItems() {
            System.out.println("What would you like to-do?");
            System.out.println("Press 0: Add a new item");
            System.out.println("Press 1: Delete an item");
            System.out.println("Press 2: List all items");
            System.out.println("Press 3: Quit");
        }

        public static void enteringAnItem() {
            System.out.println("Please enter an item: ");
            itemsInTheList.add(scanner.next());
            System.out.println(itemsInTheList);
        }
    }


}
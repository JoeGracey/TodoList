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
            mainMenu();
            menuNumberEntered = scanner.nextInt();

            if (menuNumberEntered == 0) {
                System.out.println();
                ItemsToDo.addItems();
            } else if (menuNumberEntered == 1) {
                ItemsToDo.deleteItems();
            } else if (menuNumberEntered == 2) {
                System.out.println();
                ItemsToDo.listItems();
            } else if (menuNumberEntered == 3) {
                System.out.println();
                ItemsToDo.indexOf();
            }
        }

        public static void addItems() {
            enteringAnItem();

            System.out.println("Add another item? Y/N ");
            addAnotherItem = scanner.next().toLowerCase().charAt(0);

            if (addAnotherItem == 'y') {
                System.out.println();
                addItems();
            } else if (addAnotherItem == 'n') {
                System.out.println();
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
            } else {
                System.out.println("False");
            }
        }

        public static void indexOf() {
            System.out.println("Size of list: " + itemsInTheList.size());
        }


        public static void listItems() {
            System.out.println("Here is your list so far: " + Arrays.toString(itemsInTheList.toArray()));
            System.out.println();
            listingMenuOptions();
        }

        public static void mainMenu() {
            System.out.println("MAIN MENU");
            System.out.println("-------------------------");
            System.out.println("Press 0 to Add a new item");
            System.out.println("Press 1 to Delete an item");
            System.out.println("Press 2 to List all items");
            System.out.println("Press 3 to Quit");
            System.out.println("-------------------------");
        }

        public static void enteringAnItem() {
            System.out.println("Please enter an item: ");
            itemsInTheList.add(scanner.next());
            System.out.println("To-do List: " + itemsInTheList);
            System.out.println();
        }
    }


}
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
                System.out.println();
                ItemsToDo.deleteItems();
            } else if (menuNumberEntered == 2) {
                System.out.println();
                ItemsToDo.listItems();
            } else if (menuNumberEntered == 3) {
                System.out.println();
                ItemsToDo.exitApp();
            }
        }

        public static String itemName() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
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
            itemsInTheList.remove(ItemsToDo.itemName());
            System.out.println("To-do List: " + Arrays.toString(itemsInTheList.toArray()));
        }

        public static void exitApp() {

        }


        public static void listItems() {
            System.out.println("To-do List: " + Arrays.toString(itemsInTheList.toArray()));
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
            String itemName = ItemsToDo.itemName();
            itemsInTheList.add(itemName);
            System.out.println("To-do List: " + itemsInTheList);
            System.out.println();
        }
    }


}
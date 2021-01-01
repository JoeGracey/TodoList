import java.util.*;

public class Main {
    static ArrayList<String> itemsInTheList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    static int menuNumberEntered;
    static char addAgain;

    public static void main(String[] args) {
        displayMenu(); // display options 0 - 3
        getNumberInput(); // directing users number choice
        addItemToList(); // user enters item in to-do list
        enterAnotherItem(); // ask user if they want to enter another item
        addAnotherItem(); // directing users 'y' or 'n' choice
    }

    public static void displayMenu() {
        System.out.println("MAIN MENU");
        System.out.println("-------------------------");
        System.out.println("Press 0 to Add a new item");
        System.out.println("Press 1 to Delete an item");
        System.out.println("Press 2 to List all items");
        System.out.println("Press 3 to Exit");
        System.out.println("-------------------------");
    }

    public static void getNumberInput() {
        menuNumberEntered = scanner.nextInt();
        switch (menuNumberEntered) {
            case 0:
            case 1:
                enterAnItem(); // addItem() and deleteItem()
                break;
            case 2:
                listItems();
                break;
            case 3:
                exitApp();
                break;
            default:
                System.out.println("Please select 0, 1, 2 or 3");
        }
    }

    public static void enterAnItem() { // runs after 0 or 1 are pressed
        System.out.println("Please enter an item: ");
    }

    public static void addItemToList() {
        String itemName = itemName();
        itemsInTheList.add(itemName);
        System.out.println("To-do List: " + itemsInTheList);
    }

    public static String itemName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void addAnotherItem() {
        addAgain = scanner.next().toLowerCase().charAt(0);
        switch (addAgain) {
            case 'y':
                addItemToList();
                break;
            case 'n':
                displayMenu();
                break;
            default:
                System.out.println("Please enter 'Y' or 'N'");
                enterAnotherItem();
                break;
        }
    }

    public static void deleteItems() {
        enterAnItem();
        itemsInTheList.remove(itemName());
        System.out.println("To-do List: " + Arrays.toString(itemsInTheList.toArray()));
    }

    public static void enterAnotherItem() {
        System.out.println("Add another item? 'Y' or 'N'");
    }

    public static void listItems() {
        System.out.println("To-do List: " + Arrays.toString(itemsInTheList.toArray()));
        System.out.println();
    }

    public static void exitApp() {
        return;
    }
}
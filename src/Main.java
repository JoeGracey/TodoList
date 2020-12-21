import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // To-do List
        // Field to enter items
        // New item button
        // Delete item button
        // Cross off when completed
        enterItems.inputItems();
    }

    public static class enterItems {

        public static void inputItems() {

            ArrayList<String> itemsToBeAdded = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Please enter an item: ");
                itemsToBeAdded.add(scanner.next());
                System.out.println(itemsToBeAdded);
            }
        }
    }
}
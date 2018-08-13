import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList
{

    private  ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args)

    {

        ShoppingList myshoppingList = new ShoppingList();
        myshoppingList.run();

    }

    private void run ()
    {
        System.out.println("Starting Shopping list");
        printMenu();

        Scanner scanner = new Scanner(System.in);
        String newList;


        boolean myListStop = false;

        do {
            System.out.println("Please enter your command");

            newList = scanner.nextLine();


            String[] words = newList.split(" ");
            String item = words[0].toUpperCase();

            myListStop = newList.equalsIgnoreCase("STOP");

            switch (item) {
                case "ADD":
                    String itemName = words[1];
                    names.add (itemName);
                    break;

            case "PRINT" :
                int index = 0;
                for(String name:names)

                {
                    System.out.println(index + " : " + name);
                    index++;
                }

                break;

                case "Remove":
if (words.length == 2)

{
    int itemToRemove = Integer.parseInt(words[1]);
    names.remove(itemToRemove);
}
else
    {
        System.out.println("Illegal command.");
}
                    break;

                  case "CLEAR":
                    names.clear();
                    break;

                case "EXIT":
                    System.out.println("Bye!");
                    myListStop = true;
                    break;

            default:
    System.out.println("Please enter a valid command");
    break;

            }

        } while (!myListStop);

        System.out.println(" List Complete:" + names);
    }


public void printMenu()
{

    System.out.println("Enter on fo the following commands");
    System.out.println("Add <item name>");
    System.out.println("Print");
    System.out.println("Remove <index>");
    System.out.println("Clear");

}





}




import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item.items.add(new Item("Kefyras", 1.50, "Pieno produktai"));
        Item.items.add(new Item("Makaronai", 0.99, "Bakaleja"));
        Item.items.add(new Item("Saukstas", 0.69, "Stalo irankiai"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Sveiki atvykę į parduotuvę!");
        while (true) {
            info(); // klausiam pasirinkimo
            int input = sc.nextInt();// padaryti try catch
            sc.nextLine();
            switch (input) {
                case 1:
                    Item.print();// print f-ja kvieciama is Item klases
                    break;
                case 2:
                    Item.createItem();
                    break;
                case 3:
                    Item.editItem();
                    break;
                case 4:
                    Item.deleteItem();
                    break;
                case 5:
                    System.exit(1);
                    break;
                case 6:
                    Item.categorylist();
                    break;
               //ase 7:
                 // Item.itemsInCategory();

            }

        }
    }
// extra: padaryti switch'e optionus, "pamatyti kategorijų sąrašą" ir "atvaizduoti X kategorijos prekes" */




    //=============End of the code============

    public static void info() {
        System.out.println("Kokį veiksmą norite atlikti?");
    }

//====================End of the file ===========
}
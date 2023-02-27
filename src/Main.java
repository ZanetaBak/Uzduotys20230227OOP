import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sveiki atvykę į parduotuvę!");
        while (true) {
            info();
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    Item.print();
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

            }
        }
    }


    public static void info() {
        System.out.println("Kokį veiksmą norite atlikti?");
    }


    //=============End of the code============
}
//====================End of the file ===========
}
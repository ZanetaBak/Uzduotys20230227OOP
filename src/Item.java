import java.util.ArrayList;
import java.util.Scanner;

public class Item {

///* class Item
//id
//title
//price
//category
// extra: padaryti switch'e optionus, "pamatyti kategorijų sąrašą" ir "atvaizduoti X kategorijos prekes" */

public static ArrayList<Item> items = new ArrayList<>();
    private static Item fakeItem = new Item();
    private static Scanner sc = new Scanner(System.in);
    private static int idCount = 1;

    private int id;
    private String title;
    private Double price;
    private String category;

        public Item(){
            this.id = idCount++;
        }
    public static void deleteItem (){
        System.out.println("Prekės, kurią trinsim, id");
        items.remove(find(sc.nextInt()));
        sc.nextLine();
    }

    public static void editItem(){
        System.out.println("Prekės id");
        Item x = find(sc.nextInt());
        System.out.println("Pavadinimas");
        x.title = sc.nextLine();
        sc.nextLine();
        System.out.println("Kaina");
        x.price = sc.nextDouble();
        sc.nextDouble();
        System.out.println("Kategorija");
        x.category = sc.nextLine();
        sc.nextLine();
    }
    public static Item find(int id){
        for ( Item x: items) {
            if(x.id == id){
                return x;
            }
        }
        return fakeItem;
    }

    public static void createItem(){
        Scanner sc = new Scanner(System.in);
        Item x = new Item();

        System.out.println("Pavadinimas");
        x.title = sc.nextLine();
        sc.nextLine();
        System.out.println("Kaina");
        x.price = sc.nextDouble();
        System.out.println("Kategorija");
        x.category = sc.nextLine();
        items.add(x);
    }

    public static void print(){
            for (Item x:items){
                System.out.println(x);
            }
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ". Pavadinimas:'" + title + '\'' +
                ", kaina: " + price +
                ", kategorija:" + category + '\'' +
                '}';
    }
}

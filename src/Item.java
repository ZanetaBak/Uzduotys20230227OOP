import java.util.ArrayList;
import java.util.Scanner;

public class Item {

///* class Item
//id
//title
//price
//category
// extra: padaryti switch'e optionus, "pamatyti kategorijų sąrašą" ir "atvaizduoti X kategorijos prekes" */
    // pasidaryti validacija

public static ArrayList<Item> items = new ArrayList<>();
    private static Item fakeItem = new Item();
    private static Scanner sc = new Scanner(System.in);
    private static int idCount = 1;

    private int id;
    private String title;
    private Double price;
    private String category;

        public Item(){ // kiekviena karta sukuriant preke padides idCount
            this.id = idCount++;
        }
    public static void deleteItem (){
        System.out.println("Prekės, kurią trinsim, id");
        items.remove(find(sc.nextInt()));
        sc.nextLine();
    }

    public static void editItem(){
        System.out.println("Prekės id");
        Item x = find(sc.nextInt());// irasom knygos, kuria norim surasti id
        System.out.println("Pavadinimas");
        x.title = sc.nextLine();
        sc.nextLine();
        System.out.println("Kaina");
        x.price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kategorija");
        x.category = sc.nextLine();
        sc.nextLine();
    }
    public static Item find(int id){
        for (Item x: items) {
            if(x.id == id){
                return x;
            }
        }
        return fakeItem;
    }

    public static void createItem(){
         Item x = new Item();
        System.out.println("Pavadinimas");
        x.title = sc.nextLine();
        sc.nextLine();
        System.out.println("Kaina");
        x.price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kategorija");
        x.category = sc.nextLine();
        sc.nextLine();
        items.add(x);// pridedam preke i ArrayList masyva
    }

    public static void print(){
            for (Item x:items){
                System.out.println(x);
            }

        // 6 listCategories(); Du ciklai - vienas isrinkti kategorijas is masyvo, o kitas -printinti sarasa


    }

    public static void categorylist() {
        System.out.println("Kategorijų sąrašas");
        ArrayList<String> categoryList = new ArrayList<>();
        for (Item item : items) {
                if (!categoryList.contains(item.category)) {
                    categoryList.add(item.category);
                }
            }
            for (int i = 0; i < categoryList.size(); i++) {
                System.out.println(categoryList.get(i) + " ");
            }

        System.out.println();
    }



    //                    7.itemsInCategory();

    public static void itemsInCategory() {
        System.out.println("Pasirinktos kategorijos prekes");

        //for ( Item x: items) {
        //  if(x.category == id){
        //    return x.title;
        //}
        //}
        //return fakeItem;
        // }

    }

    public Item(String title, double price, String category){// default prekes
            this.id = idCount++;
            this.title = title;
            this.price = price;
            this.category = category;
}

    @Override
    public String toString() {
        return   id +
                ". Pavadinimas:'" + title + '\'' +
                ", kaina: " + price +
                ", kategorija: '" + category + '\'';
    }
}



package assignment2_2;
import java.util.ArrayList;
public class Task1 {

    public static class GroceryListManager {
        private ArrayList<String> groceryList = new ArrayList<>();


        void addItem(String item){
            groceryList.add(item);
        }
        void removeItem(String item){
            groceryList.remove(item);
        }
        void displayList(){
            for(String item: groceryList){
                System.out.println(item);
            }
        }
        boolean checkItem(String item){
            return groceryList.contains(item);
        }
    }
    public static void main(String[] args) {
        GroceryListManager kauppaLista = new GroceryListManager();
        kauppaLista.addItem("Chocolate");
        kauppaLista.addItem("Strawberries");
        kauppaLista.addItem("Socks");
        kauppaLista.addItem("Shirt");
        kauppaLista.removeItem("Shirt");
        kauppaLista.displayList();
        System.out.println("Strawberries on the list: " + kauppaLista.checkItem("Strawberries"));
        System.out.println("Bread on the list: " + kauppaLista.checkItem("Bread"));
        kauppaLista.addItem("Chicken");
        kauppaLista.removeItem("Chocolate");
        kauppaLista.displayList();
    }
}
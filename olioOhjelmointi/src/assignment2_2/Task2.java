package assignment2_2;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Task2 {

    public static class GroceryListManager {
        private Map<String, Double> groceryList = new HashMap<>();


        void addItem(String item, double price) {
            groceryList.put(item, price);
        }
        void removeItem(String item){
            groceryList.remove(item);
        }
        void displayList(){
            for(Map.Entry<String, Double> item: groceryList.entrySet()){
                System.out.println(item.getKey() + ": " + item.getValue());
            }
        }
        boolean checkItem(String item){
            return groceryList.containsKey(item);
        }

        double calculateTotalCost(){
            double price=0;
            for(Map.Entry<String, Double> item: groceryList.entrySet()){
                price+=item.getValue();
            }
            return price;
        }
    }
    public static void main(String[] args) {
        GroceryListManager kauppaLista = new GroceryListManager();
        kauppaLista.addItem("Chocolate", 5.2);
        kauppaLista.addItem("Strawberries", 7.2);
        kauppaLista.addItem("Socks", 19.99);
        kauppaLista.addItem("Shirt", 49.99);
        kauppaLista.removeItem("Shirt");
        kauppaLista.displayList();
        System.out.println("Strawberries on the list: " + kauppaLista.checkItem("Strawberries"));
        System.out.println("Bread on the list: " + kauppaLista.checkItem("Bread"));
        kauppaLista.addItem("Chicken", 2);
        kauppaLista.removeItem("Chocolate");
        kauppaLista.displayList();
        System.out.println("Total price is: " + kauppaLista.calculateTotalCost());
        kauppaLista.addItem("Spaghetti", 0.99);
        System.out.println("Total price is: " + kauppaLista.calculateTotalCost());

    }
}
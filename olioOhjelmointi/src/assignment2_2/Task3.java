package assignment2_2;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Task3 {

    public static class Product{
        double price;
        String category;
        public Product(double price, String category) {
            this.price = price;
            this.category = category;
        }
    }

    public static class GroceryListManager {
        private Map<String, Product> groceryList = new HashMap<>();


        void addItem(String item, double price, String category) {
            groceryList.put(item, new Product(price, category));
        }
        void removeItem(String item){
            groceryList.remove(item);
        }
        void displayList(){
            for(Map.Entry<String, Product> item: groceryList.entrySet()){
                System.out.println(item.getKey() + " " + item.getValue().price + " " + item.getValue().category);
            }
        }
        boolean checkItem(String item){
            return groceryList.containsKey(item);
        }

        double calculateTotalCost(){
            double price=0;
            for(Map.Entry<String, Product> item: groceryList.entrySet()){
                price+=item.getValue().price;
            }
            return price;
        }

        void displayByCategory(String category){
            for(Map.Entry<String, Product> item: groceryList.entrySet()){
                if(item.getValue().category.equals(category)){
                    System.out.println(item.getKey() + " " + item.getValue().price + " " + item.getValue().category);
                }
            }
        }
    }
    public static void main(String[] args) {
        GroceryListManager kauppaLista = new GroceryListManager();
        kauppaLista.addItem("Chocolate", 5.2, "Sweets");
        kauppaLista.addItem("Strawberries", 7.2, "Fruits");
        kauppaLista.addItem("Socks", 19.99, "Clothing");
        kauppaLista.addItem("Shirt", 49.99, "Clothing");
        kauppaLista.removeItem("Shirt");
        kauppaLista.displayList();
        System.out.println("Strawberries on the list: " + kauppaLista.checkItem("Strawberries"));
        System.out.println("Bread on the list: " + kauppaLista.checkItem("Bread"));
        kauppaLista.addItem("Chicken", 2, "Sweets");
        kauppaLista.removeItem("Chocolate");
        kauppaLista.displayList();
        System.out.println("Total price is: " + kauppaLista.calculateTotalCost());
        kauppaLista.addItem("Spaghetti", 0.99, "Pasta");
        System.out.println("Total price is: " + kauppaLista.calculateTotalCost());
        kauppaLista.addItem("Pants", 39.99, "Clothing");
        kauppaLista.displayByCategory("Chocolate");
        kauppaLista.displayByCategory("Clothing");

    }
}
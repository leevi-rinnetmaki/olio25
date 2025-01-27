package assignment2_2;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Task4 {

    public static class Product{
        double price;
        String category;
        int quantity = 1;
        public Product(double price, String category, int quantity) {
            this.price = price;
            this.category = category;
            this.quantity = quantity;
        }
    }

    public static class GroceryListManager {
        private Map<String, Product> groceryList = new HashMap<>();


        void addItem(String item, double price, String category, int quantity) {
            groceryList.put(item, new Product(price, category, quantity));
        }

        void removeItem(String item){
            groceryList.remove(item);
        }

        String getStringFromGroceryList(Map.Entry<String, Product> item){
            return " " + item.getKey() + "\n  Price: " + item.getValue().price + "£\n  Category: " + item.getValue().category + "\n  Quantity: " + item.getValue().quantity + "\n";
        }

        void displayList(){
            System.out.println("Grocery List:");
            for(Map.Entry<String, Product> item: groceryList.entrySet()){
                //System.out.println(item.getKey() + "\nPrice: " + item.getValue().price + "£\nCategory: " + item.getValue().category + "\nQuantity: " + item.getValue().quantity + "\n");
                System.out.println(getStringFromGroceryList(item));
            }
        }

        void displayByCategory(String category){
            System.out.println("Grocery List by category:");
            for(Map.Entry<String, Product> item: groceryList.entrySet()){
                if(item.getValue().category.equals(category)){
                    System.out.println(getStringFromGroceryList(item));
                }
            }
        }

        boolean checkItem(String item){
            return groceryList.containsKey(item);
        }

        double calculateTotalCost(){
            double price=0;
            for(Map.Entry<String, Product> item: groceryList.entrySet()){
                price+=item.getValue().price * item.getValue().quantity;
            }
            return price;
        }

        void updateQuantity(String item, int newQuantity){
            groceryList.get(item).quantity = newQuantity;
        }
    }
    public static void main(String[] args) {
        GroceryListManager kauppaLista = new GroceryListManager();
        kauppaLista.addItem("Chocolate", 5.2, "Sweets", 3);
        kauppaLista.addItem("Strawberries", 7.2, "Fruits", 4);
        kauppaLista.addItem("Socks", 19.99, "Clothing", 6);
        kauppaLista.addItem("Shirt", 49.99, "Clothing", 8);
        kauppaLista.removeItem("Shirt");
        kauppaLista.displayList();

        System.out.println("Strawberries on the list: " + kauppaLista.checkItem("Strawberries"));
        System.out.println("Bread on the list: " + kauppaLista.checkItem("Bread")+"\n");
        kauppaLista.addItem("Chicken", 2, "Sweets", 2);
        kauppaLista.removeItem("Chocolate");
        kauppaLista.displayList();

        System.out.println("Total price is: " + kauppaLista.calculateTotalCost()+"£");
        kauppaLista.addItem("Spaghetti", 0.99, "Pasta", 12);
        System.out.println("Total price is: " + kauppaLista.calculateTotalCost()+"£\n");
        kauppaLista.addItem("Pants", 39.99, "Clothing", 20);
        kauppaLista.displayByCategory("Clothing");

        kauppaLista.updateQuantity("Pants",1);
        kauppaLista.displayByCategory("Clothing");

    }
}
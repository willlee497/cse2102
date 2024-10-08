// Main.java
public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        // Order a Cheese Pizza
        store.orderPizza("cheese");

        // Order a Greek Pizza
        store.orderPizza("greek");

        // Order a Pepperoni Pizza
        store.orderPizza("pepperoni");

        // Order a Gluten-Free Pizza
        store.orderPizza("glutenfree");
    }
}

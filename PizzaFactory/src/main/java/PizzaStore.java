// PizzaStore.java
public class PizzaStore {
    private PizzaFactory factory;

    // Constructor takes a PizzaFactory
    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    // Order a pizza using the factory
    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
        } else {
            System.out.println("Invalid pizza type: " + type);
            return null;
        }
    }
}

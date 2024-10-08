// PizzaFactory.java
public class PizzaFactory {
    // Factory Method
    public Pizza createPizza(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "cheese":
                return new CheesePizza();
            case "greek":
                return new GreekPizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "glutenfree":
                return new GlutenFreePizza();
            default:
                return null;
        }
    }
}

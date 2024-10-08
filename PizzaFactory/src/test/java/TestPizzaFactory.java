import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPizzaFactory {

    private PizzaFactory pizzaFactory;
    private PizzaStore pizzaStore;

    @Before
    public void setUp() {
        pizzaFactory = new PizzaFactory();
        pizzaStore = new PizzaStore(pizzaFactory);
    }

    @Test
    public void testOrderCheesePizza() {
        Pizza pizza = pizzaStore.orderPizza("cheese");
        assertNotNull("Pizza should not be null", pizza);
        assertTrue("Pizza should be an instance of CheesePizza", pizza instanceof CheesePizza);

        // Verify methods are callable
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void testOrderGreekPizza() {
        Pizza pizza = pizzaStore.orderPizza("greek");
        assertNotNull("Pizza should not be null", pizza);
        assertTrue("Pizza should be an instance of GreekPizza", pizza instanceof GreekPizza);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void testOrderPepperoniPizza() {
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        assertNotNull("Pizza should not be null", pizza);
        assertTrue("Pizza should be an instance of PepperoniPizza", pizza instanceof PepperoniPizza);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void testOrderGlutenFreePizza() {
        Pizza pizza = pizzaStore.orderPizza("glutenfree");
        assertNotNull("Pizza should not be null", pizza);
        assertTrue("Pizza should be an instance of GlutenFreePizza", pizza instanceof GlutenFreePizza);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void testOrderInvalidPizza() {
        Pizza pizza = pizzaStore.orderPizza("unknown");
        assertNull("Pizza should be null for an invalid type", pizza);
    }

    @Test
    public void testLiskovSubstitutionPrinciple() {
        Pizza[] pizzas = {
                new CheesePizza(),
                new GreekPizza(),
                new PepperoniPizza(),
                new GlutenFreePizza()
        };

        for (Pizza pizza : pizzas) {
            // Each pizza should behave correctly as a Pizza
            assertTrue("Pizza should not be null", pizza != null);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}

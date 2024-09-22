import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HybridTest {

    private Hybrid hybridCar;

    @Before
    public void setUp() {
        hybridCar = new Hybrid();  // Initialize the Hybrid object before each test
    }

    // Test for gasoline MPG calculation
    @Test
    public void testCalcGasMPG() {
        hybridCar.setMilesfromGas(120);  // Set 120 miles driven
        hybridCar.setGallonsfromGas(6);  // Set 6 gallons used
        double mpg = hybridCar.calcGasMPG();
        
        // Print the MPG result to the console (for visibility)
        System.out.println("Gasoline MPG: " + mpg);

        // Assert that MPG is correct
        assertEquals(20.0, mpg, 0.01);  // Expected MPG is 20
    }

    // Test for electric MPGe calculation
    @Test
    public void testCalcMPGe() {
        hybridCar.setElectricMiles(300);  // Set 300 miles driven on electric
        hybridCar.setTotalkWh(70);        // Set 70 kWh used for the trip
        double mpge = hybridCar.calcMPGe();
        
        // Print the MPGe result to the console
        System.out.println("Electric MPGe: " + mpge);

        // Assert that MPGe is correct
        assertEquals(144.43, mpge, 0.01);  // Expected MPGe is 144.43
    }

    // Test for electric trip cost calculation
    @Test
    public void testElectricCost() {
        hybridCar.setTotalkWh(33.7);  // Set 33.7 kWh for the trip
        hybridCar.setCostPerKWh(0.24);  // Set cost per kWh
        double totalCost = hybridCar.getElectricCost();

        // Print the electric trip cost result to the console
        System.out.println("Electric trip cost: $" + totalCost);

        // Assert that the cost is correct
        assertEquals(8.09, totalCost, 0.01);  // Expected cost is $8.09
    }

    // Test for gasoline trip cost calculation
    @Test
    public void testGasolineCost() {
        hybridCar.setMilesfromGas(120);  // Set 120 miles driven on gasoline
        hybridCar.setGallonsfromGas(6);  // Set 6 gallons used
        hybridCar.setCostPerGallon(3.50);  // Set gasoline cost per gallon
        double totalCost = hybridCar.getGasolineCost();

        // Print the gasoline trip cost result to the console
        System.out.println("Gasoline trip cost: $" + totalCost);

        // Assert that the cost is correct
        assertEquals(21.0, totalCost, 0.01);  // Expected cost is $21.00
    }
}

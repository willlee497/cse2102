
public class CarRunner {

    public static void main(String[] args) {
        HybridVehicle hybridCar = new HybridVehicle();

        // Set the costs for gasoline and electricity
        hybridCar.setCostPerGallon(3.50);
        hybridCar.setCostPerKWh(0.24);

        // Gasoline mode (Example: 120 miles, 6 gallons)
        hybridCar.setMilesfromGas(120);  // Use correct method to set miles driven on gasoline
        hybridCar.setGallonsfromGas(6);  // Use correct method to set gallons used
        double gasMPG = hybridCar.calcGasMPG();  // Use correct method to calculate gas MPG
        double gasCost = 6 * hybridCar.getCostPerGallon();
        System.out.println("Gasoline mode MPG: " + gasMPG);
        System.out.println("Cost of gasoline trip: $" + gasCost);

        // Electric mode (Example: 300 miles, 70 kWh)
        hybridCar.setElectricMiles(300);  // Use correct method to set miles driven on electric
        hybridCar.setTotalkWh(70);        // Use correct method to set kWh used
        double mpge = hybridCar.calcMPGe();  // Use correct method to calculate MPGe
        double electricCost = 70 * hybridCar.getCostPerKWh();
        System.out.println("Electric mode MPGe: " + mpge);
        System.out.println("Cost of electric trip: $" + electricCost);

        // Hybrid mode (average of gas and electric)
        double hybridAverageMPG = hybridCar.calcHybridAverageMPG();
        System.out.println("Hybrid mode average MPG: " + hybridAverageMPG);
    }
}


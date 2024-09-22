
public class Hybrid implements ElectricInterface, GasolineInterface {

    private double miles;
    private double gallons;
    private double kWh;

    // Add these instance variables
    private double costPerGallon;
    private double costPerKWh;

    private final double MPG_E = 33.7;

    // Gasoline calculations
    @Override
    public double calcGasMPG() {
        return miles / gallons;
    }

    @Override
    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }

    @Override
    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    public double getGasolineCost() {
        return gallons * costPerGallon;  // Calculate gasoline trip cost
    }

    public void setCostPerGallon(double costPerGallon) {
        this.costPerGallon = costPerGallon;  // Setter for gasoline cost
    }

    // Electric calculations
    @Override
    public double calcMPGe() {
        return (miles / kWh) * MPG_E;
    }

    @Override
    public void setElectricMiles(double totalElectricMiles) {
        this.miles = totalElectricMiles;
    }

    @Override
    public void setTotalkWh(double totalkWh) {
        this.kWh = totalkWh;
    }

    public double getElectricCost() {
        return kWh * costPerKWh;  // Calculate electric trip cost
    }

    public void setCostPerKWh(double costPerKWh) {
        this.costPerKWh = costPerKWh;  // Setter for electric cost
    }

    // Hybrid average MPG method
    public double calcHybridAverageMPG() {
        return (calcGasMPG() + calcMPGe()) / 2;
    }
}

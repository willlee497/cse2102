
public class HybridVehicle implements GasolineInterface, ElectricInterface {
    
    private double miles;
    private double gallons;
    private double kWh;
    private double costPerGallon;
    private double costPerKWh;

    private final double MPG_E = 33.7;

    // Implement the missing method
    @Override
    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    // Implement the remaining methods of GasolineInterface and ElectricInterface
    @Override
    public double calcGasMPG() {
        return miles / gallons;
    }

    @Override
    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }

    // Electric vehicle methods
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

    // Additional methods for cost settings
    public double getCostPerGallon() {
        return this.costPerGallon;
    }

    public void setCostPerGallon(double costPerGallon) {
        this.costPerGallon = costPerGallon;
    }

    public double getCostPerKWh() {
        return this.costPerKWh;
    }

    public void setCostPerKWh(double costPerKWh) {
        this.costPerKWh = costPerKWh;
    }

    // Hybrid average MPG method
    public double calcHybridAverageMPG() {
        return (calcGasMPG() + calcMPGe()) / 2;
    }
}

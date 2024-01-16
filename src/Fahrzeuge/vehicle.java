/* Exercis: 
    Erstellen Sie eine Klasse Fahrzeuge
    ...
*/





package Fahrzeuge;

public class vehicle
{   
    private int yearOfManufacture;
    private String color;
    private String manufacturer;
    private int horsepower;
    private double fuelConsumption;
    private float maxTankCapacity;
    private float currentTankCapacity;
    private double distanceTraveled;
    private double totalKilometers;

    // getter
    public int getYearOfManufacture()
    {
        return yearOfManufacture;
    }

    public String getColor()
    {
        return color;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }


    public void setColor(String color) {
        this.color = color;
    }

    // Getters and Setters for manufacturer


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Getters and Setters for horsepower
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Getters and Setters for fuelConsumption
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    // Getters and Setters for maxTankCapacity
    public float getMaxTankCapacity() {
        return maxTankCapacity;
    }

    public void setMaxTankCapacity(float maxTankCapacity) {
        this.maxTankCapacity = maxTankCapacity;
    }

    // Getters and Setters for currentTankCapacity
    public float getCurrentTankCapacity() {
        return currentTankCapacity;
    }

    public void setCurrentTankCapacity(float currentTankCapacity) {
        this.currentTankCapacity = currentTankCapacity;
    }

    // Getters and Setters for distanceTraveled
    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    // Getters and Setters for totalKilometers
    public double getTotalKilometers() {
        return totalKilometers;
    }

    public void setTotalKilometers(double totalKilometers) {
        this.totalKilometers = totalKilometers;
    }

}

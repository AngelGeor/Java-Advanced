package DefiningClasses_Ex.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostForOneKm;
    private int distance;

    public Car(String model, int fuelAmount, double fuelCostForOneKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostForOneKm = fuelCostForOneKm;
        this.distance = 0;
    }

public boolean drive(int amountOfKm){
 double fuelNeeded = amountOfKm * this.fuelCostForOneKm;
   if(fuelNeeded <= this.fuelAmount ) {
    this.distance += amountOfKm;
    this.fuelAmount -= fuelNeeded;
    return true;
}
return false;
}
@Override
public String toString(){
    return String.format("%s %.2f %d", model,fuelAmount,distance);
}
}

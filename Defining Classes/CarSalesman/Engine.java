package DefiningClasses_Ex.CarSalesman;

public class Engine {
    private String model;
    private int power;
    //optional
    private int displacement;
    private String efficiency;


    //1. начин -> model, power
    //2. начин -> model, power,displacement
    //3.начин -> model, power, efficiency
    //4. начин -> model, power, displacement, efficiency

    public Engine(String model, int power ){
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }
    public Engine(String model, int power, int displacement ){
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = "n/a";
    }
    public Engine(String model, int power, String efficiency ) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = efficiency;
    }
    public Engine(String model, int power,int displacement, String efficiency ) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Power: " + this.power + "\n");
        if(this.displacement == 0){
            sb.append("Displacement: n/a" + "\n");
        }else {
            sb.append("Displacement: " + this.displacement + "\n");
        }
        sb.append("Efficiency: " + this.efficiency);
        return sb.toString();
    }
}

package DefiningClasses_Ex.RawData;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tireList ;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tireList) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tireList = tireList;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public List<Tire> getTireList() {
        return tireList;
    }
    public String getModel(){
        return model;
    }
    public Engine getEngine(){
        return engine;
    }
}

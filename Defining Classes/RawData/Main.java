package DefiningClasses_Ex.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] components = scanner.nextLine().split("\\s+");
            //"{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType} {Tire1Pressure}
            // {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure} {Tire]’3Age} {Tire4Pressure} {Tire4Age}",

            String model = components[0];
            int engineSpeed = Integer.parseInt(components[1]);
            int enginePower = Integer.parseInt(components[2]);
            int cargoWeight = Integer.parseInt(components[3]);
            String cargoType = components[4];
            double tyre1pressure = Double.parseDouble(components[5]);
            int tyre1Age = Integer.parseInt(components[6]);
            double tyre2pressure = Double.parseDouble(components[7]);
            int tyre2Age = Integer.parseInt(components[8]);
            double tyre3pressure = Double.parseDouble(components[9]);
            int tyre3Age = Integer.parseInt(components[10]);
            double tyre4pressure = Double.parseDouble(components[11]);
            int tyre4Age = Integer.parseInt(components[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire1 = new Tire(tyre1pressure, tyre1Age);
            Tire tire2 = new Tire(tyre2pressure, tyre2Age);
            Tire tire3 = new Tire(tyre3pressure, tyre3Age);
            Tire tire4 = new Tire(tyre4pressure, tyre4Age);
            List<Tire> tireList = new ArrayList<>();
            tireList.add(tire1);
            tireList.add(tire2);
            tireList.add(tire3);
            tireList.add(tire4);

            Car car = new Car(model, engine, cargo, tireList);
            carList.add(car);
        }
        String command = scanner.nextLine();
        for (Car car : carList) {
            switch (car.getCargo().getCargoType()) {
                case "fragile":
                    if(command.equals("fragile")) {
                        for (Tire tire : car.getTireList()) {
                            if (tire.getTirePressure() < 1) {
                                System.out.println(car.getModel());
                                break;
                            }
                        }
                    }
                    break;
                case "flamable":
                    if (command.equals("flamable")) {
                        if (car.getEngine().getEnginePower() > 250) {
                            System.out.println(car.getModel());
                        }
                    }
                    break;
            }
        }
    }
}
package DefiningClasses_Ex.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> enginesList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Engine engine;
            String[] inputLines = scanner.nextLine().split("\\s+");
            String model = inputLines[0];
            int power = Integer.parseInt(inputLines[1]);
            if (inputLines.length == 2) {
                engine = new Engine(model, power);
            } else if (inputLines.length == 4) {
                int displacement = Integer.parseInt(inputLines[2]);
                String efficiency = inputLines[3];
                engine = new Engine(model, power, displacement, efficiency);
            } else {
                try {
                    int displacement = Integer.parseInt(inputLines[2]);
                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException e) {
                    String efficiency = inputLines[2];
                    engine = new Engine(model, power, efficiency);
                }

            }
            enginesList.add(engine);
        }

        int m = Integer.parseInt(scanner.nextLine());
        List<Car> carsList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Car car;
            String[] inputLines = scanner.nextLine().split("\\s+");
            String carModel = inputLines[0];
            String engineModel = inputLines[1];
            if (inputLines.length == 2) {
                car = new Car(carModel, engineModel);
            } else if (inputLines.length == 4) {
                int weight = Integer.parseInt(inputLines[2]);
                String color = inputLines[3];
                car = new Car(carModel, engineModel, weight, color);
            } else {
                try {
                    int weight = Integer.parseInt(inputLines[2]);
                    car = new Car(carModel, engineModel, weight);
                } catch (NumberFormatException e) {
                    String color = inputLines[2];
                    car = new Car(carModel, engineModel, color);
                }
            }
            carsList.add(car);
        }

        for (Car car : carsList) {
            System.out.println(car.getModel() + ":");
            System.out.println(car.getEngineModel() + ":");
            enginesList.forEach(engine -> {
                        if (engine.getModel().equals(car.getEngineModel())) {
                            System.out.println(engine);
                        }
                    }
            );
            if (car.getWeight() == 0) {
                System.out.println("Weight: n/a");
            } else {
                System.out.println("Weight: " + car.getWeight());
            }
            System.out.println("Color: " + car.getColor());
        }
    }
}

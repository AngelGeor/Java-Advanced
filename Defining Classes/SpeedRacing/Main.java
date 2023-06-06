package DefiningClasses_Ex.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> modelAndCarSpec = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String model = carData[0];
            int fuelAmount = Integer.parseInt(carData[1]);
            double fuelCostForOneKm = Double.parseDouble(carData[2]);
            Car car = new Car(model,fuelAmount,fuelCostForOneKm);
            modelAndCarSpec.put(model,car);
        }
        String input = scanner.nextLine();

        while(!input.equals("End")){
            String[] inputData = input.split("\\s+");
            String modelName = inputData[1];
            int amountToDrive = Integer.parseInt(inputData[2]);
            Car carToUse = modelAndCarSpec.get(modelName);

            if (!carToUse.drive(amountToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }

            input = scanner.nextLine();
        }
        for (Car car : modelAndCarSpec.values()){
            System.out.println(car.toString());
        }
    }
}

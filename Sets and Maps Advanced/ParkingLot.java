package SetsAndMapsAdvanced_Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while(!input.equals("END")){
            String[] inputParts = input.split(", ");

            if(inputParts[0].equals("IN")){
                parkingLot.add(inputParts[1]);
            }else {
                parkingLot.remove(inputParts[1]);
            }


            input = scanner.nextLine();
        }
        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }

        for(String plateNumber : parkingLot) {
            System.out.println(plateNumber);
        }
    }
}

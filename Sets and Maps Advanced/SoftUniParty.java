package SetsAndMapsAdvanced_Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> regular = new TreeSet<>();
        Set<String> vip = new TreeSet<>();

        String guestId = scanner.nextLine();

        while (!guestId.equals("PARTY")){
            if(Character.isDigit(guestId.charAt(0))){
                vip.add(guestId);
            }else {
                regular.add(guestId);
            }

            guestId = scanner.nextLine();
        }

        String incomingGuests = scanner.nextLine();
        while(!incomingGuests.equals("END")){

                regular.remove(incomingGuests);
                vip.remove(incomingGuests);

            incomingGuests = scanner.nextLine();
        }

        int numberOfGuests = vip.size() + regular.size();
        System.out.println(numberOfGuests);

        if(!vip.isEmpty()) {
            for (String guest : vip) {
                System.out.println(guest);
            }
        }
            if(!regular.isEmpty()){
                for(String guest : regular){
                    System.out.println(guest);
                }
            }

    }
}

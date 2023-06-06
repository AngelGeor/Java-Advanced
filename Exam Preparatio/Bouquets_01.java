package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Bouquets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tulips = new ArrayDeque<>();            //Stack
        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(tulips::push);

        ArrayDeque<Integer> daffodils  = new ArrayDeque<>();        //  queue
        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(daffodils ::offer);



        int numberOfBouquets = 0;
        int storedFlowers = 0;

        while(!daffodils.isEmpty() && !tulips.isEmpty()){
            int daffodil = daffodils.peek();
            int tulip = tulips.peek();

            int sum = daffodil + tulip;

            if(sum == 15){
                daffodils.poll();
                tulips.pop();
                numberOfBouquets ++;

            }else if(sum < 15) {
                storedFlowers += sum;
                daffodils.poll();
                tulips.pop();
            }else {

                    tulips.pop();
                    tulips.push(tulip - 2);
                }
            }

        int bouquetsFromLeftOvers = storedFlowers / 15;
        numberOfBouquets += bouquetsFromLeftOvers;

        if(numberOfBouquets >= 5){
            System.out.printf("You made it! You go to the competition with %d bouquets!",numberOfBouquets);
        }else {
            System.out.printf("You failed... You need more %d bouquets.",5 - numberOfBouquets);
        }
        }

    }


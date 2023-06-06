package SetsAndMapsAdvanced_Lab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGradesMap = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String studentsName = input[0];
            double studentsGrade = Double.parseDouble(input[1]);

            if (!studentsGradesMap.containsKey(studentsName)) {
                studentsGradesMap.put(studentsName, new ArrayList<>());
            }
            studentsGradesMap.get(studentsName).add(studentsGrade);
        }
        studentsGradesMap.forEach((k, v) -> {
            System.out.print(k + " -> ");
            v.forEach(e ->
                    System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)%n", getAverage(v));
        });


        //  for (Map.Entry<String, List<Double>> entry : studentsGradesMap.entrySet()) {

        //       System.out.printf("%s -> %s (avg: %.2f)%n",entry.getKey(),entry.getValue(),getAverage(entry.getValue()));
        //   }

    }

    private static double getAverage(List<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

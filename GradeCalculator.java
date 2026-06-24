import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take the number of subjects
        System.out.print("Enter the total number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables
        double[] marks = new double[numSubjects];
        double totalMarks = 0;

        // 2. Take marks obtained in each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();
            
            // Validate input
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks! Enter a value between 0 and 100: ");
                marks[i] = scanner.nextDouble();
            }
            
            // 3. Calculate Total Marks
            totalMarks += marks[i];
        }

        // 4. Calculate Average Percentage
        double averagePercentage = totalMarks / numSubjects;

        // 5. Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // 6. Display Results
        System.out.println("\n--- Final Results ---");
        System.out.println("Total Marks Obtained: " + totalMarks + " / " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Assigned Grade: " + grade);

        scanner.close();
    }
}



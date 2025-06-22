import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter marks for three subjects (out of 100):");
            
            // Input marks for three subjects
            System.out.print("Subject 1: ");
            double subject1 = scanner.nextDouble();
            
            System.out.print("Subject 2: ");
            double subject2 = scanner.nextDouble();
            
            System.out.print("Subject 3: ");
            double subject3 = scanner.nextDouble();
            
            // Calculate percentage
            double totalMarks = subject1 + subject2 + subject3;
            double percentage = totalMarks / 3.0;
            
            // Convert percentage to CGPA (assuming 10-point scale)
            // Formula: CGPA = Percentage / 9.5
            double cgpa = percentage / 9.5;
            
            // Display results
            System.out.println("\nResults:");
            System.out.printf("Total Marks: %.2f/300.00%n", totalMarks);
            System.out.printf("Percentage: %.2f%%%n", percentage);
            System.out.printf("CGPA: %.2f%n", cgpa);
        }
    }
}

package Arrays.LEVEL2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < a; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) { 
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }
            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d -> Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f\n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        sc.close();
    }
}

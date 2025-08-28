package Arrays.LEVEL2;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];   
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");

            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    mark = sc.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid input! Enter marks between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        System.out.println("\n----- Student Report -----");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s %-10s\n", 
                          "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Remarks");

        for (int i = 0; i < n; i++) {
            String remarks = switch (grade[i]) {
                case "A" -> "Level 4, above agency-normalized standards";
                case "B" -> "Level 3, at agency-normalized standards";
                case "C" -> "Level 2, below, but approaching standards";
                case "D" -> "Level 1, well below standards";
                case "E" -> "Level 1-, too below standards";
                default -> "Remedial standards";
            };

            System.out.printf("%-10d %-10d %-10d %-12.2f %-10s %-40s\n",
                              marks[i][0], marks[i][1], marks[i][2],
                              percentage[i], grade[i], remarks);
        }

        sc.close();
    }
}

package Methods.LEVEL1;
import java.util.Scanner;

public class Q6 {
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers = " + sum);
    }
}

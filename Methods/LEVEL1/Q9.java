package Methods.LEVEL1;
import java.util.Scanner;

public class Q9 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + res[1] + " chocolates and remaining = " + res[0]);
    }
}

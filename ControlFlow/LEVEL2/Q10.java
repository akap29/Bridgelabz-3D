package ControlFlow.LEVEL2;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        int i = number - 1;

        while (i >= 1) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }

        System.out.println("Greatest factor of " + number + " is: " + greatestFactor);
    }
}
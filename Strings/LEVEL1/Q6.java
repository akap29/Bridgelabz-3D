package Strings.LEVEL1;
import java.util.Scanner;

public class Q6 {
    static void generateException(String text) {
        System.out.println(text.substring(2, 1));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(2, 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        // generateException(text);
        handleException(text);
    }
}
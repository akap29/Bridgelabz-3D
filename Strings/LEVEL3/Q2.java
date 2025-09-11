package Strings.LEVEL3;
import java.util.Scanner;

public class Q2 {
    static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static char[] getUniqueChars(String text) {
        int len = getLength(text);
        char[] temp = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[index++] = c;
        }
        char[] result = new char[index];
        
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] uniques = getUniqueChars(text);
        for (char c : uniques) System.out.print(c + " ");
    }
}
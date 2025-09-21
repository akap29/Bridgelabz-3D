package ClassObjects.LEVEL2;


public class Q3 {
    String text;

    // Constructor
    Q3(String text) {
        this.text = text;
    }

    // Check if text is palindrome
    public boolean isPalindrome() {
        String cleantext = text.replaceAll("\\s", "").toLowerCase();
        String reverseText = new StringBuilder(cleantext).reverse().toString();
        return cleantext.equals(reverseText);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Q3 checker1 = new Q3("A man a plan a canal Panama");
        checker1.displayResult();

        Q3 checker2 = new Q3("Hello");
        checker2.displayResult();
    }
}

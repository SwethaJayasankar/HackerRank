import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            int testCases = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < testCases; i++) {
                if (scanner.hasNextLine()) {
                    String pattern = scanner.nextLine();
                    try {
                        Pattern.compile(pattern);
                        System.out.println("Valid");
                    } catch (PatternSyntaxException e) {
                        System.out.println("Invalid");
                    }
                }
            }
        }

        scanner.close();
    }
}




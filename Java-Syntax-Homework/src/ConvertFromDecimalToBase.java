import java.util.Scanner;
import java.util.regex.Matcher;

public class ConvertFromDecimalToBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = Integer.parseInt(scanner.nextLine().trim());
        int longBits = 64;

        int base7Number = 0;
        for (int i = longBits; i >= 0; i--){
            long result = Math.round(Math.floor(number / Math.pow(7, i)) * Math.pow(10, i));
            long remainder = Math.round(number % Math.pow(7, i));
            number = remainder;
            base7Number += result;
        }

        System.out.println(base7Number);
    }
}

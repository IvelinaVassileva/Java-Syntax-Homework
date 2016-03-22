import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] numberString = scanner.nextLine().trim().toCharArray();
        int[] digits = new int[numberString.length];

        for (int i = 0; i < numberString.length; i++){
            digits[numberString.length - 1 - i] = numberString[i] - 48;
        }

        int decimalNumber = 0;
        for (int i = 0; i < digits.length; i++) {
            double result = digits[i] * Math.pow(7, i);
            decimalNumber += result;
        }

        System.out.println(decimalNumber);
    }
}

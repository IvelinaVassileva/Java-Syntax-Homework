import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int a = Integer.parseInt(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double c = Double.parseDouble(numbers[2]);

        String aHex = Integer.toHexString(a).toUpperCase();
        String aBin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", aHex, aBin, b, c);
    }
}

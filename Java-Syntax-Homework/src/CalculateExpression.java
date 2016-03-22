import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        double a = Integer.parseInt(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double c = Double.parseDouble(numbers[2]);

        double formulaOne = Math.pow((a*a + b*b)/(a*a - b*b),(a + b + c)/Math.sqrt(c));
        double formulaTwo = Math.pow((a*a + b*b - Math.pow(c, 3)),(a - b));

        double difference = Math.abs(((a + b + c)/3) - ((formulaOne + formulaTwo)/2));
        System.out.printf("F1 result: %1.2f; F2 result: %1.2f; Diff: %1.2f", formulaOne, formulaTwo, difference);
    }
}

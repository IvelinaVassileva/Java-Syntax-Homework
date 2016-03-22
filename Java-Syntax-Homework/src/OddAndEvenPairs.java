import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        if (numbers.length % 2 == 0){
            for (int i = 0; i < numbers.length; i+=2){
                int a = Integer.parseInt(numbers[i]);
                int b = Integer.parseInt(numbers[i+1]);

                if (a % 2 == 0 && b % 2 == 0){
                    System.out.printf("%d, %d -> both are even", a, b);
                    System.out.println();
                }
                else if (a % 2 != 0 && b % 2 != 0){
                    System.out.printf("%d, %d -> both are odd", a, b);
                    System.out.println();
                }
                else {
                    System.out.printf("%d, %d -> different",a, b);
                    System.out.println();
                }
            }
        }
        else {
            System.out.println("Invalid length");
        }
    }
}

import java.util.Scanner;

public class HitTheeTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());

        for (int i = 1; i <= 20; i++){
            for (int j = 1; j <= 20; j++){
                if (i + j == number){
                    System.out.printf("%d + %d = %d", i, j, number);
                    System.out.println();
                }
            }
        }

        for (int i = 1; i <= 20; i++){
            for (int j = 1; j <= 20; j++){
                if (i - j == number){
                    System.out.printf("%d - %d = %d", i, j, number);
                    System.out.println();
                }
            }
        }
    }
}

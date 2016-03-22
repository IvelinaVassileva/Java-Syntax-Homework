import java.util.Scanner;

public class CharacterMultiplier {
    public static int CharMultiplier(String firstString, String secondString){
        int sum = 0;
        int maxLength = Math.max(firstString.length(), secondString.length());

        int a = 1;
        int b = 1;
        for (int i = 0; i < maxLength; i++){
            if (firstString.length() > i){
                a = firstString.charAt(i);
            }
            else {
                a = 1;
            }

            if (secondString.length() > i){
                b = secondString.charAt(i);
            }
            else {
                b = 1;
            }

            sum += (a * b);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        int result = CharMultiplier(strings[0], strings[1]);
        System.out.println(result);
    }
}

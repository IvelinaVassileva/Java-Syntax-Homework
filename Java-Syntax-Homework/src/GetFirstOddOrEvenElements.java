import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class GetFirstOddOrEvenElements {
    public static List<Integer> GetFirstOddOrEven(int[] collection, int number, String type){
        int counter = 0;
        List<Integer> result = new ArrayList<Integer>();

        switch (type){
            case "odd":
                int i = 0;
                while (counter <= number && i < collection.length){
                    if (collection[i] % 2 != 0){
                        result.add(collection[i]);
                        counter++;
                    }
                    i++;
                }
                break;
            case "even":
                int j = 0;
                while (counter <= number && j < collection.length){
                    if (collection[j] % 2 == 0){
                        result.add(collection[j]);
                        counter++;
                    }
                    j++;
                }
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersString = scanner.nextLine().split(" ");
        String[] params = scanner.nextLine().split(" ");
        int num = Integer.parseInt(params[1]);
        String type = params[2];

        int[] numbers = new int[numbersString.length];

        for (int i = 0; i < numbersString.length; i++) {
            int numberInt = Integer.parseInt(numbersString[i]);
            numbers[i] = numberInt;
        }

        List<Integer> result = GetFirstOddOrEven(numbers, num, type);
        for (int number: result) {
            System.out.print(number + " ");
        }
    }
}

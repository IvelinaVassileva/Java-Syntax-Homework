import java.util.*;
import java.util.stream.IntStream;

public class RandomizeNumbersFromMToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int m = Integer.parseInt(numbers[0]);
        int n = Integer.parseInt(numbers[1]);

        List<Integer> collection = new ArrayList<>();

        if (m < n){
            for (int i = m; i <= n; i++){
                collection.add(i);
            }
        }
        else {
            for (int i = n; i <= m; i++){
                collection.add(i);
            }
        }

        Collections.shuffle(collection);

        for (int number:collection) {
            System.out.print(number + " ");
        }
    }
}

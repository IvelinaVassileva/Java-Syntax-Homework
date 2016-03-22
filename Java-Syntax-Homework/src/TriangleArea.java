import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstPoint = scanner.nextLine().split(" ");
        String[] secondPoint = scanner.nextLine().split(" ");
        String[] thirdPoint = scanner.nextLine().split(" ");

        int aX = Integer.parseInt(firstPoint[0]);
        int aY = Integer.parseInt(firstPoint[1]);
        int bX = Integer.parseInt(secondPoint[0]);
        int bY = Integer.parseInt(secondPoint[1]);
        int cX = Integer.parseInt(thirdPoint[0]);
        int cY = Integer.parseInt(thirdPoint[1]);

        double area = (aX*(bY - cY) + bX*(cY - aY) + cX*(aY - bY)) / 2;
        System.out.println(Math.round(Math.abs(area)));
    }
}

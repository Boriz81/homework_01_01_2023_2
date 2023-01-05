import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();

        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] > n) {
                sum = sum + myArray[j];
            }
        }
        System.out.println(sum);

    }
}
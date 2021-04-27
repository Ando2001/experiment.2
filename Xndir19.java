import java.util.Scanner;

public class Xndir19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean isOdd = false;

        isOdd = a % 2 != 0;
        System.out.println(isOdd);


        isOdd = b % 2 != 0;
        System.out.println(isOdd);
    }
}

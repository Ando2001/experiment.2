import java.util.Scanner;

public class Xndir16 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        number = scanner.nextInt();
        int firstDigit = number / 100;
        System.out.println("first digit = " + firstDigit);
    }
}

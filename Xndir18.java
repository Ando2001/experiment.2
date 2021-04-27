import java.util.Scanner;

public class Xndir18 {
    public static void main(String[] args) {
        int number;
        int sum;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;
        sum = (number / 10) + ((number / 10) % 10) + (number % 10);
        System.out.println("everege =" + sum);
    }
}

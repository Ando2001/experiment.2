import java.util.Scanner;

public class Xndir17 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int secondDit = (number / 10) % 10;
        System.out.println("Second Digt =" + secondDit);

    }
}

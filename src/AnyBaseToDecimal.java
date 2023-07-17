import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int base = scanner.nextInt();

        int index = 0, num = 0;
        int result = 0;
        while (number > 0) {
            num = number % 10;
            number /= 10;
            result += (num * (Math.pow(base, index)));
            index++;
        }
        System.out.println(result);
    }
}

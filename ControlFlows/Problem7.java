import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        System.out.println(number1 == Math.max(number1, Math.max(number2, number3)));
        System.out.println(number2 == Math.max(number1, Math.max(number2, number3)));
        System.out.println(number3 == Math.max(number1, Math.max(number2, number3)));
    }
}

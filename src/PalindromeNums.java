import java.util.Scanner;

//8. Написать программу, которая в последовательности от 0 до N, находит все числа-палиндромы (зеркальное значение равно оригинальному). Длина последовательности вводится вручную и не должна превышать 100.

public class PalindromeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число X от 1 до 100 для проверки наличия палиндромных чисел в интервале от 0 до X");

        int x = sc.nextInt();

        while (x > 100 || x < 1) {
            System.out.println("Введено неверное число. Введите число от 1 до 100");
            x = sc.nextInt();
        }

        System.out.println("Палиндромными являются числа:");

        for (int i = 0; i <= x; i++) {
            String text = String.valueOf(i);
            String textRev = new StringBuffer(text).reverse().toString();
            if (text.equals(textRev)) {
                System.out.println(i);
            }
        }

    }
}

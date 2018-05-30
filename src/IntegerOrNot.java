import java.util.Scanner;

// 1. Создать программу, которая будет сообщать, является ли целое число, введенное пользователем, чётным или нечётным, простым или составным. Если пользователь введёт не целое число, то сообщать ему об ошибке.

public class IntegerOrNot {
    public static void main(String[] args) {
        System.out.println("Введите целое число для проверки или слово exit для прекращения работы программы.");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String numS = sc.nextLine();

            if (numS.contains(".")) {
                System.out.println("Введено не целое число. Введите целое число для проверки.");
            }

            if (numS.equals("exit")) {
                break;
            }

            else {
                int num = Integer.parseInt(numS);
                String evenNumber = "чётное";
                String integer = "простое";
                if (num % 2 != 0) {
                    evenNumber = "нечётное";
                }
                if (num <= 1) {
                    integer = "не простое и не составное";
                }
                else {
                    for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                            integer = "составное";
                        }
                    }
                }
                System.out.println(String.format("Введенное число %s, %s. Введите следующее число для проверки", evenNumber, integer));
            }
        }
    }
}

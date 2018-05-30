import java.util.Scanner;

//2. Создать программу, которая будет вычислять и выводить на экран сумму, разность, НОК и НОД двух целых чисел, введенных пользователем. Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.

public class NokNod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1S, num2S;
        int num1, num2, nod, nok, num1Mod, num2Mod;

        System.out.println("Поиск НОД и НОК двух чисел. Введите целые числа, не равные = 0");

        while (true) {
            System.out.println("Введите первое число.");
            num1S = sc.nextLine();

            System.out.println("Введите второе число.");
            num2S = sc.nextLine();
            if (num1S.contains(".") || num2S.contains(".")) {
                System.out.println("Введены некорректные данные. Введите целые числа, не равные = 0");
            }
            else {

                num1 = Integer.parseInt(num1S);
                num2 = Integer.parseInt(num2S);
                num1Mod = Math.abs(num1);
                num2Mod = Math.abs(num2);

                if (num1 == 0 || num2 == 0 || num1 % 1 != 0 || num2 % 1 != 0) {
                    System.out.println(String.format("Сумма двух чисел равна %s, разность равна %s", num1 + num2, num1 - num2));
                    System.out.println("Введены некорректные данные для расчёта НОД и НОК. Введите числа заново.");
                }
                else {
                    if (num1 == num2) {
                        System.out.println(String.format("Сумма двух чисел равна %s, разность равна 0", num1 * 2));
                        System.out.println(String.format("НОД чисел %s и %s = %s", num1, num1, num1));
                        System.out.println(String.format("НОK чисел %s и %s = %s", num1, num1, num1));
                    }
                    else {
                        while (num1Mod != 0 && num1Mod != 0) {
                            if (num1Mod > num2Mod) {
                                num1Mod %= num2Mod;
                            } else {
                                num2Mod %= num1Mod;
                            }
                        }
                        nod = num1Mod + num2Mod;
                        System.out.println(String.format("НОД чисел %s и %s = %s", num1, num2, nod));
                        nok = num1 * num2 / nod;
                        System.out.println(String.format("НОК чисел %s и %s = %s", num1, num2, nok));
                        break;
                    }
                }
            }
        }
    }
}

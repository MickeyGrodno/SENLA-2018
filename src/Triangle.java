import java.util.Scanner;

//6. Написать программу, которая проверяет три отрезка на возможность создать прямоугольный треугольник. Длина отрезков вводится вручную.

public class Triangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину первого отрезка");
        a = sc.nextInt();
        System.out.println("Введите второго первого отрезка");
        b = sc.nextInt();
        System.out.println("Введите третьего первого отрезка");
        c = sc.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("По заданным параметрам прямоугольный треугольник построить ВОЗМОЖНО.");
        } else {
            System.out.println("По заданным параметрам прямоугольный треугольник построить НЕВОЗМОЖНО.");
        }
    }
}

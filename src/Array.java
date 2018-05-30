
import java.util.*;

//7. Написать программу, которая рандомно генерирует массив 2-ух значных чисел длины N (вводится вручную) и выводит наименьшее и наибольшее число из списка.

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");

        int x = sc.nextInt();
        int[] arr = new int[x];

        Random random = new Random();

        for (int i = 0; i < x; i++) {
            arr[i] = (10 + random.nextInt(89));
        }
        Arrays.sort(arr);

        System.out.println("MIN = " + arr[0]);
        System.out.println("MAX = " + arr[x-1]);

    }
}

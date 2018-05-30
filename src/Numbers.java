import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//10. Написать программу, составляющую всевозможные комбинации 3-х значных чисел из 3-х введенных пользователем цифр. Цифры вводятся вручную.

public class Numbers {
    public static void main(String[] args) {

        String[] arr = new String[3];
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите значение №"+ (i+1));
            arr[i] = sc.nextLine();
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    set.add(arr[x]+arr[y]+arr[z]);
                }
            }
        }
        System.out.println("Возможный следующие комбинации:");
        for (Iterator iter = set.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}

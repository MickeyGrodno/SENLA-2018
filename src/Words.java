import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

//4. Создать программу, которая будет подсчитывать количество слов в предложении и выводить их в отсортированном виде. Предложение вводится вручную. (Разделители пробел (“ ”) и запятая (“,”)).

public class Words {
    public static void main(String[] args) {

        System.out.println("Введите строку для подсчёта количества слов");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();


        String[] words= text.split("[ ,]");
        int num = words.length;
        System.out.println("Количество слов "+ num);
        Arrays.sort(words);
        Stream.of(words).forEach(System.out::println);
    }
}


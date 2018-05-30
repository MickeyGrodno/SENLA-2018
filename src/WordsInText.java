import java.util.Scanner;
import java.util.stream.Stream;

//5. Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра) . Текст и слово вводится вручную.

public class WordsInText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text, word;

        System.out.println("Введите текст.");
        text = sc.nextLine();

        System.out.println("Введите слово для проверки.");
        word = sc.nextLine();


        long num = Stream.of(text.split("[^A-Za-zА-Яа-я]+"))
                .filter(word::equalsIgnoreCase)
                .count();
        System.out.println("Совпадений в тексте выявлено : " + num);
    }
}

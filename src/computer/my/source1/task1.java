package computer.my.source1;

import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        String name1 = "name1";
        String name2 = "name2";
        String name3 = "name3";

        int i = 0;
        while (i < 10){
            System.out.println(String.format("text out %d times", i + 1));
            i++;
        }

        int s = 5;
        int t = 6;
        int x = 7;

        String text = "\nМеня зовут Амиго.\n" +
                "\n" +
                "Я согласен на зарплату $10/месяц в первый год.\n" +
                "Я согласен на зарплату $20/месяц во второй год.\n" +
                "Я согласен на зарплату $30/месяц в третий год.\n" +
                "Я согласен на зарплату $40/месяц в четвертый год.\n" +
                "Я согласен на зарплату $50/месяц в пятый год.\n" +
                "\n" +
                "Спасибо за щедрость, друг Риша!\n\n";
        System.out.print(text);

        List list = Arrays.asList("Меня зовут Амиго.\n",
                "Я согласен на зарплату $800/месяц в первый год.",
                "Я согласен на зарплату $1500/месяц во второй год.",
                "Я согласен на зарплату $2200/месяц в третий год.",
                "Я согласен на зарплату $2700/месяц в четвертый год.",
                "Я согласен на зарплату $3200/месяц в пятый год.\n",
                "Поцелуй мой блестящий металлический зад!");
        list.forEach(System.out::println);

        String[] arr = new String[16];
        Arrays.fill(arr, "Слава Роботам! Убить всех человеков!");
        Arrays.asList(arr).forEach(System.out::println);
    }
}

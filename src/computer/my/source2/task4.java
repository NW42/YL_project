package computer.my.source2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Format;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) throws IOException {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println("Cats count is " + Cat.getCatsCount());


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        System.out.println(Math.min(a, b));

        a = Integer.parseInt(bufferedReader.readLine());
        b = Integer.parseInt(bufferedReader.readLine());
        int с = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        System.out.println(Math.min(Math.min(a, b), Math.min(a, b)));

        int[] arInt = new int[3];
        for (int i = 0; i < arInt.length; i++)
            arInt[i] = Integer.parseInt(bufferedReader.readLine());
        Arrays.sort(arInt);
        System.out.println(Arrays.toString(arInt));

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        System.out.println(name1.equals(name2) ? "Имена идентичны" : name1.length() == name2.length() ? "Длины имен равны" : "");

        name1 = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());
        if (age < 18)
            System.out.println(String.format("%s, подрасти ещё", name1));

        name1 = bufferedReader.readLine();
        age = Integer.parseInt(bufferedReader.readLine());
        if (age > 20)
            System.out.println(String.format("%s, 18 норм", name1));

        a = 0;
        while (a < 10){
            System.out.println(a + 1);
            a++;
        }

        while (a > 0){
            System.out.println(a);
            a--;
        }

        name1 = bufferedReader.readLine();
        a = Integer.parseInt(bufferedReader.readLine());
        while (a > 0){
            System.out.println(name1);
            a--;
        }

        a = 99;
        while (a > 0) {
            while (a % 10 != 0){
                System.out.print("S");
                a--;
            }
            System.out.print("S\n");
            a--;
        }

        a = 1;
        b = 1;
        while (a < 11) {
            while (b < 11) {
                System.out.print(a * b + "\t");
                b++;
            }
            System.out.print("\n");
            b = 1;
            a++;
        }


        for (int i = 0; i < 100; i++)
            if ((i + 1) % 2 == 0)
                System.out.print(i + 1 + " ");
        System.out.println("\n");

        a = Integer.parseInt(bufferedReader.readLine());
        b = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                System.out.print("8");
            System.out.print("8\n");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("8");
            System.out.print("8\n");
        }
        System.out.println("\n");

        for (int j = 0; j < 10; j++)
            System.out.print("8");
        for (int i = 0; i < 10; i++) {
            System.out.print("8\n");
        }

        name1 = bufferedReader.readLine();
        for (int i = 0; i < 10; i++)
            System.out.println(String.format("%s мамба", name1));
    }
}

class Cat{
    private String name;
    private String fullName;
    private static int catsCount;

    public Cat(){
        Cat.catsCount++;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public static void addNewCat() {
        Cat.catsCount++;
    }

    public void setName(String firstName, String lastName) {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }

    public static void setCatsCount(int catsCount){
        Cat.catsCount = catsCount;
    }

    public void setName(String name) {
        this.name = name;
    }
}

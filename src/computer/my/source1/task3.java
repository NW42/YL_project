package computer.my.source1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class task3 {
    public static void main(String[] args) throws IOException {
        System.out.println("some words");
        System.out.println(new SimpleDateFormat("MMM dd yyyy").format(new GregorianCalendar(1980, Calendar.MAY, 15).getTime()));
        Zerg[] zergs = new Zerg[10];
        for (int i = 0; i < zergs.length; i++) {
            zergs[i] = new Zerg();
            zergs[i].name = "zerg " + i;
        }
        Protos[] protoses = new Protos[5];
        for (int i = 0; i < protoses.length; i++) {
            protoses[i] = new Protos();
            protoses[i].name = "protos " + i;
        }
        Terran[] terrans = new Terran[12];
        for (int i = 0; i < terrans.length; i++) {
            terrans[i] = new Terran();
            terrans[i].name = "terran " + i;
        }

        System.out.println(factorialis(10));

        summNPrint(10);

        String sOne = "Mama";
        String sTwo = "Mila";
        String sThree = "Ramu";
        System.out.println(sOne + sTwo + sThree);
        System.out.println(sOne + sThree + sTwo);
        System.out.println(sTwo + sOne + sThree);
        System.out.println(sTwo + sThree + sOne);
        System.out.println(sThree + sOne + sTwo);
        System.out.println(sThree + sTwo + sOne);

        multTable(10);
        final String RAINBOW = "ROYGBIV";
        Color[] colors = new Color[7];
        for (int i = 0; i < colors.length; i++)
            colors[i] = new Color(Character.toString(RAINBOW.charAt(i)));
        System.out.println();

        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");

        System.out.println("日本語");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int year = Integer.valueOf(bufferedReader.readLine());
        System.out.println(String.format("%s захватит мир через %d лет", name, year));

        name = bufferedReader.readLine();
        int val1 = Integer.valueOf(bufferedReader.readLine());
        int val2 = Integer.valueOf(bufferedReader.readLine());
        System.out.println(String.format("%s получает %d через %d лет.", name, val1, val2));

        name = bufferedReader.readLine();
        System.out.println(String.format("%s зарабатывает $5,000", name));

        name = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        System.out.println(String.format("%s проспонсировал %s, и она стала известной певицей.", name, name2));

        name = bufferedReader.readLine();
        name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();
        System.out.println(String.format("%s + %s + %s = Чистая любовь", name, name2, name3));
    }

    static int factorialis(int argCount){
        if (argCount < 1)
            return 0;
        if (argCount == 1)
            return 1;
        return factorialis(argCount - 1) * argCount;
    }

    static void summNPrint(int argCount){
        int summ = 0;
        for (int i = 1; i < argCount + 1; i++)
            System.out.println(summ += i);
    }

    static void multTable(int count){
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print((i + 1) * (j + 1) + " ");
            }
            System.out.println("\n");
        }
    }

}



class Zerg extends Person{

}

class Protos extends Person{

}

class Terran extends Person{

}

class Color{
    private String name;

    public Color(String name){
        this.name = name;
        System.out.print(name);
    }
}

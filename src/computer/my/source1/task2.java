package computer.my.source1;

public class task2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.name = "Max";
        dog2.name = "Bella";
        dog3.name = "Jack";
        System.out.println("I am newbie");

        Cat[] cats = new Cat[10];
        for (int i = 0; i < 8; i++) {
            cats[i] = new Cat();
        }
        cats[8] = cats[0];
        cats[9] = cats[1];

        Cat cat3 = new Cat();
        Dog dog4 = new Dog();
        Fish fish = new Fish();
        cat3.owner = new Woman();
        dog4.owner = new Person();
        fish.owner = new Person();
        System.out.println(getMin4(3, 5, 1, 4));
        hattrickToOne("1111");
        hattrick("111322");
    }

    static int getMin2(int argFirst, int argSecond){
        return (argFirst < argSecond) ? argFirst : argSecond;
    }
    static int getMax2(int argFirst, int argSecond){
        return (argFirst > argSecond) ? argFirst : argSecond;
    }

    static int getMin3(int argFirst, int argSecond, int argThird){
        int oneTwoMin = getMin2(argFirst, argSecond);
        return (oneTwoMin < argThird) ? oneTwoMin : argSecond;
    }

    static int getMin4(int argFirst, int argSecond, int argThird, int argFourth){
        int oneTwoMin = getMin2(argFirst, argSecond);
        int thirdFourthMin = getMin2(argThird, argFourth);
        return (oneTwoMin < thirdFourthMin) ? oneTwoMin : thirdFourthMin;
    }

    static void hattrick(String argS){
        System.out.println(argS);
        System.out.println(argS);
        System.out.println(argS);
    }

    static void hattrickToOne(String argS){
        StringBuilder stringBuilder = new StringBuilder(argS);
        stringBuilder.append(" ").append(argS).append(" ").append(argS);
        System.out.println(stringBuilder);
    }

}

class Person{
    String name;
    int age;
}

class Woman extends Person{

}

class Rectangle{
    int x, y, width, height;
}

class Cat{
    Person owner;
    Rectangle territory;
    int age;
    String name;
}

class Dog extends Cat{

}

class Fish extends Cat{

}

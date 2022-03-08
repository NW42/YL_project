package computer.my.source2;

public class task5 {
    public static void main(String[] args) {
        CatTask5 cat1 = new CatTask5("mur", 2, 3, 5);
        CatTask5 cat2 = new CatTask5("ka", 4, 4, 6);
        CatTask5 cat3 = new CatTask5("mau", 1, 2, 2);
        Cat catAnother = new Cat();

        System.out.println(cat1.figth(cat2));
        System.out.println(cat2.figth(cat3));
        System.out.println(cat1.figth(cat3));


    }
}

class CatTask5{

    private String name;
    private int age;
    private int weight;
    private int strength;
    private String color;
    private String address;

    public CatTask5(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public CatTask5(){

    }

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.strength = 1;
    }

    public void initialize(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = 1;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.strength = 1;
    }

    public void initialize(int weight, String color) {
        this.age = 1;
        this.weight = weight;
        this.strength = 1;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 1;
        this.weight = weight;
        this.strength = 1;
        this.color = color;
        this.address = address;
    }

    public CatTask5(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.strength = 1;
    }

    public CatTask5(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = 1;
    }

    public CatTask5(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.strength = 1;
    }

    public CatTask5(int weight, String color) {
        this.age = 1;
        this.weight = weight;
        this.strength = 1;
        this.color = color;
    }

    public CatTask5(int weight, String color, String address) {
        this.age = 1;
        this.weight = weight;
        this.strength = 1;
        this.color = color;
        this.address = address;
    }


    public boolean figth(CatTask5 anotherCat){
        return (this.age + this.weight + this.strength) > (anotherCat.age + anotherCat.weight + anotherCat.strength);
    }
}

class DogTask5{
    private String name;
    private int age;
    private int height;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.height = 1;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.age = 1;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.age = 1;
        this.height = height;
        this.color = color;
    }

    public DogTask5(String name) {
        this.name = name;
        this.age = 1;
        this.height = 1;
    }

    public DogTask5(String name, int height) {
        this.name = name;
        this.age = 1;
        this.height = height;
    }

    public DogTask5(String name, int height, String color) {
        this.name = name;
        this.age = 1;
        this.height = height;
        this.color = color;
    }

}

class Friend{
    private String name;
    private int age;
    private boolean genderMale;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, boolean genderMale) {
        this.name = name;
        this.age = age;
        this.genderMale = genderMale;
    }

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, boolean genderMale) {
        this.name = name;
        this.age = age;
        this.genderMale = genderMale;
    }
}

class Rectangle{
    private int top;
    private int left;
    private int height;
    private int width;

    public void initialize(int top, int left, int height, int width) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public void initialize(int height, int width) {
        this.top = 0;
        this.left = 0;
        this.height = height;
        this.width = width;
    }
}

class Circle{
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}


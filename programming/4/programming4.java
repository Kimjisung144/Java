import java.util.*;
class Dog
{
    private String name;
    public String breed;
    private int age;
    public Dog(String name_s,int age_s)
    {
        this.name = name_s;
        this.age = age_s;
    }

    public Dog(String name_s, String breed, int age_s)
    {
        this.name = name_s;
        this.breed = breed;
        this.age = age_s;
    }

    public String toString()
    {
        return ("이름: "+this.name+"강아지이 종류: "+this.breed+"나이: "+this.age);
    }
    public String barking()
    {
        return "월월월";
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("orange","york",2);
        System.out.println(dog.toString());
        dog.barking();
    }
}

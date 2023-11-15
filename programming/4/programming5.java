import java.util.*;
class Student
{
    public String name;
    public long rollno;
    public int age;
    public Student()
    {
        System.out.println("매개변수가 없습니다.");
    }
    public Student(String name_s, long rollno_s, int age_s)
    {
        this.name = name_s;
        this.rollno = rollno_s;
        this.age = age_s;
        System.out.println("Student 객체가 생성되었습니다.");
    }
    public String toString()
    {
        return ("학생의 이름:"+this.name+ "\n학생의 학번: "+this.rollno+ "\n학생의 나이: "+this.age+"\n");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student("kim",0001,20);
        System.out.println(s);
    }
}

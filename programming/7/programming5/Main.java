import good.*;

public class Main
{
    public static void main(String[] args)
    {
        Animal dog = new Animal()
        {
            public void bark()
            {
                System.out.println("컹컹");
            }
        };
        dog.bark();
    }
}

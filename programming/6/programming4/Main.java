import src.*;

public class Main
{
    public static void main(String[] args)
    {
        ColorRectangle c = new ColorRectangle(100,100,"blue");
        System.out.println("가로"+c.width);
        System.out.println("세로"+c.height);
        System.out.println("색깔"+c.color);
    }
}

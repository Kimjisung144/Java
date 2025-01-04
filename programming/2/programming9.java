import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num1;
        num1 = sc.nextInt();
        while(num1 >= 1)
        {
            if(num1%2==1)
            {
                list.add(1);
            }else {
                list.add(0);
            }
            num1 = (int) num1/2;
        }
        System.out.println(list);
        for(int i = list.size()-1; i>=0; i--)
        {
            System.out.printf(list.get(i));
        }
    }
}

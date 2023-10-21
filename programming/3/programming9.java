import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int x = 0;
        int a[] = new int[10];
        a[0]=0;
        a[1]=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 항의 개수");
        x = sc.nextInt();

        for(int i=0;i<x-2;i++)
        {
            a[i+2] = a[i]+a[i+1];
        }
        for(int i=0;i<x;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int pay;
        int price;
        Scanner sc = new Scanner(System.in);
        pay = sc.nextInt();
        price = sc.nextInt();
        System.out.printf("받은 돈:%d\n",pay);
        System.out.printf("상품 가격:%d\n",price);
        System.out.printf("부가세 %.0f\n",price*0.1);
        System.out.printf("잔돈:%d",pay - price);
    }
}

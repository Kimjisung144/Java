import good.*;

import java.util.Scanner;

public class Main
{
    public static void menu()
    {
        System.out.println("1.현금입금\n2.현금출금\n3.계좌이체\n4.종료");
    }
    public static void main(String[] args)
    {
        Account b1 = new Account(10000);
        Account b2 = new Account(10000);
        int swi;
        int dep;//입금할 금액
        int transfer_s; // 이체 금액
        Scanner sc = new Scanner(System.in);
        boolean while_swi=true;
        while(while_swi) {
            System.out.printf("pin 번호를 입력해주세요:");
            int a = sc.nextInt();
            if(b1.get_pin() == a)
            {
                menu();
                swi = sc.nextInt();
                switch (swi)
                {
                    case 1:
                        System.out.printf("입금금액:");
                        dep = sc.nextInt();
                        b1.deposit(dep);
                        break;
                    case 2:
                        System.out.printf("출금금액:");
                        dep = sc.nextInt();
                        b1.inposit(dep);
                        break;

                    case 3:
                        System.out.printf("이체할 금액:");
                        transfer_s = sc.nextInt();
                        b1.transfer(transfer_s,b2);
                        break;
                    case 4:
                       while_swi=false;
                       break;
                    default:
                        System.out.println("문제생김");
                }
            }
            else
            {
                System.out.println("다시 입력해주세요:");
            }
        }
    }
}

//카드 5장 출력
public class Main {

    public static void main(String[] args)
    {
        String[] mo = {"Clubs","Diamonds","Hearts","Spades"}; // 카드 모양 모음
        String[] num = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}; // 카드 숫자 모음
        for(int i=0;i<5;i++)
        {
            System.out.println(mo[(int)(Math.random()*4)]+"의 "+num[(int)(Math.random()*13)]); // 카드 모양 숫자 랜덤하게 출력
        }
    }
}

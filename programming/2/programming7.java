public class Main{
    public static void main(String[] args)
    {
        int pay = 10000; //지불금액 저장 변수
        int value = 7500; //상품가격 저장 변수
        System.out.println("받은 돈: "+ pay); // 받은 돈 출력 
        System.out.println("상품 가격: "+ value); //상품 가격 출력
        System.out.println("부가세: "+(pay*0.1)); // 부가세 구하고 출력
        System.out.println("잔돈: "+(pay-value)); //잔돈 구하고 출력
    }
}

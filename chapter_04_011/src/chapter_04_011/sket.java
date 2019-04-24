package chapter_04_011;

import java.util.Scanner;

class Add{
	private int a,b;
	public void setvalue(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return a+b;
	}
}

class Mu1{
	private int a,b;
	public void setValue(int a, int b)
	{
		this.a =a;
		this.b =b;
	}
	public int calculate()
	{
		return a*b;
	}
class sub{
	private int a,b;
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return a-b;
	}
}
class Div {
	private int a,b;
	public void setValue(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		int res=0;
		try{
			res = a/b;
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return res;
	}
}
}
public class sket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시오:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char operator = sc.next().charAt(0);//CHAR AT(0)이 뭐지?
		switch(operator){
		case'+':
			Add add = new Add();
			add.setvalue(a,b);
			System.out.println(add.calculate());
			break;
		case'-':
			Sub sub = new Sub();
			sub.setvalue(a,b);
			System.out.println(sub.calculate());
			break;
		case'/':
			Div div = new Div();
			div.setvalue(a,b);
			System.out.println(div.calculate());
			break;
		case'*':
			Mu1 mu1 = new Mu1();
			mu1.setValue(a,b);
			System.out.println(mu1.calculate());
			break;
			default:
					System.out.println("잘못된 연산입니다.");
		}
	}

}

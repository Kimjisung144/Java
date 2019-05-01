package chapter04_ex11;

class calcex {
	public static int abs(int a) {return a<0?a:-a;}
	public static int max(int a,int b) {return(a>b)?a:b;}
	public static int min(int a,int b) {return (a>b)?b:a;}
}
public class calc{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcex.abs(-5));
		System.out.println(calcex.max(10, 8));
		System.out.println(calcex.min(-3, -8));
	}

}

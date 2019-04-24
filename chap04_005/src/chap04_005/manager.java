package chap04_005;

import java.util.Scanner;

public class manager {
	private double x,y;
	private int radius;
	
	public manager(double x, double y, int radius)
	{
		this.x  =x;
		this.y = y;
		this.radius = radius;
	}
	public void show()
	{
		System.out.println("("+ x +","+y+")"+radius);
	}
}
public class Circle {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		manager c [] = new manager [3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();	 
			int radius = scanner.nextInt();
			c[i] = new manager(x,y,radius);
		}
		for(int i=0; i<c.length; i++) c[i].show();
		scanner.close();
	}
}

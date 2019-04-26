package chap04_ex03;

public class circle {
	int radius;
	String name;
	
	public circle()
	{
		radius = 1;
		name = "";
	}
	public circle(int r, String n)
	{
		radius =r;
		name = n;
	}
	
	public double getarea()
	{
		return 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle pizza  = new circle(10,"ÇÇÀÚ");
		double area  = pizza.getarea();
		System.out.println(pizza.name+area);
		
		circle donut = new circle();
		donut.name = "¹¹Áö";
		area = donut.getarea();
		System.out.println(donut.name+area);
		
	}

}

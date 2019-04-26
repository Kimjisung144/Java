
public class circle {
	int radius;
	String name;
	public circle(){
		
	}
	public double getarea()
	{
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle pizza;
		pizza = new circle();
		pizza.name = "책을피자";
		pizza.radius = 5;
		double area = pizza.getarea();
		System.out.println(pizza.name + "의 면적" + area);

		circle donut;
		donut = new circle();
		donut.name = "대가리";
		donut.radius = 10;
		double area1 = donut.getarea();
		System.out.println(donut.name + "의크기" + area1);

	}

}

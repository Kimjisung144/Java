package sket;

public class eceer {
	int re;
    String name; 
    
    public eceer() {
    	
    }
    
    public double getArea(){
    	return 3.14*re*re;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eceer pizza;
		pizza = new eceer();
		pizza.name = "����";
		pizza.re=5;
		double area = pizza.getArea();
		System.out.println(pizza.name+" "+pizza.getArea());
		
		eceer dounet;
		dounet = new eceer();
		dounet.name="�밡��";
		dounet.re=10;
		double area1 = dounet.getArea();
		System.out.println(dounet.name+dounet.getArea());
	}

}

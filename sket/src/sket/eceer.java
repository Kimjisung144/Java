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
		pizza.name = "µµ³Ó";
		pizza.re=5;
		double area = pizza.getArea();
		System.out.println(pizza.name+" "+pizza.getArea());
		
	}

}

package chapter04_prac04;

public class rectangle {
	
	private int x,y,width,height;//x,y,��,����//
	
	public rectangle(int x,int y,int width,int height)
	{
		
	}
	
	public void show()
	{
		System.out.print("("+x+","+y+")����");
		System.out.println("ũ�Ⱑ " + width + "x" + height+ "�� �簢��");
	}
	public int square()
	{
		return width*height;
	}
	
	public boolean contains(rectangle r)
	{
		if(x<r.x&&y<r.y
				&& x+width>r.x+r.width
				&& y+height > r.y+r.height) return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r = new rectangle(2, 2, 8, 7);
		rectangle s = new rectangle(5, 5, 6, 6);
		rectangle t = new rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}

}

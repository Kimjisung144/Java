package chapter04_prac04;

public class rectangle {
	
	private int x,y,width,height;//x,y,폭,높이//
	
	public rectangle(int x,int y,int width,int height)
	{
		
	}
	
	public void show()
	{
		System.out.print("("+x+","+y+")에서");
		System.out.println("크기가 " + width + "x" + height+ "인 사각형");
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
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}

}

package chapter_007;

public class tv {

	private String tvname;
	private int year;
	private int size;
	
	public tv (String tvname,int year,int size)
	{
		this.tvname = tvname;
		this.year = year;
		this.size = size;
	}
	
	public void show()
	{
		System.out.printf(this.tvname + "에서 제조한");
		System.out.println(this.year + "년도형");
		System.out.println(this.size + "인치");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tv mytv = new tv("samsung",2018,50);
		 mytv.show();
	}

}

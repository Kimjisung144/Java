package chapter04_ex05;

public class book {
	String title;
	String author;
	
	void show(){
		System.out.println(title+" "+author);
	}
	
	public book()
	{
		this("", "");
	}
	
	public book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book littlePrince = new book("�����", "����");
		book loveStory = new book("����ģ��", "����");
		book emptyBook = new book();

		littlePrince.show();
		loveStory.show();
	}

}

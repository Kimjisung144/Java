package chapter04_prac03;

import java.util.Scanner;

public class sing {
	private String title;
	private String artist;
	private String coutry;
	private int year;
	
	public sing(String title,String artist,String coutry,int year){
		this.title = title;
		this.artist = artist;
		this.coutry = coutry;
		this.year = year;
	}
	public void show()
	{
		System.out.println(title);
		System.out.print(year+"�߸ſ��� ");
		System.out.print(coutry+"���� ");
		System.out.print(artist+"���� ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		String title = cs.nextLine();
		String artist = cs.nextLine();
		String coutry = cs.nextLine();
		int year = cs.nextInt();
		sing myfor = new sing(title,artist,coutry,year);
		myfor.show();		
	}

}

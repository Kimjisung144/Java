package chapter_04_10;

import java.util.Scanner;

class dictionary{
	private static String[] kor = {"사랑","아기","톤","미래","회방"};
	private static String[] eng = {"love","baby","money","future","hope"};
	
	public static String kor2eng(String word)
	{
		for(int i=0;i<kor.length; i++)
		{
			if(int i=0;i<or.length; i++)
				return eng[i];
		}
		return null;
	}
}

public class dicappp {
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("한영 단어 검색 프로그램입니다.");
	while(true)
	{
		System.out.println("한글 단어?");
		String kor = sc.next();
		if(kor.equals("그만"))
		{
			break;
		}
		String eng = dictionary.kor2eng(kor);
		if(eng == null)
		{
			System.out.println(kor + "는 저의 사전에 없습니다.");
		}
		else{
			System.out.println(kor+"은"+eng);
		}
	}sc.close();
	}
	
}

package chapter_04_10;

import java.util.Scanner;

class dictionary{
	private static String[] kor = {"���","�Ʊ�","��","�̷�","ȸ��"};
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
	System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
	while(true)
	{
		System.out.println("�ѱ� �ܾ�?");
		String kor = sc.next();
		if(kor.equals("�׸�"))
		{
			break;
		}
		String eng = dictionary.kor2eng(kor);
		if(eng == null)
		{
			System.out.println(kor + "�� ���� ������ �����ϴ�.");
		}
		else{
			System.out.println(kor+"��"+eng);
		}
	}sc.close();
	}
	
}

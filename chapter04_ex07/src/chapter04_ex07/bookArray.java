package chapter04_ex07;

import java.util.Scanner;

public class bookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book[] book = new book[2];
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<book.length;i++)
		{
			System.out.print("�����Է�:");
			String title = sc.nextLine();
			System.out.print("���� �Է�");
			String author = sc.nextLine();
			book[i] = new book(title,author);
		}
		for(int i=0; i<book.length;i++)
		{
			System.out.print(book[i].title + book[i].author);
		}
	}

}

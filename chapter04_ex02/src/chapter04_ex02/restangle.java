package chapter04_ex02;

import java.awt.Rectangle;
import java.util.Scanner;

public class restangle {
		// TODO Auto-generated method stub
		int width;
		int height;

		public restangle() {

		}

		public int getArea() {
			return width * height;

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Rectangle rect = new Rectangle();
			Scanner scanner = new Scanner(System.in);

			System.out.print("값을 입력하세요.>>");
			rect.height = scanner.nextInt();
			rect.width = scanner.nextInt();
			System.out.printfln("사각형의 면적은"+rect.getArea());
			scanner.close();

	}

}

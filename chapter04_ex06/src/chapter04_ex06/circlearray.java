package chapter04_ex06;

public class circlearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle[] c;
		c = new circle[5];
		for(int i=0; i<c.length;i++)
		{
			c[i] = new circle(i);
		}
		for(int i = 0;i<c.length;i++)
		{
			System.out.println(int(c[i].getarea())+"");
		}
	}

}

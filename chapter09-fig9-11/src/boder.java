import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class boder extends JFrame {
public boder()
{
	setTitle("borderlayout samples");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new BorderLayout(30,20));
	c.add(new JButton("add"),BorderLayout.NORTH);
	c.add(new JButton("sub"),BorderLayout.SOUTH);
	c.add(new JButton("mu1"),BorderLayout.EAST);
	c.add(new JButton("div"),BorderLayout.WEST);
	c.add(new JButton("calculate"),BorderLayout.CENTER);
	setSize(300, 200);
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new boder();
	}

}

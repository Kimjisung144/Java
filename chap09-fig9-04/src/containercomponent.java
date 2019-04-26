import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class containercomponent extends JFrame{
	public containercomponent()
	{
		setTitle ("container & Component");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null);
		this.setBackground(Color.gray);
		
		Panel1 p1 = new Panel1();
		p1.setSize(150,150);
		p1.setLocation(10,10);
		add(p1);
		Panel2 p2 = new Panel2();
		p2.setSize(150,150);
		p2.setLocation(170,10);
		add(p2);
		
		JButton btn = new JButton("OK");
		btn.setLocation(130, 170);
		btn.setSize(70, 30);
		add(btn);
		setSize(350, 250);
		setVisible(true);
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			add(new JLabel("Type ID"));
			add(new JTextField(10));
			add(new JLabel("Type Password"));
			add(new JTextField(10));						
		}
	}
	
	private class Panel2 extends JPanel {
		Panel2() {
			setBackground(Color.GREEN);
			add(new JLabel("Please Check!!"));
			add(new JCheckBox("C# JCheckBox"));
			add(new JCheckBox("C++ JCheckBox"));			
		}
	}
	
	public static void main(String[] args) {
		new containercomponent();
	}
}

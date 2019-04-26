import javax.swing.*;
import java.awt.*;

public class jfameEx extends JFrame{
	public  jfameEx(){
		
		setTitle("프레임 구성");
		
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("edit");
		JMenu sourceMenu = new JMenu("sourceMenu");
		JMenu searchMenu = new JMenu("search");
		JMenu windowMenu = new JMenu("window");
		
		mb.add(fileMenu);
		mb.add(editMenu);
		mb.add(sourceMenu);
		mb.add(sourceMenu);
		mb.add(searchMenu);
		mb.add(windowMenu);
		setJMenuBar(mb);
		
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().setBackground(new Color(186, 143, 45));
		this.add(new JButton("add"));
		this.add(new JButton("sub"));
		this.add(new JButton("mu1"));
		this.add(new JButton("div"));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new jfameEx();
	}

}

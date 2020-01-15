package calculator;

import java.awt.*;
import java.awt.event.*;

public class AgeCalculator extends WindowAdapter implements ActionListener   
{
	Frame f;
	MenuBar mb;
	Menu m1,m2,m3;
	TextField tf1,tf2;
	Label l1,l2;
	Button b1;
	
	AgeCalculator()
	{
		
				
		f=new Frame("Age Calculator");
		f.setSize(400,300);
		f.setVisible(true);
		f.setLayout(new BorderLayout());
		f.setBackground(Color.LIGHT_GRAY);
		f.addWindowListener(this);
		mb=new MenuBar();
		f.setMenuBar(mb);
		l1=new Label("YOUR D.O.B.");
		l2=new Label("TODAY'S DATE");
		l1.setBounds(40, 50, 80, 30);
		l2.setBounds(20,110, 100, 30);
		f.add(l1);f.add(l2);
		tf1=new TextField("");
		tf2=new TextField("");
		tf1.setBounds(125, 50, 150, 25);
		tf2.setBounds(125,110, 150, 25);
		f.add(tf1);f.add(tf2);
		
		m1= new Menu("FILE");
		m2= new Menu("view");
		m3= new Menu("edit");
		mb.add(m1);mb.add(m2);mb.add(m3);
		
		b1=new Button("CALCULATE AGE");
		b1.setBounds(130, 170, 110, 40);
		f.add(b1);
        b1.addActionListener(this);
		
	}
	public static void main(String args[])
	{
		new AgeCalculator();
	}
	
	public void windowClosing(WindowEvent we)
	{
		f.dispose();
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		Object o=ae.getSource();
		
		if(o.equals(b1))
		{
			
		}
		
	}

}

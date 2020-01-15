package calculator;
import java.awt.*;
import java.awt.event.*;
public class calculator extends WindowAdapter implements ActionListener
{
	int c,n;
	float x;
	String s1="",s2="";
	Frame f;
	Label L;
	 TextArea tf;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	public calculator()
	{
         f=new Frame ("my calculator");
         f.setSize(400,400);
         f.setVisible(true);
         f.setLayout(null);
         f.setBackground(Color.LIGHT_GRAY);
         tf=new TextArea();
         f.addWindowListener(this);
         L =new Label("");
         b1=new Button("CE");
         b2=new Button("C");
         b3=new Button("OFF");
         b4=new Button("<<");
         b5=new Button("1");
         b6=new Button("2");
         b7=new Button("3");
         b8=new Button("+");
         b9=new Button("4");
         b10=new Button("5");
         b11=new Button("6");
         b12=new Button("-");
         b13=new Button("7");
         b14=new Button("8");
         b15=new Button("9");
         b16=new Button("*");
         b17=new Button("0");
         b18=new Button(".");
         b19=new Button("/");
         b20=new Button("=");
         L.setBounds(20, 30, 300, 30 );
         tf.setBounds(20, 70, 300, 40);
         b1.setBounds(20, 120, 50, 30);
         b2.setBounds(80, 120, 50, 30);
         b3.setBounds(140, 120, 50, 30);
         b4.setBounds(200, 120, 50, 30);
         b5.setBounds(20, 160, 50, 30);
         b6.setBounds(80, 160, 50, 30);
         b7.setBounds(140, 160, 50, 30);
         b8.setBounds(200, 160, 50,30);
         b9.setBounds(20, 200, 50, 30);
         b10.setBounds(80, 200, 50, 30);
         b11.setBounds(140,200, 50, 30);
         b12.setBounds(200, 200, 50, 30);
         b13.setBounds(20, 240, 50, 30);
         b14.setBounds(80, 240, 50, 30);
         b15.setBounds(140, 240, 50, 30);
         b16.setBounds(200, 240,50, 30);
         b17.setBounds(20, 280,50, 30);
         b18.setBounds(80, 280, 50, 30);
         b19.setBounds(140, 280, 50, 30);
         b20.setBounds(200, 280, 50, 30);
        
         f.add(b1);f.add(b2);f.add(b3);f.add(b5);f.add(b4);
         f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);
         f.add(b11);f.add(b12);f.add(b13);f.add(b14);f.add(b15);
         f.add(b16);f.add(b17);f.add(b18);f.add(b19);f.add(b20);
         f.add(tf);f.add(L);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this); 
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         b10.addActionListener(this);
         b11.addActionListener(this);
         b12.addActionListener(this);
         b13.addActionListener(this);
         b14.addActionListener(this);
         b15.addActionListener(this);
         b16.addActionListener(this);
         b17.addActionListener(this);
         b18.addActionListener(this);
         b19.addActionListener(this);
         b20.addActionListener(this);
         }    
	public static void main(String[] args) {
		   new calculator();
		}
	public void windowClosing(WindowEvent w)
	{
	f.dispose();
	}
	 public void actionPerformed(ActionEvent ae)
	 {
		 Object obj=ae.getSource();
	        if(obj.equals(b1))
	        {	
	        	tf.setText(" ");
	             L.setText(" ");
	            
	        }
	       else if(obj.equals(b2))
	            tf.setText(" ");
	        else if(obj.equals(b3))
	            System.exit(0);
	        else if(obj.equals(b4))
	        {
	        	s1=tf.getText();
	        	n=s1.length()-1;
	        s1=s1.substring(0,n);
	        tf.setText(s1);
	        
	        }
	        	
	        else if(obj.equals(b5))
	        	tf.append("1");
	        else if(obj.equals(b6))
	        	tf.append("2");	
	        else if(obj.equals(b7))
	        	tf.append("3");	
	        else if(obj.equals(b8))
	        {
	        	 s1=tf.getText();
	        	 L.setText(s1+" +");
	        	tf.setText("");
	        	c=1;
	         }
	        else if(obj.equals(b9))
	        	tf.append("4");		
	        else if(obj.equals(b10))
	        	tf.append("5");
	       else if(obj.equals(b11))	
	    	   tf.append("6");
	       else if(obj.equals(b12))
	       {
	    	   s1=tf.getText();
	        	 L.setText(s1+" -");
	        	tf.setText("");
	        	c=2;
	       }
	       else if(obj.equals(b13))
	    	   tf.append("7");
	       else if(obj.equals(b14))
	    	   tf.append("8"); 
	       else if(obj.equals(b15))
	    	   tf.append("9");	 
	       else if(obj.equals(b16))
	       {
	    	   s1=tf.getText();
	        	 L.setText(s1+" *");
	        	tf.setText("");
	        	c=3;
	       }
	        						 
	       else if(obj.equals(b17))
	    	   tf.append("0");						 
	       else if(obj.equals(b18))
	    	   tf.append(".");				 
           else if(obj.equals(b19))
           {
        	   s1=tf.getText();
	        	 L.setText(s1+" /");
	        	tf.setText("");
	        	c=4;
           }
          else if(obj.equals(b20))
          {
        	  s2=tf.getText();
        	  if(c==1)
        	  {    
        		  x=Float.parseFloat(s1)+Float.parseFloat(s2);
        		  tf.setText(String.valueOf(x));
        		  L.setText("");
        	  }
        	  else if(c==2)
        	  {
        		  x=Float.parseFloat(s1)-Float.parseFloat(s2);
        		  tf.setText(String.valueOf(x));  
        		  L.setText("");
        	  }
        	  else if(c==3)
        	  {
        		  x=Float.parseFloat(s1)*Float.parseFloat(s2);
        		  tf.setText(String.valueOf(x));
        		  L.setText("");
        	  }
        	  else if(c==4)
        	  { // try {
        		  float p=Float.parseFloat(s2);
        	//  if(p!=0)
        	  {
        		  x=Float.parseFloat(s1)/Float.parseFloat(s2);
        		  tf.setText(String.valueOf(x));
        		  L.setText("");
        	  }
        	 // else
        	//  {
        	//	  tf.setText("INFINITE");
        		//  L.setText("");
        	  }
        	         }
        	 // catch(Exception e) {}
        	  
        	  }
          //}
	 }
	 
//}

import java.awt.*;
import javax.swing.*;
class Layout 
{
	 JFrame f;
	 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Layout(String s){
		f=new JFrame(s);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
	   f.add(b1);
      f.add(b2);
	  f.add(b3);
      f.add(b4);
     f.add(b5);
     f.add(b6);
	 f.add(b7);
	 f.add(b8);
	 f.add(b9);
	 f.setLayout(new GridLayout(3,3,100,100));
	 f.setSize(400,400);
	 f.setVisible(true);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new Layout("my");

	}
}

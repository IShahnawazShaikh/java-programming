import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
class Calculator implements ActionListener
{
	int i,c=0,j;
		double scValue,value1=0,value2,Answer=0;
		String sc1,sc2,s,s1,s2,ss="";
	 JTextArea jf,jf1;
	 JFrame frame;
	 JButton buttons[]=new JButton[20];
	 JButton Buttons[]=new JButton[7];

     Calculator(){
	 jf=new JTextArea();
	 frame=new JFrame("My frame");
	 frame.setLayout(null);
	 for(i=0;i<11;i++){
		  if(i==10){
		   buttons[i]=new JButton("100");    
		  }
		  else{
		         buttons[i]=new JButton(""+i);
		  }
	 }
	  buttons[11]=new JButton("-");
	  buttons[12]=new JButton("x");
	 buttons[13]=new JButton("/");
	  buttons[14]=new JButton("ANS");
	 buttons[15]=new JButton("CLR");
	   buttons[16]=new JButton("+");
	   buttons[17]=new JButton("Previos Ans");
	   buttons[18]=new JButton("Scientific");
	   buttons[19]=new JButton("100");

	  jf.setBounds(40,20,341,30);
	  buttons[0].setBounds(40,55,60,50);
	  buttons[1].setBounds(110,55,60,50);
	  buttons[2].setBounds(180,55,60,50);              //number from 0-4
	  buttons[3].setBounds(250,55,60,50);
	  buttons[4].setBounds(320,55,60,50);

	  buttons[5].setBounds(40,115,60,50);
	  buttons[6].setBounds(110,115,60,50);
	  buttons[7].setBounds(180,115,60,50);
	  buttons[8].setBounds(250,115,60,50);                   //Number from 5-9
	  buttons[9].setBounds(320,115,60,50);

	    buttons[10].setBounds(40,175,60,50);                    //100
    

	  
	  buttons[11].setBounds(110,175,60,50);                 
	  buttons[12].setBounds(180,175,60,50);
	  buttons[13].setBounds(250,175,60,50);                     //operator
      buttons[14].setBounds(320,175,60,50);

      buttons[15].setBounds(40,235,163,50);                 //CLR
	  buttons[16].setBounds(213,235,163,50);               //  +  sign
	  

	  buttons[17].setBounds(40,295,163,50);               //prev Ans
	   buttons[18].setBounds(213,295,163,50);           //Scientific
	  
	 for(i=0;i<20;i++){

	 frame.add(buttons[i]);
	 }
	 for(i=0;i<19;i++)
		 {
		 buttons[i].setBackground(Color.green);
		 buttons[i].setForeground(Color.black);
		 if(i>=11){
		 buttons[i].setBackground(Color.blue);
	     buttons[i].setForeground(Color.yellow);
		 }
		 if(i==14){
           buttons[i].setBackground(Color.pink);
	     buttons[i].setForeground(Color.black);
		 }
      if(i==18){
           buttons[i].setBackground(Color.red);
	     buttons[i].setForeground(Color.black);
		 }

	}
	 frame.add(jf);
	 jf.setBackground(Color.yellow);
	 jf.setForeground(Color.black);
	 frame.setSize(500,500);
	 frame.setVisible(true);
	 jf.setText("");

	 for(i=0;i<11;i++){
	 buttons[i].addActionListener(this);
	 }
	 buttons[11].addActionListener(this);
	 buttons[12].addActionListener(this);
	 buttons[13].addActionListener(this);
	 buttons[14].addActionListener(this);
	 buttons[15].addActionListener(this);
	  buttons[16].addActionListener(this);
	  buttons[17].addActionListener(this);
	  buttons[18].addActionListener(this);
}


  Calculator(int a){
	  jf=new JTextArea();
	 frame=new JFrame("My frame");
	  frame.setLayout(null);
     frame.add(jf);
	 jf.setBackground(Color.yellow);
	 jf.setForeground(Color.black);
     frame.setSize(500,500);
	 frame.setVisible(true);
      Buttons[0]=new JButton("SINX(rad)");
	  Buttons[1]=new JButton("SINX(deg)");
	  Buttons[2]=new JButton("COSX(rad)");
      Buttons[3]=new JButton("COSX(deg)");
       Buttons[4]=new JButton("TANX(rad)");
      Buttons[5]=new JButton("TANX(deg)");
	  Buttons[6]=new JButton("CLEAR");
	   
       jf.setBounds(40,20,341,30);
	  Buttons[0].setBounds(40,55,106,48);            //sine radian
	  Buttons[1].setBounds(156,55,106,48);        //sine angle
	  Buttons[2].setBounds(276,55,106,48);         //cos radian
	  Buttons[3].setBounds(40,115,106,48);      //cos angle 
	  Buttons[4].setBounds(156,115,106,48);        //Tan radian 
	  Buttons[5].setBounds(276,115,106,48);            //Tan angle
      Buttons[6].setBounds(40,175,345,48);           //clear
	  for(i=0;i<7;i++){
		 frame.add(Buttons[i]);
	    }
		for(i=0;i<7;i++){
		if(i==6){
		   Buttons[i].setBackground(Color.green);
		   Buttons[i].setForeground(Color.black);
		  }
		  else{
		  Buttons[i].setBackground(Color.black);
		  Buttons[i].setForeground(Color.white);
		  }
		}
      for(i=0;i<7;i++){
	 Buttons[i].addActionListener(this);
	  }
	 
  }
	 public void actionPerformed(ActionEvent e){
		if(ss.equals("")){
		 for(j=0;j<11;j++){
		 if(e.getSource()==buttons[j]){
			 s=String.valueOf(j);
			       if(s.equals("10")){
				      s="100";
				   }
			 jf.append(""+s);	 
		  s1=jf.getText();
		 value1=Double.parseDouble(s1);
		}           //if
	}         //loop
		}   //if close
	i=0;
	j=0;
   if(e.getSource()==buttons[16]){
		s2="+";
		value2=value1;
		i=0;
		j=0;
		jf.setText("");
		}
 if(e.getSource()==buttons[11]){
		s2="-";
		value2=value1;
		i=0;
		j=0;
		jf.setText("");
	 }
    if(e.getSource()==buttons[12]){
		s2="x";
		value2=value1;
		i=0;
		j=0;
		jf.setText("");
	 }
    if(e.getSource()==buttons[13]){
		s2="/";
		value2=value1;
		i=0;
		j=0;
		jf.setText("");
	 }
if(e.getSource()==buttons[14]){
     if(s2.equals("+")){
     Answer=value1+value2;
	 		jf.setText(String.valueOf(Answer));
			value1=0;
    }
     if(s2.equals("-")){
    Answer=value2-value1;
			jf.setText(String.valueOf(Answer));
 value1=0;
	}
     if(s2.equals("x")){
    Answer=value1*value2;
			jf.setText(String.valueOf(Answer));
    value1=0;
	}
    if(s2.equals("/")){
    Answer=value2/value1;
    jf.setText(String.valueOf(Answer));
    value1=0;
	}
}
		if(e.getSource()==buttons[15]){
			jf.setText("");

		}
		if(e.getSource()==buttons[17]){
			 jf.setText(String.valueOf(Answer));
			s1=jf.getText();
		 value1=Double.parseDouble(s1);
		}

  if(e.getSource()==buttons[18]){
	  new Calculator(1);
    }

	  for(i=0;i<7;i++){
	   if(e.getSource()==Buttons[i]){
		     sc1=String.valueOf(i);
			 sc2=jf.getText();
		    scValue=Double.parseDouble(sc2);
			 if(sc1.equals("0")){
		        jf.setText(String.valueOf(Math.sin(scValue)));
			 }
	 		if(sc1.equals("1")){ 
			 scValue=(scValue*Math.PI)/180;
			 jf.setText(String.valueOf(Math.sin(scValue)));
		   }

		    if(sc1.equals("2")){
		        jf.setText(String.valueOf(Math.cos(scValue)));
			 }
	 		if(sc1.equals("3")){ 
			 scValue=(scValue*Math.PI)/180;
			 jf.setText(String.valueOf(Math.cos(scValue)));
		   } 

		   if(sc1.equals("4")){
		        jf.setText(String.valueOf(Math.tan(scValue)));
			 }
	 		if(sc1.equals("5")){ 
			 scValue=(scValue*Math.PI)/180;
			 jf.setText(String.valueOf(Math.tan(scValue)));
		   } 
		   if(sc1.equals("6")){
		        jf.setText(" ");
		   }
		}
	  }   //loop
}
	public static void main(String[] c)
	{
		Calculator cal=new Calculator();
	}
}
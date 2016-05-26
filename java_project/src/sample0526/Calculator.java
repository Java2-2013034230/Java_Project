package sample0526;
import javax.swing.*;
import java.awt.*;
public class Calculator extends JFrame {
	
	String s[] = {"Backspace","","","CE","C","7","8","9","/","sqrt","4","5","6","*","%",
			"1","2","3","-","1/x","0","*/-",".","+","="}; 
	
	public Calculator(){
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JTextField t = new JTextField(20);
	JPanel p = new JPanel();
	p.setLayout(new GridLayout(0,5,3,3));
	for(int i=0;i<s.length;i++){
		p.add(new JButton(s[i]));
	}
	
	add(t, BorderLayout.NORTH);
	add(p, BorderLayout.CENTER);
	
	pack();
	setVisible(true);		
	}

}

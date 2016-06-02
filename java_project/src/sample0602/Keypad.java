package sample0602;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Keypad extends JFrame {
	
	JPanel P1,P2,P3;
	JLabel L1;
	JTextField T1;
	
	public Keypad(){
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		P1 = new JPanel();
		P2 = new JPanel();
		P3 = new JPanel();
		P3.setLayout(new GridLayout(0,3));
		add(P1, BorderLayout.NORTH);
		add(P2, BorderLayout.CENTER);
		add(P3, BorderLayout.SOUTH);
		L1 = new JLabel("any key press");
		T1 = new JTextField(20);
		P1.add(L1);
		P2.add(T1);
		
		
		
		for(int i=1;i<10;i++){
			JButton B = new JButton(""+i);
			P3.add(B);
			B.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String actionCommand = e.getActionCommand();
					T1.setText(T1.getText()+actionCommand);
				}
			});
		}
		pack();
		setVisible(true);
		
	}

}

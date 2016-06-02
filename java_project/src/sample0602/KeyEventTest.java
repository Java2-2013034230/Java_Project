package sample0602;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class KeyEventTest extends JFrame implements KeyListener {
	
	private JPanel P1;
	private JTextField T1;
	private JTextArea A1;
	
	public KeyEventTest(){
		P1 = new JPanel(new GridLayout(0,2));
		P1.add(new JLabel("문자를 입력하세요:"));
		T1 = new JTextField(10);
		P1.add(T1);
		A1 = new JTextArea(3,30);
		add(P1, BorderLayout.NORTH);
		add(A1, BorderLayout.CENTER);
		
		T1.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(300,400);
		setVisible(true);
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new KeyEventTest();
	}
   
	public void KeyTyped(KeyEvent e){
		display(e, "Key Typed");
	}
	public void KeyPressed(KeyEvent e){
		display(e,"Key Pressed");
	}
	public void KeyReleased(KeyEvent e){
		display(e, "Key Released");
	}
	
	protected void display(KeyEvent e, String s){
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		A1.append(""+s+"문자"+c+"(코드"+keyCode+")");
	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}





}

package sample0526;
import javax.swing.*;

import java.awt.event.*;

class MyFrame extends JFrame{
	
	private JButton button;
	private JLabel label;
	
	public MyFrame(){
		
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");

	JPanel panel = new JPanel();
	button = new JButton("버튼을 누르시오");
	label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
	
	button.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==button){
				label.setText("마침내 버튼이 눌러졌습니다.");
			}
		}
	});
    panel.add(button);
    panel.add(label);
    
    this.add(panel);
    this.setVisible(true);
	
	}
}

public class ActionEventTest4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyFrame t = new MyFrame();
	}

}

package p22_09_26;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class InfoView {
	
	// 1. 멤버변수선언
	JFrame f;
	JTextField tfName, tfID, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	// 2. 멤버 변수 객체생성
	InfoView() {
		f= new JFrame("DBTest");
		
		tfName = new JTextField(15);
		tfID = new JTextField();
		tfTel = new JTextField();
		tfGender = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		
		ta = new JTextArea();
		
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("cancel");
		bExit = new JButton("Exit");
		
		
		
	}
	
	
	// 3. 화면구성하고 출력
		/*
		 * 전체 프래임 BorderLayout 지정
		 * 		-West	: JPanel 붙이기 (GridLayout (6,2))  
		 * 		-Center	: TextArea
		 * 		-South	: JPanel 붙이기 (GridLayout (1,6))
		 */
	
	public void addLayout () { 
		
		f.setLayout(new BorderLayout()); //BorderLayout a = new BorderLayout();
		
		JPanel sp = new JPanel(new GridLayout(1, 6));
		
				
		sp.add(bAdd);
		sp.add(bShow);
		sp.add(bSearch);
		sp.add(bDelete);
		sp.add(bCancel);
		sp.add(bExit);
		
		f.add(sp, BorderLayout.SOUTH);
		
		JPanel wp = new JPanel(new GridLayout(6, 2));
		
		wp.add(new JLabel("Name", JLabel.CENTER));
		wp.add(tfName);
		wp.add(new JLabel("ID", JLabel.CENTER));
		wp.add(tfID);
		wp.add(new JLabel("Tel", JLabel.CENTER));
		wp.add(tfTel);
		wp.add(new JLabel("Sex", JLabel.CENTER));
		wp.add(tfGender);
		wp.add(new JLabel("Age", JLabel.CENTER));
		wp.add(tfAge);
		wp.add(new JLabel("Home", JLabel.CENTER));
		wp.add(tfHome);
		
		f.add(wp, BorderLayout.WEST);
		
		
		
		f.add(ta, BorderLayout.CENTER);
		
		
		f.setBounds(100, 100, 700, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}
	

	public static void main(String[] args) {
		
		
		InfoView info = new InfoView();
		info.addLayout();

	}
}

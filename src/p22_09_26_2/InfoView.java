package p22_09_26_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import b_info.InfoView;

public class InfoView {
	
	// 1. 멤버변수선언
	JFrame f;
	JTextField tfName, tfID, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	// 2. 멤버 변수 객체생성
	InfoView() {
		
		
	}
	
	
	// 3. 화면구성하고 출력
		/*
		 * 전체 프래임 BorderLayout 지정
		 * 		-West	: JPanel 붙이기 (GridLayout (6,2))  
		 * 		-Center	: TextArea
		 * 		-South	: JPanel 붙이기 (GridLayout (1,6))
		 */
	
	public void addLayout () { 
		
		
	}
	

	public static void main(String[] args) {
		
		
		InfoView info = new InfoView();
		info.addLayout();

	}
}

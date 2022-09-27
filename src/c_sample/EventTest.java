package c_sample;

import java.awt.*;
import java.awt.event.*;			//awt에서도 폴더는 포함하지 않기 때문에, 따로 써줘야함

import javax.swing.*;


/*
 * 
 * 		화면(JFrame)에 '확인 버튼 하나 출력
 */
	



public class EventTest {
	
	JFrame f;
	
	JButton click;
	
	EventTest() {
		f = new JFrame("테스트창");
		
		
		click = new JButton("버튼생성");
		
		//(2) 핸들러 객체 생성
		MyHandler hdlr = new MyHandler();
		//(3) 이벤트 발생할 컴포넌트와 연결
		click.addActionListener(hdlr);
		
	}
	
	// (1) 이벤트 핸들러 만들기
	//		핸들러 - 이벤트 처리 클래스 ( 구현까지)
	class MyHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(null, "이벤트발생");
			
		}
		
	}
	
	public void addLayout () {
		
		f.setLayout(new FlowLayout());
		
		f.add(click);
		
		
		
		f.setBounds(100, 100, 700, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	

	public static void main(String[] args) {
		
		EventTest test = new EventTest();
		
		test.addLayout();

	}

}

package p22_09_28;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Kiosk {
	
	// 1. 멤버변수선언
	JFrame f;
	JTextArea ta;
	JButton m1, m2, m3, m4;
	Food food;
	
	// 2. 멤버 변수 객체생성
	Kiosk() {
		f = new JFrame("Kiosk");
		m1 = new JButton("<html>&nbsp;Burger<br> 6000원</html>");
		m2 = new JButton("<html>&nbsp;Steak<br> 8000원</html>");
		m3 = new JButton("<html>&nbsp;Pasta<br> 7000원</html>");
		m4 = new JButton("<html>&nbsp;Burger<br> 5000원</html>");
		
		food = new Food(this);
				
		
		ta = new JTextArea(40, 20);
		
				
		
		
	}
	
	// 3. 화면구성하고 출력
	/*
	 * 전체 프래임 BorderLayout 지정
	 * 		-West	: JPanel 붙이기 (GridLayout (6,2))  
	 * 		-Center	: TextArea
	 * 		-South	: JPanel 붙이기 (GridLayout (1,6))
	 */
	public void addLayout () {
		
		//레이아웃 생성
		f.setLayout(new BorderLayout());
		
		f.add(ta, BorderLayout.WEST);	//text area 위치 조정
		ta.setPreferredSize(new Dimension(250, 100));	//text area 사이즈 조정
		


		
		
		
		Panel pne = new Panel();		
		pne.setLayout(new GridLayout(2, 2));
		
		
		
		pne.add(m1);
		pne.add(m2);
		pne.add(m3);
		pne.add(m4);
			
		
		f.add(pne, 	BorderLayout.EAST);		//메뉴 패널 위치 조정
		pne.setPreferredSize(new Dimension(300, 400));		//메뉴 패널 사이즈 조정
		
		
		//첫번째 이미지
		m1.setIcon(new ImageIcon("src\\p22_09_28\\image\\1.png"));
		m1.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m1.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		m1.setToolTipText("첫번째 메뉴 입니다.");	//마우스를 올렸을 때 나오는 글
		m1.setMnemonic('G');				//단축키
		
		//두번째 이미지
		m2.setIcon(new ImageIcon("src\\p22_09_28\\image\\2.png"));
		m2.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m2.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		m2.setToolTipText("두번째 메뉴 입니다.");	//마우스를 올렸을 때 나오는 글
		m2.setMnemonic('S');				//단축키
		
		//세번째 이미지
		m3.setIcon(new ImageIcon("src\\p22_09_28\\image\\3.png"));
		m3.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m3.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		m3.setToolTipText("세번째 메뉴 입니다.");	//마우스를 올렸을 때 나오는 글
		m3.setMnemonic('P');				//단축키
		
		//네번재 이미지
		m4.setIcon(new ImageIcon("src\\p22_09_28\\image\\4.png"));
		m4.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m4.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		m4.setToolTipText("네번째 메뉴 입니다.");	//마우스를 올렸을 때 나오는 글
		m4.setMnemonic('B');				//단축키
		
		
		JTabbedPane tab = new JTabbedPane();	//탭 생성
		tab.addTab("양식", pne);		//탭 이름 밑 어디에 붙히는지 설정
		
		f.add(tab, BorderLayout.CENTER);

		
				
		
		
		
		f.setBounds(100, 100, 600, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public void eventProc() {
		
//		btn.addActionListener(new ActionListener() {		
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				
//				panelA.aLa.setText("Welcome");
//				
//				
//
//								
//			}			
//		});	
		
		
		
		
	
	}		//end of eventProc
	

	
	
	
	public static void main(String[] args) {
		
		
		Kiosk info = new Kiosk();
		info.addLayout();
		info.eventProc();

	}

}

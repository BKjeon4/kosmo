package d_calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalTest {
	
	//1. 멤버변수 선언
	JFrame f;			//프레임 변수 선언
	JTextField tf;		//텍스트필드 변수 선언
	JButton []bNum = new JButton[10];		//0~9 숫자 표현할 버튼
	JButton []bOp = new JButton[4];	// +, -, *, / 연산자를 표현할 버튼
	JButton bEqual;			// = 연산자
	
	int first, second;		// 값을 내기 위한 저장 값 ( 두자리 이상의 수를 입력하려면 필요
	String op;				// 연산자 값을 내주기 위한 임시저장장소
	
	//2. 객체 생성
	CalTest() {
		f = new JFrame("유치원");		//프레임 생성 (첫문장)
		tf = new JTextField();		// 텍스트 필수 객체 생성
		bEqual = new JButton("=");	// = 연산자 객체 생성
		for (int i = 0; i < bNum.length; i++) {			
			bNum[i] = new JButton(String.valueOf(i));		// (JButton이 받을 수 있는 건 String 타입 밖에 없음)
			
		}	//end of for
		
		bOp[0] = new JButton("+");
		bOp[1] = new JButton("-");
		bOp[2] = new JButton("*");
		bOp[3] = new JButton("/");
		//연산자는 반복되는게 아니라서 반복문 대신 직접 입력
		
		
		
	} 	//end of CalTest()
	
	//3. 화면 구성 및 화면 출력
	void addLayout() {				//첫번째 메소드
		f.setLayout(new BorderLayout());			//레이아웃 생성 ( BorderLayout 은 동,서,남,북 원하는 곳에 위치를 시킬 수 있음)
		f.add(tf, BorderLayout.NORTH);				//텍스트필드를 윗쪽에 추가
		
		//f.add(tf, BorderLayout.NORTH);
		
		
		JPanel pns = new JPanel();					// 패널 생성
		pns.setLayout(new GridLayout(5, 3));		// 패널 안에 layout(Grid 타입)으로 5,3 행과 열 맞춰줌
		for(int i = 1; i < bNum.length; i++) {		// 버튼에 번호를 순서대로 넣어주기. bNum[1] (숫자 1) 번 부터~
			pns.add(bNum[i]);
		}	// end of for loop
		
		pns.add(bOp[0]);					//계산기 버튼 순서를 맞춰주기 위함 (+)
		pns.add(bNum[0]);					// (0)
		pns.add(bEqual);					// (=)
		pns.add(bOp[1]);					// (-)
		pns.add(bOp[2]);					// (*)
		pns.add(bOp[3]);					// (/)
		
		f.add(pns, BorderLayout.CENTER );			// 버튼을 만들고 붙여놓은 패널을 센터에 위치
		pns.setPreferredSize(new Dimension(200, 200));		// 패널 사이즈 조정
		
		tf.setPreferredSize(new Dimension(1000, 25));		// 텍스트필드 사이즈 조정
		
		
		//처음 프레임 만들고 반복적으로 만들어 줘야 하는 목록
		f.setBounds(100,100,350,350);			// bounds(범위) 라는 뜻에 걸맞는 생성 위치와 프레임 크기 설정	
		f.setVisible(true);						// 만든 프레임을 볼 수 있게 설정
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		// close 버튼 (x)을 누르면 계속 진행되는 콘솔도 같이 닫아 줌
																	// 설정 하지 않을 시, 프레임을 terminate 버튼을 눌러 수동으로 멈춰줘야함
		
	}	//end of addLayout()
	
	//---------------------------------------------------
	//4. 이벤트 처리
	void eventProc() {
		//숫자 버튼이 눌렸을 때
		for (int i = 0; i < bNum.length; i++) {
			bNum[i].addActionListener(new ActionListener() {		

				@Override
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton eBtn = (JButton) e.getSource();
					String su = (tf.getText()+eBtn.getText());
					//String su = eBtn.getText();

					tf.setText(su);						
				}			
			});
		}
		//연산자 버튼이 눌렸을 때
		
		
		for (int j = 0; j < bOp.length; j++) {	
		
			bOp[j].addActionListener(new ActionListener() {		

				@Override
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton eBtn = (JButton) e.getSource();
					op= eBtn.getText();
					first = Integer.parseInt(tf.getText());		
					tf.setText("");
				}			
			});
		}
		
//		for (int j = 0; j < bOp.length; j++) {
//			String su = Integer.toString(j);			
//			bOp[j].addActionListener(new ActionListener() {					
//				public void actionPerformed(ActionEvent e) {					
//					tf.setText(su);									
//				}	// end of actionPerformed		
//			});		//end of addActionListener(ActionListener)
//		}		//end of for
//		
		// = 버튼이 눌렸을 때
		
		bEqual.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				second = Integer.parseInt(tf.getText());
				int result = 0;
				switch(op) {				
				case "+" : result = first + second; break;
				case "-" : result = first - second; break;
				case "*" : result = first * second; break;
				case "/" : result = first / second; break;
				}
				tf.setText(String.valueOf(result));							
			}			
		});
		
		
		
	}	//end of eventProc()
	

	public static void main(String[] args) {
		CalTest cal = new CalTest();	//CalTest 객체 생성
		cal.addLayout();	//addLayout method 호출
		cal.eventProc();	//eventProc method 호출

	}	//end of main method

}	//end of public class CalTest

package a_sample;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

/*
 *	자바의 GUI(Graphic User Interface)  :화면 
 *	- AWT : 1.2 이전
 *	- Swing : 1.2 이후
 *			대부분 클래스 앞에 J
 * 
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ATest {	//has a
	
	JFrame f;
	JButton btn, cancel;
	JCheckBox cbJava, cbOracle;		//보통 체크박스는 다중 선택이 필요 할 때 씀
	JRadioButton male, female;		// 하나만 클릭하고 싶을 땐 라디오 버튼
	JTextField tf;
	JTextArea ta;
	
	ATest() {
		f = new JFrame("나의 첫장");
		btn = new JButton("클릭");	// 빠져 있으면 null 값
		cancel = new JButton("취소");
		cbJava = new JCheckBox("Java");	
		cbOracle = new JCheckBox("Oracle");
		male = new JRadioButton("남자");
		female = new JRadioButton("여자");
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		
		tf = new JTextField(20);
		ta = new JTextArea(40, 20);
		

		
		
		
		//f.add(new JTextField("이름을 입력하세요."));
		//f.add(new JTextArea("번호를 입력해주세요."));
		
	}
	
	void addLayout() {
		//FlowLayout f1 = new FlowLayout();
		//f.setLayout(new FlowLayout());	//FlowLayout 은 한줄로 쭉 배치
		//f.setLayout(new GridLayout(3, 3));	//입력한, 행, 열에 맞춰서 배치
		f.setLayout(new BorderLayout());	// 동,서,남,북, 가운데 배치
		
		
		// 붙이기 작업
		f.add(btn	, BorderLayout.NORTH);
		f.add(cancel, BorderLayout.SOUTH);
		//f.add(cbJava);
		//f.add(cbOracle);
		
		JPanel pEast = new JPanel();
		pEast.add(male);
		pEast.add(female);
		f.add(pEast		,BorderLayout.EAST);
		
		//f.add(male	,BorderLayout.EAST);
		//f.add(female, BorderLayout.EAST);
		f.add(new JLabel("입력하세요"), BorderLayout.WEST);
		//f.add(tf	,BorderLayout.EAST);
		f.add(ta	,BorderLayout.CENTER);
		
		
		// 화면 출력
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 프레임 창에서 x 버튼만 눌러도 나갈 수 있게, 나중에 따로 Terminate 버튼 안눌러도 됨
	}

	public static void main(String[] args) {
		
		ATest a = new ATest();
		a.addLayout();

	}

}

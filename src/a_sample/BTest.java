package a_sample;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class BTest extends JFrame {	//is a
	
	JButton btn, cancel;
	JCheckBox cbJava, cbOracle;		//보통 체크박스는 다중 선택이 필요 할 때 씀
	JRadioButton male, female;		// 하나만 클릭하고 싶을 땐 라디오 버튼
	
	BTest() {
		super("나의 두번재 장");
		btn = new JButton("확인");
		cancel = new JButton("취소");
		cbJava = new JCheckBox("java");
		cbOracle = new JCheckBox("Oracle");
		male = new JRadioButton("남자");
		female = new JRadioButton("여자");
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		add(new JLabel("입력하세요"));
	}
	void addLayout() {
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		
		add(btn);
		add(cancel);
		add(cbJava);
		add(cbOracle);
		add(male);
		add(female);
		
		setBounds(100,100,500,350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		
		BTest b = new BTest();
		b.addLayout();
		
		
		

	}

}

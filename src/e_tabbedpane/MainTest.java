package e_tabbedpane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class MainTest {

	JFrame f;
	JButton btn;
	JLabel la;
	
	PanelA panelA;
	PanelB panelB;
	PanelC panelC;
	
	
	MainTest() {
		f = new JFrame("나의 창");
		btn = new JButton("확인");
		la = new JLabel("데이터");
		
		
		panelA = new PanelA(this);
		panelB = new PanelB();
		panelC = new PanelC();
		
				
	}	//end of MainTest
	void addLayout() {
		
		//레이아웃 지정
		f.setLayout(new BorderLayout());	
		f.add(btn, BorderLayout.EAST);
		f.add(la, BorderLayout.SOUTH);
		
		// 탭 지정
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("메인", panelA);
		tab.addTab("서브", panelB);
		tab.addTab("기타", panelC);
		f.add(tab, BorderLayout.CENTER);
		
		
		// 화면출력
		f.setBounds(100,100,500,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	//end of addLayout
	
	public void eventProc() {
		// '확인(btn)' 버튼이 눌렸을 때
		btn.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				panelA.aLa.setText("Welcome");
				
				

								
			}			
		});	
	}	//end of eventProc	
	
	public static void main(String[] args) {
		
		MainTest test = new MainTest();
		test.addLayout();
		test.eventProc();
		

	}

}

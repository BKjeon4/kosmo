package e_tabbedpane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel{
	
	JLabel aLa = new JLabel("판데기A");
	JButton aBtn = new JButton ("A 버튼");
	
	MainTest parent;
	
	
	public PanelA(MainTest mainTest) {
		
		parent = mainTest;
		setBackground(new Color(255, 0, 0));		// RGB (Red, Green, Blue) 기본 색은 검은색, 0~255(최대치) 까지 설정 가능
		addLayout();
		eventProc();
		
		
		
	}
	
	void addLayout() {
		add(aLa);
		add(aBtn);
	}
	
	
	void eventProc() {
		aBtn.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				parent.la.setText("하윙");
				
				

								
			}			
		});	
		
		
	}

}

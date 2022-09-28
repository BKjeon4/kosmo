package e_tabbedpane_원본.copy;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel{
	
	JLabel aLa = new JLabel("Welcome");
	JButton aBtn = new JButton ("A 버튼");
	
	
	public PanelA() {
		setBackground(new Color(255, 0, 0));		// RGB (Red, Green, Blue) 기본 색은 검은색, 0~255(최대치) 까지 설정 가능
		addLayout();
		eventProc();
		
		
		
	}
	
	void addLayout() {
		add(aLa);
		add(aBtn);
	}
	
	
	void eventProc() {
		
		
	}

}

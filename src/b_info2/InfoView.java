package b_info2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoView {
	
	// 1. 멤버변수선언
	JFrame f;
	JTextField tfName, tfID, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	// 2. 멤버 변수 객체생성
	InfoView() {
		f = new JFrame("DBTest");
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cencel");
		bExit = new JButton("Exit");
		
		tfName = new JTextField(15);
		tfID = new JTextField();
		tfTel = new JTextField();
		tfGender = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		
		
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
		
		//f.setLayout(new GridLayout(6,2));
		f.setLayout(new BorderLayout());
		
		f.add(ta, BorderLayout.CENTER);
		
		
//		f.add(new JLabel("Name"), BorderLayout.WEST);
//		f.add(new JLabel("ID"), BorderLayout.WEST);
//		f.add(new JLabel("Tel"), BorderLayout.WEST);
//		f.add(new JLabel("Sex"), BorderLayout.WEST);
//		f.add(new JLabel("Age"), BorderLayout.WEST);
//		f.add(new JLabel("Home"), BorderLayout.WEST);
		
		
		
		Panel pns = new Panel();		
		pns.setLayout(new GridLayout(1, 6));
		
		pns.add(bAdd);
		pns.add(bShow);
		pns.add(bSearch);
		pns.add(bDelete);
		pns.add(bCancel);	
		
		f.add(pns, 	BorderLayout.SOUTH);

		Panel pnw = new Panel();
		pnw.setLayout(new GridLayout(6, 2));
		pnw.add(new JLabel("Name", JLabel.CENTER));
		pnw.add(tfName);
		pnw.add(new JLabel("ID", JLabel.CENTER));
		pnw.add(tfID);
		pnw.add(new JLabel("Tel", JLabel.CENTER));
		pnw.add(tfTel);
		pnw.add(new JLabel("Sex", JLabel.CENTER));
		pnw.add(tfGender);
		pnw.add(new JLabel("Age", JLabel.CENTER));
		pnw.add(tfAge);
		pnw.add(new JLabel("Home", JLabel.CENTER));
		pnw.add(tfHome);
		
		f.add(pnw, BorderLayout.WEST);
		
		


		

		
		
		
		
		f.setBounds(100, 100, 770, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public void eventProc() {
		bAdd.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "이벤트발생3");				
			}			
		});	
		
	}
	
	public static void main(String[] args) {
		
		
		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();

	}

}

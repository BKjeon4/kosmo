package b_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
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
		bExit = new JButton("Exit (alt+x)");
		bExit.setMnemonic('x');				//단축키


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
		pns.add(bExit);
		bExit.setIcon(new ImageIcon("src\\b_info\\iamge\\1.png"));
		bExit.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		bExit.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		bExit.setRolloverIcon(new ImageIcon("src\\b_info\\iamge\\2.png"));			//마우스오버 (롤오버)
		bExit.setPressedIcon(new ImageIcon("src\\b_info\\iamge\\3.png"));			//마우스클릭 (프레스)
		bExit.setToolTipText("프로그램을 종료합니다.");
		bExit.setMnemonic('x');				//단축키

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

	//이벤트 처리 함수
	public void Eventproc() {
		// 'ADD' 버튼이 눌렸을 때
		bAdd.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "이벤트발생1");				
			}			
		});			

		// ID 입력창에서 엔터 쳤을 때

		tfID.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				getJuminInfo();
				String jumin = tfID.getText();
				if( jumin.length() != 14) {
					JOptionPane.showMessageDialog(null, "-을 포함한 14자를 맞춰주세요");	
					return;
				}
				//JOptionPane.showMessageDialog(null, jumin);



				// (1) 주민번호의 7번째 문자로 성별을 구하여 성별창에 출력 (charAt)
				char sung = jumin.charAt(7);				

				if(sung == '1' || sung =='3' || sung =='9') {
					tfGender.setText("남자");
				}else if (sung == '2' || sung == '4' || sung =='0'){
					tfGender.setText("여자");
				}else {
					tfGender.setText("입력값을 찾을 수 없습니다.");
				}


				// (2) 주민번호의 8번째 문자로 출신지를 구하여 출신지창에 출력 (

				char chul = jumin.charAt(8);

				// chul 변수가 0이라면 '서울
				// chul 변수가 1이라면 '인천/부산'
				// chul 변수가 2이라면 '경기'
				// chul 변수가 9라면 '제주'

				String home=null;

				switch (chul) {	//문자, 정수, 문자열 
				case '0': 
					home = "서울";
					tfHome.setText(home);
					break;
				case '1':
					home = "인천/부산";
					tfHome.setText(home);
					break;
				case '2':
					home = "경기";
					tfHome.setText(home);
					break;
				case '3':
					home = "대구";
					tfHome.setText(home);
					break;
				case '4':
					home = "대전";
					tfHome.setText(home);
					break;
				case '5':
					home = "구미";
					tfHome.setText(home);
					break;
				case '9':
					home = "제주";
					tfHome.setText(home);
					break;
				default :
					home = "입력한 값이 올바르지 않습니다.";
					tfHome.setText(home);
				}	



				// (3) 주민번호에서 년도에 의해 나이를 구해서 나이창에 출력

				String age = jumin.substring(0, 2); //age = "00"
				//문자열 -> 정수 변환

				int nai = Integer.parseInt(age);

				int old = 0;



				Calendar c = Calendar.getInstance();
				int year = c.get(Calendar.YEAR);

				if(sung == '1' || sung == '2' ) {
					old = year - (1900 + nai) +1;

					String a = String.valueOf(old);
					tfAge.setText(a);

				}else if (sung == '3' || sung == '4') {
					old = year - (2000 + nai) +1;
					//String b = String.valueOf(old);
					String b = Integer.toString(old);
					tfAge.setText(b);

				}else {
					tfAge.setText("잘못입력했습니다.");

				}


			}

		});

		//주민번호 입력창에서 포커스 이벤트 발생 했을 때
		tfID.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void focusLost(FocusEvent e) {
				getJuminInfo();

			} //end of addFocusListener	

		});	// end of AeventProc

		






		// 'ADD' 버튼이 눌렸을 때
		bShow.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "이벤트발생2");				
			}			
		});			

		bSearch.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "이벤트발생3");				
			}			
		});		

		bDelete.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "이벤트발생4");				
			}			
		});		

		bCancel.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "이벤트발생5");				
			}			
		});		

		bExit.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "이벤트발생6");				
			}			
		});		
	}
	
	void getJuminInfo() {

	}

	public static void main(String[] args) {


		InfoView info = new InfoView();
		info.addLayout();
		info.Eventproc();


	}

}

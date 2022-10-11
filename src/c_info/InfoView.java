package c_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

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
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bEdit;
	
	// 비지니스로직 - 모델단
	InfoModel model;
	
	// 2. 멤버 변수 객체생성
	InfoView() {
		f = new JFrame("DBTest");
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cencel");
		bEdit = new JButton("수정하기");
		
		tfName = new JTextField(15);
		tfID = new JTextField();
		tfTel = new JTextField();
		tfGender = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		
		//center 입력창
		ta = new JTextArea(40, 20);
		
		// 모델객체 생성
		try {
			model = new InfoModelImpl();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		 
		
		
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
		pns.add(bEdit);
		
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
		// Add 버튼이 눌렸을 대
		bAdd.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				insertData();
				//JOptionPane.showMessageDialog(null, "이벤트발생3");				
			}			
		});	
		// cancel 버튼이 눌렸을 대
		bCancel.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
								
			}			
		});	
		// Show 버튼이 눌렸을 때
		bShow.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				selectAll();
				//JOptionPane.showMessageDialog(null, "이벤트발생3");				
			}			
		});	
		
		// bSearch 버튼이 눌렸을 때
		bSearch.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				selectByTel();
				//JOptionPane.showMessageDialog(null, "이벤트발생3");				
			}			
		});	
		// 전화번호 텍스트필드에서 엔터 쳤을 때
		tfTel.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				selectByTel();
				//JOptionPane.showMessageDialog(null, "이벤트발생3");				
			}			
		});	
		
		//bDelete 버튼이 눌렸을 때
		
		bDelete.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				deleteByTel();
				//JOptionPane.showMessageDialog(null, "이벤트발생3");				
			}			
		});
		
		// 수정하기 버튼을 눌렀을 때 발생하는 이벤트
		bEdit.addActionListener(new ActionListener() {		

			@Override
			public void actionPerformed(ActionEvent e) {
				edit();
				//JOptionPane.showMessageDialog(null, "이벤트발생3");				
			}			
		});
		
	}		//end of eventProc
	
	void edit() {
		InfoVO vo = new InfoVO();
		
		vo.setName(tfName.getText());
		vo.setAge(Integer.parseInt(tfAge.getText()));
		vo.setGender(tfGender.getText());
		vo.setHome(tfHome.getText());
		vo.setId(tfID.getText());
		vo.setTel(tfTel.getText());
		
		try {
			model.edit(vo);
			clearText();
			selectAll();
		} catch (SQLException e) {
			ta.setText("수정실패 : " + e.getMessage());
		}
		
		
		
	}
	
	void deleteByTel() {
		// (1) 입력한 전화번호 값을 얻어오기
		String tel = tfTel.getText();
		
		// (2) 모델단에 deleteByTel() 호출
		try {
			int rc = model.delete(tel);
			ta.setText("삭제성공 : " + rc);
			
		} catch (SQLException e) {
			ta.setText("삭제실패 : " + e.getMessage());
		}
		

	}
	
	void selectByTel() {
		try {
		// (1) 입력한 전화번호 값을 얻어오기
		String tel = tfTel.getText();
		// (2) 모델단에 selectByTel () 호출
		InfoVO vo = model.selectByTel(tel);
		// (3) 받은 결과를 각각의 텍스트 필드에 값을 지정 (출력)
		tfName.setText(vo.getName());
		tfAge.setText(Integer.toString(vo.getAge()));
		tfGender.setText(vo.getGender());
		tfHome.setText(vo.getHome());
		tfID.setText(vo.getId());
		tfTel.setText(vo.getTel());
		
		}catch(Exception ex) {
			ta.setText("전화번호 검색 실패 : " + ex.getMessage());
		}
	}
	
	void selectAll() {
		try {
			ArrayList<InfoVO> data = model.selectAll();
			ta.setText(" ---- 검색결과 ----- \n\n");
			for (InfoVO vo : data) {
				ta.append(vo.toString());
			}
		} catch (SQLException e) {
			ta.setText("검색실패: " + e.getMessage());
		}
	}
	

	void insertData() {
		
		// (1) 사용자입력값 얻어오기
		String name = tfName.getText();
		int age = Integer.parseInt(tfAge.getText());
		String gender = tfGender.getText();
		String home = tfHome.getText();
		String id = tfID.getText();
		String tel = tfTel.getText();
		
		// (2) 1번의 값들을 InfoVO에 지정	- (1) 생성자 (2) setter
		InfoVO vo = new InfoVO(); 	//1번 생성자 방법으로 하려면, () 안에 name, id, tel, gender, age, home 넣어줘야 함
		
		vo.setName(name);
		vo.setId(id);
		vo.setTel(tel);
		vo.setGender(gender);
		vo.setAge(age);
		vo.setHome(home);
		
		
		
		
		// (3) 모델의 insertInfo() 호출
		
		try {
						model.insertInfo(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// (4) 화면의 입력값들을 지우기
		clearText();
	
	} //end of isnertData

	// text 필드 초기화
	void clearText() {
		tfName.setText(null);
		tfAge.setText(null);
		tfGender.setText(null);
		tfHome.setText(null);
		tfID.setText(null);
		tfTel.setText(null);
		
	}
	
	
	public static void main(String[] args) {
		
		
		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();

	}

}

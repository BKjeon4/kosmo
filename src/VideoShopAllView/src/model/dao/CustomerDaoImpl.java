package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.CustomerDao;
import model.vo.CustomerVO;

public class CustomerDaoImpl implements CustomerDao{
	
	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@192.168.0.164:1521:xe";
	final static String USER = "BKjeon";
	final static String PASS = "jeon";
	
	
	public CustomerDaoImpl() throws Exception{
	 	// 1. 드라이버로딩
		Class.forName(DRIVER);
		System.out.println("드라이버로딩 성공");
		
	}
	
	/*
	 * 사용자 입력값을 받아서 DB에 저장하는 역할
	 */
	
	public void insertCustomer(CustomerVO vo) throws Exception{
		// 2. Connection 연결객체 얻어오기
		
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			
		// 3. sql 문장 만들기
		String sql = "INSERT INTO CUST(TEL, ADDTEL, NAME, ADDR, EMAIL) VALUES(?,?,?,?,?)";
		// 4. sql 전송객체 (PreparedStatement)
		ps = con.prepareStatement(sql);
		// ?세팅 -#
		ps.setString(1, vo.getCustTel1());
		ps.setString(2, vo.getCustTel2());
		ps.setString(3, vo.getCustName());
		ps.setString(4, vo.getCustAddr());
		ps.setString(5, vo.getCustEmail());
		
		// 5. sql 전송
		ps.executeUpdate();
		
		} finally {
			// 6. 닫기
			ps.close();
			con.close();

		}
	} // end of insertCustomer()
	
	
	
	/*
	 * 메소드명 	: selectByTel
	 * 인자		: 검색할 전화번호
	 * 리턴값		: 전화번호 검색에 따른 고객정보
	 * 역할		: 사용자가 입력한 전화번호를 받아서 해당하는 고객정보를 리턴
	 * 
	 */
	
	public CustomerVO selectByTel(String tel) throws Exception{
		
		
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		CustomerVO dao = new CustomerVO();
		
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
		
		// 3. sql 문장 만들기		
		String sql = "SELECT * FROM CUST WHERE tel = ?";
		
		// 4. 전송객체
		ps = con.prepareStatement(sql);
		ps.setString(1, tel);
				
		// 5. 전송 - executeQuery()
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			dao.setCustName(rs.getString("NAME"));
			dao.setCustAddr(rs.getString("ADDR"));
			dao.setCustEmail(rs.getString("EMAIL"));
			dao.setCustTel1(rs.getString("TEL"));
			dao.setCustTel2(rs.getString("ADDTEL"));
			
		}
		rs.close();
		
		
		// 	 결과물 CustmerVO 에 담기
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
			
		}
				
		return dao;
		
	}
	
	public int updateCustomer(CustomerVO vo) throws Exception{
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;


		try {
			con = DriverManager.getConnection(URL, USER, PASS);		

		//3. sql 작성
			String sql = "UPDATE CUST SET NAME =?, TEL = ?, ADDTEL = ?, ADDR = ?, EMAIL =? WHERE TEL =?";
					
		//4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCustName());
			ps.setString(2, vo.getCustTel1());
			ps.setString(3, vo.getCustTel2());
			ps.setString(4, vo.getCustAddr());
			ps.setString(5, vo.getCustEmail());
			ps.setString(6, vo.getCustTel1());
			
		//5. 전송 -
		ps.executeUpdate();
		

			
		int result = 0;
		
		
		return result;
		
		}finally {
			// 6. 닫기
			ps.close();
			con.close();
			
		}
	}
}

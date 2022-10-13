package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.RentDao;


public class RentDaoImpl implements RentDao{



	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@192.168.0.164:1521:xe";
	final static String USER = "BKjeon";
	final static String PASS = "jeon";


	public RentDaoImpl() throws Exception{
		// 1. 드라이버로딩
		Class.forName(DRIVER);
		System.out.println("드라이버로딩 성공");

	}

	/*
	 * 사용자 입력값을 받아서 DB에 저장하는 역할
	 */




	@Override
	public void rentVideo(String tel, int vnum) throws Exception {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);	

			// 3. sql 작성

			String sql = "INSERT INTO RENT(rentno, vidno, tel, ret)"
					+ "VALUES(seq_rent.NEXTVAL, ?, ?, 'N')";

			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, String.valueOf(vnum));
			ps.setString(2, tel);



			// 5. sql 전송
			ps.executeUpdate();

		}finally {
			// 6. 닫기
			ps.close();
			con.close();

		}



	}

	@Override
	public void returnVideo(int vnum) throws Exception {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);	
			// 3. sql 작성
			String sql = "UPDATE RENT SET ret = 'Y' Where vidno = ? AND ret = 'N'";

			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, String.valueOf(vnum));

			// 5. sql 전송
			ps.executeUpdate();


		}finally {
			// 6. 닫기
			ps.close();
			con.close();

		}

	}

	@Override
	public ArrayList selectList() throws Exception {
		ArrayList data = new ArrayList();

		// 2. Connection 연결객체 얻어오기

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);

			// 3. sql 문장
			
			String sql = "SELECT v.vidno vidno, i.tit tit, c.name name, c.tel tel , r.rentdate + 3 AS returndate, r.ret ret"
					+ " FROM CUST c INNER JOIN RENT r "
					+ " ON c.tel =r.tel "
					+ " INNER JOIN video v "
					+ " ON r.vidno = v.vidno "
					+ " INNER JOIN VID_INFO i "
					+ " ON v.infono = i.infono "
					+ " WHERE r.ret = 'N'";
			System.out.println(sql);
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);



			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next() ) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getInt("vidno"));
				temp.add(rs.getString("tit"));
				temp.add(rs.getString("name"));
				temp.add(rs.getString("tel"));
				temp.add(rs.getString("returndate"));
				temp.add(rs.getString("ret"));
				data.add(temp);

			}
			rs.close();

			return data;
		} finally {
			// 6. 닫기
			ps.close();
			con.close();

		}
	}

	@Override
	public String selectName(String tel) throws Exception {

		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		String name = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);	

			// 3. sql 작성

			String sql = "SELECT NAME FROM CUST WHERE TEL = ?";


			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);


			// 5. sql 전송

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				name = rs.getString("NAME");
			}

		}finally {
			// 6. 닫기
			ps.close();
			con.close();

		}

		return name;
	}


}

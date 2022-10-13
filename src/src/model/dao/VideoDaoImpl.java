package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.VideoDao;
import model.vo.VideoVO;

public class VideoDaoImpl implements VideoDao{


	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@192.168.0.164:1521:xe";
	final static String USER = "BKjeon";
	final static String PASS = "jeon";




	public VideoDaoImpl() throws Exception{


		// 1. 드라이버로딩
		Class.forName(DRIVER);


	}

	/*
	 * 사용자 입력값을 받아서 DB에 저장하는 역할
	 */


	//@SuppressWarnings("resource")
	public void insertVideo(VideoVO vo, int count) throws Exception{
		// 2. Connection 연결객체 얻어오기

		Connection con = null;
		PreparedStatement ps=null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("연결성공0");
			// 3. sql 문장 만들기


			String sql1 = "INSERT INTO VID_INFO (infono, dir, tit, act, gen, summ) "
					+ " VALUES (seq_infono.nextval, ?, ?, ?, ?, ?)";
			// 4. sql 전송객체 2(PreparedStatement)
			ps = con.prepareStatement(sql1);
			ps.setString(1, vo.getDir());
			ps.setString(2, vo.getTit());
			ps.setString(3, vo.getAct());
			ps.setString(4, vo.getGen());
			ps.setString(5, vo.getSumm());
			System.out.println("영화정보입력성공 - 전");
			// 5. sql 전송 2
			ps.executeUpdate();
			System.out.println("영화정보입력성공 - 후");

			// 4. sql 전송객체 (PreparedStatement)	

			String sql2 = "INSERT INTO VIDEO(vidno, infono) "
					+ " VALUES (seq_videono.nextval, seq_infono.currval)";
			ps = con.prepareStatement(sql2);			
			// 5. sql 전송
			for(int i=0; i<count; i++) {
				ps.executeUpdate();
			}



		} finally {
			// 6. 닫기
			//ps.close();
			ps.close();
			con.close();

		}
	} //end of insertVideo

	@Override
	public ArrayList selectVideo(int idx, String word) throws Exception {
		ArrayList data = new ArrayList();

		// 2. Connection 연결객체 얻어오기

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);

			// 3. sql 문장
			String []colNames = {"tit", "dir"};
			String sql = "SELECT vidno, tit, dir, act FROM video v LEFT OUTER JOIN vid_info i ON v.infono = i.infono "
					+ "WHERE " + colNames[idx]+" LIKE '%" + word +"%'";
			System.out.println(sql);


			//	여기서 ? 가 안되는 이유 : ?가 붙고 prepared statement 로 채워주면 자연적으로 ', ' 생성됨! 고로 컬럼인 tit 이 'tit'으로 됨
			//	sql 에서는 컬럼에 'tit' 이런식으로 붙여도  프로그램이 인식을해서 돌아가긴 하지만, 자바에서 보내줄 땐 완벽하게 해서 보내줘야함 (원래는 컬럼에 ''붙이면 안되니까)*********

			//			String []colNames = {"tit", "dir"};
			//			String sql = "SELECT vidno, tit, dir, act FROM video v LEFT OUTER JOIN vid_info i ON v.infono = i.infono "
			//					+ "WHERE ? LIKE '%?%'";
			//			System.out.println(sql);

			// 4. 전송객체
			ps = con.prepareStatement(sql);



			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next() ) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getInt("vidno"));
				temp.add(rs.getString("tit"));
				temp.add(rs.getString("dir"));
				temp.add(rs.getString("act"));
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

	/*
	 *  메소드명	:	selectByVnum
	 *  인자		:	비디오번호
	 *  리턴값	:	비디오정보
	 *  역할		:	비디오번호를 넘겨받아 해당 비디오번호의 비디오정보를 리턴
	 */

	public VideoVO 		SelectByVnum(int vnum) throws Exception {

		VideoVO vo = new VideoVO();

		// 2. Connection 연결객체 얻어오기

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);


			//3.sql	문 작성				

			String sql = "SELECT * FROM video v LEFT OUTER JOIN vid_info i ON v.infono = i.infono "
					+ "WHERE vidno = " + String.valueOf(vnum);

			// 4. 전송객체
			ps = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next() ) {
				vo.setTit(rs.getString("tit"));
				vo.setDir(rs.getString("dir"));
				vo.setAct(rs.getString("act"));
				vo.setSumm(rs.getString("summ"));
				vo.setGen(rs.getString("gen"));
				vo.setVidno(rs.getInt("vidno"));

			}

			rs.close();

			return vo;

		} finally {
			// 6. 닫기
			ps.close();
			con.close();

		}
	}

	@Override
	public int modifyVideo(VideoVO vo) throws Exception {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		


		try {
			con = DriverManager.getConnection(URL, USER, PASS);		

		//3. sql 작성
			String sql = "UPDATE vid_info SET dir = ?, tit = ?, act = ?, gen = ?, summ = ? "
					+ " where infono = (SELECT infono FROM video WHERE vidno = ?)";
					
		
		// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getDir());
			ps.setString(2, vo.getTit());
			ps.setString(3, vo.getAct());
			ps.setString(4, vo.getGen());
			ps.setString(5, vo.getSumm());
			ps.setInt(6, vo.getVidno());
			
		// 5. 전송
			ps.executeUpdate();
		
			
		int result = 0;


		return result;

		}finally {
			// 6. 닫기
			ps.close();
			con.close();

		}
	}

	@Override
	public int deleteVideo(int vnum) throws Exception {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		int rs = 0;


		try {
			con = DriverManager.getConnection(URL, USER, PASS);		

		//3. sql 작성
			String sql = "DELETE FROM VIDEO WHERE vidno = ?";
			
		// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, String.valueOf(vnum));
						
		// 5. 전송
			rs = ps.executeUpdate();
					
		
		
		
		}finally {
			// 6. 닫기
			ps.close();
			con.close();

		}
		
		return rs;
	}

}

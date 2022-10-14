package b_preparedStatement;

import java.sql.*;


public class InsertEmp {

	public static void main(String[] args) {

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공");
			
			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.164:1521:xe";
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("디비 연결 성공");
			
			//---- 입력값
			String bonmyeng = "본명";
			int welgup = 10000;
			String jikup = "IT";
			
			// 3. SQL문장
			//String sql = "INSERT INTO emp(empno, ename, sal) VALUES (1538, 'BKjeon', 99999)";
			//		10번 부서의 사원의 월급을 10% 인상
			String sql = "INSERT INTO emp (empno, ename, sal, job) VALUES (5555, ?, ?, ?)";	// 1100 ~ 1150
			
			//		월급이 10000 이상인 사원들 삭제
			//String sql = "DELETE FROM emp WHERE sal >= 10000";
			
			// 4. SQL 전송객체
			//Statement stmt = con.createStatement();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, bonmyeng);
			stmt.setInt(2, welgup);
			stmt.setString(3, jikup);
			
			// 5. SQL 전송
			/*		- ResultSet executeQuery()	:	SELECT
			 * 		- int executeUpdate()	:	INSERT/DELETE/UPDATE
			 */
			int result = stmt.executeUpdate();		
			// sql 에 값을 모르는 ? 가 존재하기 때문에, 이 행 ( 괄호) 에 sql을 넣으면 안됨!!!!!!! / **이미 위에서 sql 연결함
			System.out.println(result + "행을 실행");
			
			// 6. 닫기
			stmt.close();
			con.close();
		} catch ( Exception e) {
			System.out.println("DB 실패 :" + e);
		}
		
		
	}

}

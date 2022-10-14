package a_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmp {
	
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
			
			// 3. SQL문장 (*********************)
//			-> 20번 부서의 사원들의 정보 - 사번, 사원명, 월급, 부서명, 근무지
			//String sql = "SELECT empno, ename, sal, job FROM emp";
			String sql = "SELECT e.empno empno, e.ename ename, e.sal sal, d.dname dname, d.loc loc "
					+ " FROM emp e INNER JOIN dept d "
					+ " ON e.deptno = d.deptno "
					+ " WHERE d.deptno = 20";
			
			// 4. SQL 전송객체
			Statement stmt = con.createStatement();
			
			// 5. SQL 전송
			/*		- ResultSet executeQuery()	:	SELECT
			 * 		- int executeUpdate()	:	INSERT/DELETE/UPDATE
			 */
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
//				int empno 		= rs.getInt("EMPNO");
//				String ename 	= rs.getString("ENAME");
//				int sal 		= rs.getInt("SAL");
//				String job 		= rs.getString("JOB");
//				System.out.println(empno + "/" + ename + "/" + sal + "/" + job);
				//여기에 출력
				int empno		= rs.getInt("EMPNO");
				String ename	= rs.getString("ENAME");
				int sal			= rs.getInt("SAL");
				String dname	= rs.getString("DNAME");
				String loc		= rs.getString("LOC");
				System.out.println(empno + "/" + ename + "/" + sal + "/" + dname + "/" + loc);
				
			}
			
			
			// 6. 닫기
			rs.close();
			stmt.close();
			con.close();
		} catch ( Exception e) {
			System.out.println("DB 실패 :" + e);
		}	

	}
}

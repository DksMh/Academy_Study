package org.comstudy21.saram.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.jdbc.JdbcUtil;

public class SaramDao {
	public static final String SQL_SELECT = "SELECT * FROM SARAM";
	public static final String SQL_INSERT = "INSERT INTO SARAM(id, name, age)values(?,?,?)";
	public static final String SQL_UPDATE = "UPDATE SARAM SET ID=?, NAME=?, AGE=? WHERE NO=?";
	public static final String SQL_DELETE = "DELETE FROM SARAM WHERE NO=?";
	public static final String SQL_SELECT_ONE = "SELECT * FROM SARAM WHERE NO=?";
	public static final String SQL_SELECT_Id = "SELECT * FROM SARAM WHERE ID=?";
	public static final String SQL_SELECT_NAME = "SELECT * FROM SARAM WHERE NAME=?";

	public static Statement stmt = null; // 쿼리문을 담아 실행하는 것, JUST 전달
	public static PreparedStatement pstmt = null; // 준비된 Statement. Statement 클래스의 기능 향상, 인자와 관련된 작업이 특화(매개변수), 텍스트 SQL
													// 호출
	public static ResultSet rs = null; // 쿼리문을 보여주는 것
	public static Connection conn = null;

	public static List<SaramDto> selectAll() {
		List<SaramDto> list = new ArrayList<SaramDto>(); // -> 널포인트 익셉션 방지하게 어레이리스트
		conn = JdbcUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL_SELECT);
			while (rs.next()) {
				int no = rs.getInt(1);
				String id = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				list.add(new SaramDto(no, id, name, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				JdbcUtil.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public static SaramDto selectOne(SaramDto dto) {
		conn = JdbcUtil.getConnection();
		SaramDto saram = null; // SaramDto로 저장해야한다.
		try {
			pstmt = conn.prepareStatement(SQL_SELECT_ONE);
			pstmt.setInt(1, dto.getNo());
			rs = pstmt.executeQuery(); // 수행결과로 ResultSet 객체의 값을 반환, SELECT 구문을 수행할 때 사용되는 함수
			while (rs.next()) {
				int no = rs.getInt(1);
				String id = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				saram = new SaramDto(no, id, name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				JdbcUtil.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return saram;
	}

	public static SaramDto selectById(SaramDto dto) {
		conn = JdbcUtil.getConnection();
		SaramDto saram = null; // SaramDto로 저장해야한다.
		try {
			pstmt = conn.prepareStatement(SQL_SELECT_Id);
			pstmt.setString(1, dto.getId());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt(1);
				String id = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				saram = new SaramDto(no, id, name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				JdbcUtil.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return saram;
	}

	public static List<SaramDto> selectByName(SaramDto dto) {
		conn = JdbcUtil.getConnection();
		SaramDto saram = null; // SaramDto로 저장해야한다.
		try {
			pstmt = conn.prepareStatement(SQL_SELECT_NAME);
			pstmt.setString(1, dto.getName()); // 1은 SQL_SELECT_NAME의 ? 순서
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt(1);
				String id = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				saram = new SaramDto(no, id, name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				JdbcUtil.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return saram;
	}
	

	public static void insert(SaramDto dto) {
		conn = JdbcUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAge());
			int cnt = pstmt.executeUpdate(); // 처리된 회수가 반환 // INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환
			if (cnt == 0) {
				System.out.println(">>> 입력 실패!");
				conn.rollback(); // 취소하겠다는 소리, 원상복귀하겠다는 말
			}
		} catch (SQLException e) {
			System.out.println(">>> SQL 오류!");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				JdbcUtil.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void update(SaramDto dto) {
		conn = JdbcUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAge());
			pstmt.setInt(4, dto.getNo());
			int cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println(">>> 수정 실패!");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				JdbcUtil.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void delete(SaramDto dto) {
		conn = JdbcUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(SQL_DELETE);
			pstmt.setInt(1, dto.getNo());
			int cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println(">>> 삭제 실패!");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				JdbcUtil.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import dto.MemberDto;


public class MemberDao {

	private static MemberDao dao = new MemberDao();

	private MemberDao() {
		DBConnection.initConnection();
	}

	public static MemberDao getInstance() {
		return dao;
	}

	

	public boolean insert(MemberDto dto) {

		String sql = " INSERT INTO MEMBER_COM( SEQ,"
											+ " ID, "
											+ " NAME, "
											+ " PHONE,"
											+ " JOINDATE,"
											+ " JOB,"
											+ " DEP)"
			
				+ " VALUES( SEQ_MEMBER_COM.NEXTVAL, ?, ?, ?,SYSDATE, ?, ?) ";

		Connection conn = null;
		PreparedStatement psmt = null;
		int count = 0;

		try {
			conn = DBConnection.getConnection();
			System.out.println("1/3 insert success");

			psmt = conn.prepareStatement(sql);
			System.out.println("2/3 insert success");

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getPhone());
			psmt.setString(4, dto.getJob());
			psmt.setString(5, dto.getDep());



			count = psmt.executeUpdate();
			System.out.println("3/3 insert success");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Insert fail");
		} finally {
			DBClose.close(conn, psmt, null);
		}

		return count > 0 ? true : false;
	}

	public List<MemberDto> getMember(){
		
		String sql = "SELECT "
				+ " SEQ, "
		+ " ID, "
		+ " NAME, "
		+ " PHONE,"
		+ " JOINDATE,"
		+ " JOB,"
		+ " DEP"
		+ " FROM MEMBER_COM"
		+ " ORDER BY SEQ ASC";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		List<MemberDto> list = new ArrayList<MemberDto>();
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("1/4 S getMember");
			
			psmt = conn.prepareStatement(sql);
			System.out.println("2/4 S getMember");
			
			rs = psmt.executeQuery();
			System.out.println("3/4 S getMember");
			
			while(rs.next()) {
				int i = 1;
				MemberDto dto = new MemberDto(
						rs.getInt(i++),
						rs.getString(i++),
						rs.getString(i++),
						rs.getString(i++),
						rs.getString(i++),
						rs.getString(i++),
						rs.getString(i++))
						;
				list.add(dto);
			}
			System.out.println("4/4 S getMember");
			
		} catch (SQLException e) {	
			System.out.println("Fail getMember");
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);			
		}
		
		return list;
	}
	
	


	

}


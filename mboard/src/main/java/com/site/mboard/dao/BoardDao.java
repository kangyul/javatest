package com.site.mboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.mboard.vo.BVo;

public class BoardDao {
	
	private DataSource ds = null;
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String btitle, bcontent, bname, bupload;
	private int bid, bgroup, bstep, bindent, bhit;
	private Timestamp bdate;
	
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		return ds.getConnection();
	}

	public ArrayList<BVo> bListAllSelect() {
		ArrayList<BVo> list = new ArrayList<BVo>();
		
		try {
			
			conn = getConnection();
			String sql = "select * from board order by bgroup desc, bstep asc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bid = rs.getInt("bid");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bname = rs.getString("bname");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bdate = rs.getTimestamp("bdate");
				bupload = rs.getString("bupload");
				bhit= rs.getInt("bhit");
				BVo bvo = new BVo(bid, btitle, bcontent, bname, bgroup, bstep, bindent, bdate, bupload, bhit);
				list.add(bvo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)	rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}

	public int bWriteInsert(String btitle, String bcontent, String bname, String bupload) {
		int result = 0;
		
		try {
			
			conn = getConnection();
			String sql = "insert into board values(board_seq.nextval, ?, ?, ?, board_seq.currval, 0, 0, sysdate, ?, 0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setString(3, bname);
			pstmt.setString(4, bupload);
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)	rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;
	}
	
	

}

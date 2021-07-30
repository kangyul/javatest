package com.site.mboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.mboard.vo.MVo;

public class MemberDao {
	
	private DataSource ds = null;
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String id,pw,name,nickName,gender,tel,address1,address2,hobby;
	
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		return ds.getConnection();
	}

	public MVo mLoginSelect(String id, String pw) {
		MVo mVo = new MVo();
		
		try {
			conn = getConnection();
			String sql = "select * from member2 where id=? and pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				nickName = rs.getString("nickName");
				gender = rs.getString("gender");
				tel = rs.getString("tel");
				address1 = rs.getString("address1");
				address2 = rs.getString("address2");
				hobby = rs.getString("hobby");
				mVo = new MVo(id,pw,name,nickName,gender,tel,address1,address2,hobby);
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
		
		
		return mVo;
	}
	
	

}

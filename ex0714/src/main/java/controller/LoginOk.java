package controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginOk")
public class LoginOk extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		
		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		Statement stmt = null;
		ResultSet rs=null;
		HttpSession session=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ora_user", "1234");
            
            String sql="select * from member2 where id=? and pw=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            rs = pstmt.executeQuery();
            
            if(rs.next()) {
            	String rs_id = rs.getString("id");
            	String rs_nickName = rs.getString("nickName");
            	
            	// 세션 가져오기.
            	session = request.getSession();
            	session.setAttribute("id", rs_id);
            	session.setAttribute("nickName", rs_nickName);
            	// 페이지 넘기기.
            	response.sendRedirect("./index.jsp");
            } else {
            	String msg = URLEncoder.encode("아이디와 패스워드가 일치하지 않습니다."); 
            	response.sendRedirect("./login.jsp?msg="+msg);
            }
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}

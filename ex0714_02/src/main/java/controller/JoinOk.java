package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinOk")
public class JoinOk extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String nickName = request.getParameter("nickName");
		String gender = request.getParameter("gender");
		String tel = request.getParameter("tel");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String[] hobby = request.getParameterValues("hobby");
		String hobbies="";
		if(hobby!=null) {
			for(int i=0; i<hobby.length; i++) {
				if(i==0) hobbies=hobby[0];
				else hobbies+=","+hobby[i];
			}
		}
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ora_user", "1234");
            String sql = "insert into member2 values(?,?,?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            pstmt.setString(3, name);
            pstmt.setString(4, nickName);
            pstmt.setString(5, gender);
            pstmt.setString(6, tel);
            pstmt.setString(7, addr1);
            pstmt.setString(8, addr2);
            pstmt.setString(9, hobbies);
            
            int i = pstmt.executeUpdate();
            
            if(i==1) {
            	System.out.println("데이터 저장 성공");
            	response.sendRedirect("./joinResult.jsp");
            } else {
            	System.out.println("데이터 저장 실패");
            	response.sendRedirect("./join.jsp");
            }
            
            
            
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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

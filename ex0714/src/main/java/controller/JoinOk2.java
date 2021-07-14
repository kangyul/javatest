package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinOk2")
public class JoinOk2 extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs = null;
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw1 = request.getParameter("pw1");
		String mail_id = request.getParameter("mail_id");
		String mail_tail = request.getParameter("mail_tail");
		String zipcode = request.getParameter("f_postal");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String tel1 = request.getParameter("f_tell");
		String tel2 = request.getParameter("m_tell");
		String tel3 = request.getParameter("l_tell");
		String birth1 = request.getParameter("birth_year");
		String birth2 = request.getParameter("birth_month");
		String birth3 = request.getParameter("birth_day");
		String gender = request.getParameter("gender");
		String news = request.getParameter("newletter");
		String sms = request.getParameter("sms");
		String job = request.getParameter("job");
		String marry = request.getParameter("marital_status");
		String[] hobby = request.getParameterValues("hobby");
		String hobbies ="";
		if(hobby!=null) {
			for(int i=0; i<hobby.length; i++) {
				if(i==0) hobbies = hobby[i];
				else hobbies += ","+hobby[i];
			}
		}
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ora_user", "1234");
            stmt = conn.createStatement();
            String sql = "insert into member3 values('"+name+"', '"+id+"', '"+pw1+"', '"+mail_id+"', '"+mail_tail+"', '"+zipcode+"', '"+address1+"', '"+address2+"', '"+tel1+"', '"+tel2+"', '"+tel3+"', '"+birth1+"', '"+birth2+"', '"+birth3+"', '"+gender+"', '"+news+"', '"+sms+"', '"+job+"', '"+marry+"', '"+hobbies+"')";
			int i = stmt.executeUpdate(sql);
			
			if(i==1) {
				System.out.println("데이터 저장 성공");
				response.sendRedirect("./join03_success.jsp");
			} else {
				System.out.println("데이터 저장 실패");
				response.sendRedirect("./main.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(stmt!=null) stmt.close();
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

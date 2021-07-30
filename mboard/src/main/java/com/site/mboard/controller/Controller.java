package com.site.mboard.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.mboard.service.BService;
import com.site.mboard.service.MService;
import com.site.mboard.service.MServiceLogin;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		RequestDispatcher dispatcher = null; 
		MService mService = null;
		BService bService = null;
		
		String uri = request.getRequestURI();
		String cpath = request.getContextPath();
		String fname = uri.substring(cpath.length());
		
		if(fname.equals("/member/login.do")) {
			dispatcher = request.getRequestDispatcher("login.jsp");					
		} else if(fname.equals("/member/doLogin.do")) {
			mService = new MServiceLogin();
			mService.execute(request, response);
			dispatcher = request.getRequestDispatcher("doLogin.jsp");
		} else if(fname.equals("/board/blist.do")) {
			bService = new BServiceList();
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("blist.jsp");
		} else if(fname.equals("/board/bwrite.do")) {
			dispatcher = request.getRequestDispatcher("bwrite.jsp");
		} else if(fname.equals("/board/doBWrite.do")) {
			bService = new BServiceWrite();
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("doBwrite.jsp");
		}
		
		dispatcher.forward(request, response);
		
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

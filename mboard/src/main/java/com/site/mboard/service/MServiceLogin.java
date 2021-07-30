package com.site.mboard.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.site.mboard.dao.MemberDao;
import com.site.mboard.vo.MVo;

public class MServiceLogin implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		MemberDao memberDao = new MemberDao();
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		MVo mVo = memberDao.mLoginSelect(id, pw);
		
		if(mVo.getId() == null) {
			session.setAttribute("session_flag", "fail");
		} else {
			session.setAttribute("session_flag", "success");
			session.setAttribute("session_id", mVo.getId());
			session.setAttribute("session_nickName", mVo.getNickName());
		}
		
	}

}

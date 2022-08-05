package com.javalec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.bbs.dao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) {
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");

		BDao dao = new BDao();	
		dao.write(bName, bTitle, bContent);	//dao의 순서와 같이 
	}
	

}

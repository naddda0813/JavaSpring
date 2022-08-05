package com.javalec.mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.mvc.dao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String aName = request.getParameter("aName");
		String aTel = request.getParameter("aTel");
		String aEmail = request.getParameter("aEmail");
		String aAddress = request.getParameter("aAddress");
		String aRela =request.getParameter("aRela");
		
		BDao dao = new BDao();
		dao.write(aName, aTel, aEmail, aAddress, aRela);
	}

}

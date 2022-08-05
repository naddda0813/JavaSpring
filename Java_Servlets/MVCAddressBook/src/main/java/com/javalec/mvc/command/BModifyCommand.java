package com.javalec.mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.javalec.mvc.dao.BDao;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int aId = Integer.parseInt(request.getParameter(null));
		String aName = request.getParameter("aName");
		String aTel = request.getParameter("aTel");
		String aAddress = request.getParameter("aAddress");
		String aEmail = request.getParameter("aEmail");
		String aRela = request.getParameter("aRela");
		
		BDao dao = new BDao();
		dao.modify(aId, aName, aTel, aAddress, aEmail, aRela);
		
	}

}

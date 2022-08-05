package com.javalec.mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.mvc.dao.BDao;

public class BFinalCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int aId =Integer.parseInt(request.getParameter("aId"));
		String aName = request.getParameter("aName");
		String aTel = request.getParameter("aTel");
		String aAddress = request.getParameter("aAddress");
		String aEmail = request.getParameter("aEmail");
		String aRela = request.getParameter("aRela");
		

		BDao dao = new BDao();
		dao.
	}

	}



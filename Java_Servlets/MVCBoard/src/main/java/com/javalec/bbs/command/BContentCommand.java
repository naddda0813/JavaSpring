package com.javalec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.bbs.dao.BDao;
import com.javalec.bbs.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) {
		String bId = request.getParameter("bId");
		BDao dao = new BDao();
		BDto dto = new BDto();
		dto = dao.contentView(bId);
		request.setAttribute("content_view", dto);
		
	}

}

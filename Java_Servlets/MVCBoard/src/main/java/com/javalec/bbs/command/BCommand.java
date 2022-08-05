package com.javalec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand {
	public void execute(HttpServletRequest request, HttpServletResponse reponse);   // 이름 통일하기 
	
	
}

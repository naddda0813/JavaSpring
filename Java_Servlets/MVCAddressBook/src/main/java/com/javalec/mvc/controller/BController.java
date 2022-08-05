package com.javalec.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.javalec.mvc.command.BCommand;
import com.javalec.mvc.command.BListCommand;
import com.javalec.mvc.command.BModifyCommand;
import com.javalec.mvc.command.BWriteCommand;



	@WebServlet("*.do") 
	public class BController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public BController() {
		super();
		
	}protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet"); //get or post anyway you can get it
		actionDo(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
		}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		request.setCharacterEncoding("utf-8"); // 한글 처리 
		String viewPage = null;			//널값을 줘서 초기화 시키고  원하는 페이지로 이동 가능 
		BCommand command = null;		// null값 주기 
		
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
				
		
		switch(com) {
		case("/list.do") :
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
		case("/write_view.do") :
			viewPage = "write_view.jsp";
			break;
		case("/write.do"):						//글작성완료 후 첫 페이지 
			command = new BWriteCommand();					//command 값 잡아주기 
			command.execute(request, response);				//BWriteCommand의 execute 실행 
			viewPage = "list.do";
			break;
		case("/modify.do"):						//	글 수정삭제하는 페이지, 보여줄려면 jsp 만들어야 한다.
			command = new BModifyCommand ();
			command.execute(request, response);	
			viewPage = "modify_view.jsp";
			break;
		case("/final.do"):				//수정 제출 후 페이지 
			command = new  ();
			command.execute(request, response);	
			viewPage = "list.do";
			break;

//			
			
			
			
			
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
}
}
	
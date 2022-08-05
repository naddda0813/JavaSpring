package com.javalec.bbs.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.bbs.command.BCommand;
import com.javalec.bbs.command.BContentCommand;
import com.javalec.bbs.command.BListCommand;
import com.javalec.bbs.command.BModifyCommand;
import com.javalec.bbs.command.BWriteCommand;


@WebServlet("*.do")  //do라 끝나느 건 전부 나한테 받기 
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BFrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		String viewPage = null;
		BCommand command = null;		// null값 주기 
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length()); //uri에서 conpath의 길이만큼 출력 
		
//		System.out.println(uri);			//전체가 보이게 함 
//		System.out.println(conPath);		//컨설창에 MVCBoard만 보이게 함 
//		System.out.println(com);		// *.do만 보이게 함 
		
		switch (com) {
		case("/list.do"):		//mvc_board에 붙는 주소창 , sql의 전체 내용 보여주기  
			command = new BListCommand() ;		//command 값 잡아주기 
			command.execute(request, response);				//BListcommand의 execute 실행 
			viewPage = "list.jsp";
			break;
		case("/write_view.do "):
			viewPage = "write_view.jsp";
			break;
		case("/write.do"):
			command = new BWriteCommand();					//command 값 잡아주기 
			command.execute(request, response);				//BWriteCommand의 execute 실행 
			viewPage = "list.do";
			break;
		case("/conten_view.do"):						//	글 수정및 삭제하는 창 
			command = new BContentCommand();
			command.execute(request, response);	
			viewPage = "content_view.jsp";
			break;
		case("/modify.do"):						//	글 수정하는 창 
			command = new BModifyCommand();
			command.execute(request, response);	
			viewPage = "list.do";
			break;

		}
		
		
		

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
	
}

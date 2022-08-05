package com.javalec.base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sum100")
public class Sum100 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Sum100() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int total = 0; //초기화 
		
		for(int i=1;i<=100;i++)	{
			total+=i;
		}
		request.setAttribute("result",total);	//total >result 에 넣기 
		for(int i=101;i<=200;i++) {
			total+= i;
		}
		request.setAttribute("result2",total);	//total >result 에 넣기 
		
		
		RequestDispatcher rd = request.getRequestDispatcher("Sum100.jsp");
		rd.forward(request, response);
	}


}

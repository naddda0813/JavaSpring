package com.javalec.base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gugudan")
public class gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public gugudan() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int num =  Integer.parseInt(request.getParameter("num"));
		
		for(int i=1;i<=9;i++)	{
			int result = num * i;
			out.print(	num	+ " X " + i +" = " +(result)+"<br>");
		}
	}


}

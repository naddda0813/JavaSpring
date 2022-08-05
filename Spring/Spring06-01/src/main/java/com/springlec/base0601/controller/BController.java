package com.springlec.base0601.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base0601.command.BCommand;
import com.springlec.base0601.command.BContentCommand;
import com.springlec.base0601.command.BListCommand;

@Controller
public class BController {
	
	BCommand command = null;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()"); //dao���� ���� �̸�
		command = new BListCommand();
		command.execute(model);
		
		return "list";
	}	
	@RequestMapping("/write") //�ּ�â
	public String write(HttpServletRequest request,Model model) {
		System.out.println("write()");
		
		model.addAttribute("request",request);
		command = new BContentCommand();
		command.execute(model);
		
		return "write_view";
	}
	@RequestMapping("/content") //�ּ�â
		public String content(HttpServletRequest request,Model model) {
			System.out.println("content()");
			
			model.addAttribute("request",request);
			command = new BContentCommand();
			command.execute(model);
			
			return "content_view";
	}
}
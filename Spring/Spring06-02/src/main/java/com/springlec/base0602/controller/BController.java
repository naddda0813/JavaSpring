package com.springlec.base0602.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base0602.command.BCommand;
import com.springlec.base0602.command.BContentCommand;
import com.springlec.base0602.command.BListCommand;

@Controller
public class BController {
	
	BCommand command = null;
	private BCommand listCommand= null;
	private BCommand writeCommand = null;
	
	
	@Autowired
	public void auto(BCommand list) {
		this.listCommand = list;
	}
	
	
	@RequestMapping("/list")
	public String list(Model model) {
		/*
		 * System.out.println("list()"); //dao에서 정한 이름 command = new BListCommand();
		 */
		listCommand.execute(model);
		
		return "list";
	}
	
	@Autowired
//	public void auto(BCommand write) {
//		this.writeCommand = write;
//	}
//	
	
	@RequestMapping("/write") //주소창
	public String write(HttpServletRequest request,Model model) {
		/* System.out.println("write()"); */
		
		model.addAttribute("request",request);
		/* command = new BContentCommand(); */
		writeCommand.execute(model);
		
		return "write_view";
	}
	@RequestMapping("/content") //주소창
		public String content(HttpServletRequest request,Model model) {
			System.out.println("content()");
			
			model.addAttribute("request",request);
			command = new BContentCommand();
			command.execute(model);
			
			return "content_view";
	}
}

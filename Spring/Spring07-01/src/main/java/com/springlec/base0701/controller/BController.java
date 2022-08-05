package com.springlec.base0701.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base0701.command.BCommand;
import com.springlec.base0701.util.Constant;

@Controller
public class BController {
	

	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template; //static에 들어갔으니 아무대서나 부를 수 잇음 
	}
	
	private BCommand listCommand = null;
	private BCommand writeCommand = null;
	private BCommand contentCommand = null;
	private BCommand deleteCommand = null;
	private BCommand modifyCommand = null;
	
	@Autowired //appservlet과 java 연결
	public void auto(BCommand list, BCommand write, BCommand content,
			BCommand delete, BCommand modify) {
		this.listCommand = list;
		this.writeCommand = write;
		this.contentCommand = content;
		this.deleteCommand = delete;
		this.modifyCommand = modify;
	}
	@RequestMapping("/list")
	public String list(Model model) {
		listCommand .execute(model);
		return "list";
	}	
	@RequestMapping("/writeV") //글 작성하는 주소
	public String writeV() {	//받아올 데이터가 없으몰 괄호 안에
		return "write_view";
	}
	
	@RequestMapping("/write") //글 작성 완료 후 보여주는 주소 
	public String write(HttpServletRequest request,Model model) { // request는 입력하는 거, model은 출력하는 거
		model.addAttribute("request",request);
		writeCommand.execute(model);
		return "redirect:list"; //다시 리스트로
	}
	
	
	@RequestMapping("/content") // 작성한 상세 내용 보기 
	public String content(HttpServletRequest request,Model model) {
			model.addAttribute("request",request);
			contentCommand.execute(model);
			return "content_view";
	}
	
	@RequestMapping("/modify") //
	public String modify(HttpServletRequest request,Model model) {
		model.addAttribute("request",request);
		String bId = request.getParameter("bId");
		modifyCommand.execute(model);
		return "redirect:content?bId=" + bId; 
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {
		model.addAttribute("request",request);
		deleteCommand.execute(model);
		return "redirect:list";
	}
}

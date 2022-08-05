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
		Constant.template = this.template; //static�� ������ �ƹ��뼭�� �θ� �� ���� 
	}
	
	private BCommand listCommand = null;
	private BCommand writeCommand = null;
	private BCommand contentCommand = null;
	private BCommand deleteCommand = null;
	private BCommand modifyCommand = null;
	
	@Autowired //appservlet�� java ����
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
	@RequestMapping("/writeV") //�� �ۼ��ϴ� �ּ�
	public String writeV() {	//�޾ƿ� �����Ͱ� ������ ��ȣ �ȿ�
		return "write_view";
	}
	
	@RequestMapping("/write") //�� �ۼ� �Ϸ� �� �����ִ� �ּ� 
	public String write(HttpServletRequest request,Model model) { // request�� �Է��ϴ� ��, model�� ����ϴ� ��
		model.addAttribute("request",request);
		writeCommand.execute(model);
		return "redirect:list"; //�ٽ� ����Ʈ��
	}
	
	
	@RequestMapping("/content") // �ۼ��� �� ���� ���� 
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

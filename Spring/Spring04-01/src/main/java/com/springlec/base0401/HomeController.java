package com.springlec.base0401;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	  //version 3
	  
	  @RequestMapping("board/confirmId") public String confirmId(HttpServletRequest
	  request,Model model) { String id = request.getParameter("id"); String pw =
	  request.getParameter("pw");
	  
	  model.addAttribute("id",id); model.addAttribute("pw",pw); return
	  "board/confirmId"; } //version 4
	  
	  @RequestMapping("board/checkId") public String checkId(@RequestParam("id")
	  String id ,@RequestParam("pw") int pw,Model model) {
	  
	  model.addAttribute("id",id); model.addAttribute("pw",pw); return
	  "board/confirmId"; }
	  
	  
	  @RequestMapping("member/join") //주소창 
	  public String joinData(@RequestParam("name") String name,
			  	@RequestParam("id") String id,
			  	@RequestParam("pw") String pw,
			  	@RequestParam("email") String email, Model model) { 
		  Member member =new Member(); 
		  member.setName(name); member.setId(id); member.setPw(pw);
		  member.setEmail(email);
	  
	  model.addAttribute("member", member);
	  
	  return "member/join"; }
	  
	  //dto 쓰는법
	  
	  @RequestMapping("member/join") public String joinData(Member member) { return
	  "member/join"; }
	  
	  
	  @RequestMapping("student/{studentId}") public String getStudent(@PathVariable
	  String studentId, Model model) { model.addAttribute("studentId", studentId);
	  return "student/studentView"; }
	 
	
	
	  @RequestMapping("input") 
	  public String userData() {  //정보를 입력할 때는 괄호 안에 비워준다
		return "student/userinput"; //jsp
	}
	  @RequestMapping("result")
	  public String userData22(User user) {
		  return "student/userresult";
	  }
	 
	
	
	
	
	
	/*
	 * @RequestMapping("student/user") public String userData(User user) {
	 * return"student/user"; }
	 */
	 
}

package kr.spring.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController { //POJO클래스->/index.do
	
	@RequestMapping("/index.do")
	public String process() { //ModelAndView를 하지 않은 이유->tiles(이미설정)
		//return "문자열(index)" -->definition name="index"이름과 일치하는
		//                                                                이름을 찾아간다
		return "index";//definition name="index" template="/WEB-INF/tiles-view/template/layout.jsp">
	}
}

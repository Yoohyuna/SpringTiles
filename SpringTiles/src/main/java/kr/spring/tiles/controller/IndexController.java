package kr.spring.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController { //POJOŬ����->/index.do
	
	@RequestMapping("/index.do")
	public String process() { //ModelAndView�� ���� ���� ����->tiles(�̹̼���)
		//return "���ڿ�(index)" -->definition name="index"�̸��� ��ġ�ϴ�
		//                                                                �̸��� ã�ư���
		return "index";//definition name="index" template="/WEB-INF/tiles-view/template/layout.jsp">
	}
}

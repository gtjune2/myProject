package mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	@RequestMapping("/hi.do")
	public ModelAndView hi() {
		ModelAndView mv = new ModelAndView();
		
		// view 설정
		mv.setViewName("hi");		// view의 이름을 제공
		Member member = new Member();
		member.setName("홍길동");
		member.setJob("개발자");
		mv.addObject("member", member);
		return mv;
	}
}

//package com.gebalstory.gcbus;
//
//import java.text.DateFormat;
//import java.util.Date;
//import java.util.Locale;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
///**
// * Handles requests for the application home page.
// */
//@Controller
//public class HomeController {
//	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//	
//	/**
//	 * Simply selects the home view to render by returning its name.
//	 */
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	//클라이언트로부터 들어온 Request를 어느 service 객체로 보내주어야 하는지 매핑하기 위한 역활로 value의 값을 구분되어진다. method 파라메터는 요청 방식이 post 인지 get방식인지 구분은 method를 따로 작성하지 않을시 default 즉 post형식이 된다
//	
//	public String home(Locale locale, Model model) {
//		logger.info("ㅎㅇ",locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime",formattedDate);
//		//처리되어진 결과를 뷰단인 jsp에 보내주기 위한것으로 serverTime이라는 이름에 formattedDated의 값을 가진 속성을 뷰단으로 넘겨준다.
//		
//		
//		return "home";
//		//home.jsp라는 jsp파일을 뜻하며 위에 처리 결과들을 해당 jsp에 보내준다는것이다
//		//home이라고만 쓴 이유는 서블릿 설정에서 결로와 뒤의 확장자를 자동으로 붙여주도록 설정해두었기 때문이다.
//	}
//	
//	
//}

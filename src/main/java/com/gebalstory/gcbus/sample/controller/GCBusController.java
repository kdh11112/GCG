package com.gebalstory.gcbus.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gebalstory.gcbus.common.common.CommandMap;

@Controller
public class GCBusController {
	
	//유저를 위한 컨트롤러
	@RequestMapping(value="/sample.do")
	public ModelAndView nodeInfo(CommandMap commandMap) throws Exception{
		
		ModelAndView mv = new ModelAndView("node_info");
		mv.addObject("nodeid",commandMap.get("nodeid"));
		mv.addObject("nodename",commandMap.get("nodename"));
		mv.addObject("lat",commandMap.get("lat"));
		mv.addObject("lng",commandMap.get("lng"));
		
		return mv;
		
	}
	
	

}

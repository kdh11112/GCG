package com.gebalstory.gcbus.sample.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gebalstory.gcbus.common.common.CommandMap;
import com.gebalstory.gcbus.sample.service.SampleService;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

@Controller
public class SampleController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value="/testInterceptor.do")
	public ModelAndView testInterceptor(Map<String, Object> commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("");
		log.debug("인터셉터 테스트");
		
		return mv;
	}
	
	@RequestMapping(value="/sample/openBoardList.do")
	public ModelAndView openBoardList(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/sample/boardList");
		
		Map<String,Object> resultMap = sampleService.selectBoardList(commandMap.getMap());
		mv.addObject("paginationInfo",(PaginationInfo)resultMap.get("paginationInfo"));
		mv.addObject("list",resultMap.get("result"));
		
		return mv;
	}
	
	@RequestMapping(value="/testCustomMapArgumentResolver.do")
	public ModelAndView testCommandMap(CommandMap commandMap) throws Exception{
	    ModelAndView mv = new ModelAndView("");
	    if(commandMap.isEmpty()==false) {
	        Iterator<Entry<String, Object>> iterator = commandMap.getMap().entrySet().iterator(); 
	        Entry<String,Object> entry = null;
	         
	        while(iterator.hasNext()) {
	            entry = iterator.next();
	            log.debug("key:"+entry.getKey()+ " , values:"+entry.getValue());
	        }
	    }
	    return mv;
	}
	
	@RequestMapping(value="/sample/openBoardWrite.do")
	public ModelAndView openBoardWrite(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/sample/boardWrite");
		
		return mv;
	}
	
	@RequestMapping(value="/sample/writeBoard.do")//insert
	public ModelAndView writeBoard(CommandMap commandMap, HttpServletRequest request) throws Exception{
	    ModelAndView mv = new ModelAndView("redirect:/sample/openBoardList.do");
	    sampleService.writeBoard(commandMap.getMap(), request);
	             
	    return mv;
	}
	
	@RequestMapping(value="/sample/openBoardDetail.do")
	public ModelAndView openBoardDetail(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/sample/boardDetail");
		
		Map<String,Object> map = sampleService.selectBoardDetail(commandMap.getMap());
		mv.addObject("map",map.get("map"));
		mv.addObject("list",map.get("list"));
		
		return mv;
	}
	
	@RequestMapping(value="/sample/openBoardUpdate.do")
	public ModelAndView openBoardUpdate(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/sample/boardUpdate");
		
		Map<String,Object>map = sampleService.selectBoardDetail(commandMap.getMap());
		mv.addObject("map",map.get("map"));
		mv.addObject("list",map.get("list"));
		
		return mv;
	}

	@RequestMapping(value="/sample/updateBoard.do")
	public ModelAndView updateBoard(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/sample/openBoardDetail.do");
		
		sampleService.updateBoard(commandMap.getMap(), request);
		
		mv.addObject("IDX",commandMap.get("IDX"));
		return mv;
	}
	
	@RequestMapping(value="/sample/deleteBoard.do")
	public ModelAndView deleteBoard(CommandMap commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/sample/openBoardList.do");
		
		sampleService.deleteBoard(commandMap.getMap());
		return mv;
	}
     
}
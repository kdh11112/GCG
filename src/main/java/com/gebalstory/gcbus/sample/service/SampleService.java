package com.gebalstory.gcbus.sample.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface SampleService {
	
	Map<String,Object> selectBoardList(Map<String,Object> map) throws Exception;

	void writeBoard(Map<String, Object> map, HttpServletRequest request) throws Exception;
		//insert
	Map<String,Object> selectBoardDetail(Map<String,Object>map)throws Exception;
	
	void updateBoard(Map<String,Object>map, HttpServletRequest request) throws Exception;
	
	void deleteBoard(Map<String,Object>map) throws Exception;
	
	
	
}


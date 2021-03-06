package com.gebalstory.gcbus.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gebalstory.gcbus.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO {
	@SuppressWarnings("unchecked") 
	public Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception{ 
		return (Map<String, Object>)selectPagingList("sample.selectBoardList", map); 
		
	}

	public void writeBoard(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		insert("sample.writeBoard",map);
	}
	
	public void updateHitCnt(Map<String,Object>map) throws Exception{
		update("sample.updateHitCnt",map);
		
	}
	@SuppressWarnings("unchecked")
	public Map<String,Object> selectBoardDetail(Map<String,Object>map) throws Exception{
		return (Map<String,Object>)selectOne("sample.selectBoardDetail",map);
	}
	
	public void updateBoard(Map<String,Object>map)throws Exception{
		update("sample.updateBoard",map);
		
	}
	
	public void deleteBoard(Map<String,Object>map)throws Exception{
		update("sample.deleteBoard",map);
	}
	
	public void insertFile(Map<String,Object>map) throws Exception{
		insert("sample.insertFile",map);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> selectFileList(Map<String,Object>map) throws Exception{
		return (List<Map<String,Object>>)selectList("sample.selectFileList",map);
		
	}
	
	public void deleteFileList(Map<String,Object>map) throws Exception{
		update("sample.deleteFileList",map);
		
	}
	public void updateFile(Map<String,Object>map) throws Exception{
		update("sample.updateFile",map);
	}
}

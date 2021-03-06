package com.ssafy.great.model.dao;

import java.util.List;
import java.util.Map;

import com.ssafy.great.dto.Bookmark;
import com.ssafy.great.dto.Store;

public interface BookmarkDao {

	/** 사용자 id에 해당하는 북마크 목록 검색 */
	List<Bookmark> selectByUser(Map<String, Object> data);

	/** 북마크 id에 해당하는 북마크의 식당 id 리스트 검색 */
	List<Store> selectById(int id);

	/**  userId에 해당하는 bookmark 식당 목록 검색 */
	List<Store> selectByUserId (int userId);
	
	/** 북마크 정보 등록 */
	void insert(Bookmark bookmark);

	/** 북마크 정보 수정 */
	void update(Bookmark bookmark);

	/** 북마크 삭제 */
	void delete(int id);
	
	/** userId에 해당하는 북마크 삭제*/
	void deleteByUserId(Map<String,Object>data);

}
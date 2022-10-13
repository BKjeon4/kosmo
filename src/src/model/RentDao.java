package model;

import java.util.ArrayList;

public interface RentDao {
	
	// 대여
	public void rentVideo(String tel, int vnum) throws Exception;
	
	// 반납
	public void returnVideo(int vnum) throws Exception;
	
	// 미납목록검색
	public ArrayList selectList() throws Exception;
	
	// 전화번호로 이름검색
	public String selectName(String tel) throws Exception;

}

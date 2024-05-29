package com.src.Queries;

public interface MemberQueries {
	String INSERT_QUERY = "INSERT INTO MEMBER(ID,FIRST,LAST,AGE) VALUES (?,?,?,?)";
	String UPDATE_QUERY = "UPDATE MEMBER SET FIRST = ? , LAST = ? , AGE=? WHERE ID = ?";
	String DELETE_BY_ID_QUERY = "DELETE FROM MEMBER WHERE ID = ?";
	String FIND_BY_ID_QUERY = "SELECT * FROM MEMBER WHERE ID = ?";
	String FIND_ALL_QUERY = "SELECT * FROM MEMBER";
}

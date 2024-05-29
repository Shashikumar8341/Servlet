package com.src.dao;

import java.util.List;

import com.src.dto.Member;

public interface MemberDAO {
	void add(Member member);

	void update(Member member);

	void deletebyid(int id);

	Member findbyid(int id);

	List<Member> findAll();
}

package com.src.service;

import java.util.List;

import com.src.dto.Member;

public interface MemberServices {

	void add(Member member);

	void update(Member member);

	void deleteById(int eid);

	Member findById(int eid);

	List<Member> findAll();

}

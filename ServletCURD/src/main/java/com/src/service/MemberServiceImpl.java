package com.src.service;

import java.util.List;

import com.src.dao.MemberDAO;
import com.src.dao.MemberDAOImpl;
import com.src.dto.Member;

public class MemberServiceImpl implements MemberServices {
	private MemberDAO memberDAO = new MemberDAOImpl();

	@Override
	public void add(Member member) {
		memberDAO.add(member);
	}

	@Override
	public void update(Member member) {
		memberDAO.update(member);
	}

	@Override
	public void deleteById(int id) {
		memberDAO.deletebyid(id);
	}

	@Override
	public Member findById(int id) {
		return memberDAO.findbyid(id);
	}

	@Override
	public List<Member> findAll() {
		return memberDAO.findAll();
	}

}

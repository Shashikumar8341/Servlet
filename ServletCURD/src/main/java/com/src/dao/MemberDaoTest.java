package com.src.dao;

import java.util.ArrayList;
import java.util.List;

import com.src.dto.Member;

public class MemberDaoTest {

	public static void main(String[] args) {

//		Add employee Test
		MemberDAO memberDAO = new MemberDAOImpl();
		Member members = new Member(7, "radhakrishna", "balakrishna", 950);
//		memberDAO.add(members);
//		
		memberDAO.update(members);
//		
		
//		Member member = memberDAO.findbyid(7);
//		System.out.println(member);
//		
//		
//		List<Member> members = memberDAO.findAll();
//		 System.out.println(members);
//		
//		memberDAO.deleteById(1001);
//		
//		
		System.out.println("Done!");
	}
}

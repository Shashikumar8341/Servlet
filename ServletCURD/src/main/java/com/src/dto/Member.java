package com.src.dto;

public class Member {
	private int id;
	private String first;
	private String last;
	private int age;

	public Member(int id, String first, String last, int age) {
		super();
		this.id = id;
		this.first = first;
		this.last = last;
		this.age = age;
	}

	public Member() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberDb [id=" + id + ", first=" + first + ", last=" + last + ", age=" + age + "]";
	}

	

}

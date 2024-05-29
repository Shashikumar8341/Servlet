package com.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.src.Queries.MemberQueries;
import com.src.Util.ConnectionUtil;
import com.src.dto.Member;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public void add(Member member) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(MemberQueries.INSERT_QUERY);
			preparedStatement.setInt(1, member.getId());
			preparedStatement.setString(2, member.getFirst());
			preparedStatement.setString(3, member.getLast());
			preparedStatement.setInt(4, member.getAge());
			preparedStatement.executeUpdate();
			} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
	
	}

	@Override
	public void update(Member member) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(MemberQueries.UPDATE_QUERY);
			preparedStatement.setString(1, member.getFirst());
			preparedStatement.setString(2, member.getLast());
			preparedStatement.setInt(3, member.getAge());
			preparedStatement.setInt(4, member.getId());
			preparedStatement.executeUpdate();
			} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
	
	
	}

	@Override
	public void deletebyid(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(MemberQueries.DELETE_BY_ID_QUERY);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
	
	}
	

	@Override
	public Member findbyid(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(MemberQueries.FIND_BY_ID_QUERY);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			Member member=new Member();
			member.setId(resultSet.getInt("id"));
			member.setFirst(resultSet.getString("first"));
			member.setLast(resultSet.getString("last"));
			member.setAge(resultSet.getInt("age"));
			return member;
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}		return null;
	}

	@Override
	public List<Member> findAll() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(MemberQueries.FIND_ALL_QUERY);
			resultSet = preparedStatement.executeQuery();
			List<Member> members = new ArrayList<Member>();
			while (resultSet.next()) {
				Member member=new Member();
				member.setId(resultSet.getInt("id"));
				member.setFirst(resultSet.getString("first"));
				member.setLast(resultSet.getString("last"));
				member.setAge(resultSet.getInt("age"));
				members.add(member);
			}

			return members;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}		return null;
	}

}

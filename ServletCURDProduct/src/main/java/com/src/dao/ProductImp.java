package com.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.src.dto.Product;
import com.src.queries.ProductQueri;
import com.src.util.ConnectionUtil;

public class ProductImp implements ProductDao {

	@Override
	public void add(Product product) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(ProductQueri.INSERT_QUERY);
			preparedStatement.setInt(1, product.getIdproduct());
			preparedStatement.setString(2, product.getP_name());
			preparedStatement.setString(3, product.getP_packket());
			preparedStatement.setString(4, product.getP_address());
			preparedStatement.setString(5, product.getDates());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
	}

	@Override
	public void update(Product product) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(ProductQueri.UPDATE_QUERY);
			preparedStatement.setString(1, product.getP_name());
			preparedStatement.setString(2, product.getP_packket());
			preparedStatement.setString(3, product.getP_address());
			preparedStatement.setString(4, product.getDates());
			preparedStatement.setInt(5, product.getIdproduct());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
	}

	@Override
	public void deletebyid(int idproduct) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(ProductQueri.DELETE_BY_ID_QUERY);
			preparedStatement.setInt(1, idproduct);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
		return;
	}

	@Override
	public Product findbyid(int idproduct) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(ProductQueri.FIND_BY_ID_QUERY);
			preparedStatement.setInt(1, idproduct);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				Product product = new Product();
				product.setIdproduct(resultSet.getInt("idproduct"));
				product.setP_name(resultSet.getString("p_name"));
				product.setP_packket(resultSet.getString("p_packket"));
				product.setP_address(resultSet.getString("p_address"));
				product.setDates(resultSet.getString("dates"));

				return product;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		return null;
	}

	@Override
	public List<Product> findall() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(ProductQueri.FIND_BY_ID_QUERY);
			resultSet = preparedStatement.executeQuery();
			List<Product> p = new ArrayList<Product>();

			while (resultSet.next()) {
				Product product = new Product();
				product.setIdproduct(resultSet.getInt("idproduct"));
				product.setP_name(resultSet.getString("p_name"));
				product.setP_packket(resultSet.getString("p_packket"));
				product.setP_address(resultSet.getString("p_address"));
				product.setDates(resultSet.getString("dates"));
				p.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		return null;
	}

}

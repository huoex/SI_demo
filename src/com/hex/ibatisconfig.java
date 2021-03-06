package com.hex;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class ibatisconfig {

	/**
	 * SqlMapClient instances are thread safe, so you only need one. In this
	 * case, we'll use a static singleton. So sue me. ;-)
	 */
	private static SqlMapClient sqlMapper;

	/**
	 * It's not a good idea to put code that can fail in a class initializer,
	 * but for sake of argument, here's how you configure an SQL Map.
	 */
	static {
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			// Fail fast.
			throw new RuntimeException(
					"Something bad happened while building the SqlMapClient instance."
							+ e, e);
		}
	}

	public static List selectAllAccounts() throws SQLException {
		return sqlMapper.queryForList("selectAllAccounts");
	}

	public static Account selectAccountById(int id) throws SQLException {
		return (Account) sqlMapper.queryForObject("selectAccountById", id);
	}
	
	public static void insertAccount(Account account) throws SQLException {
		sqlMapper.insert("insertAccount", account);
	}

	public static void updateAccount(Account account) throws SQLException {
		sqlMapper.update("updateAccount", account);
	}

	public static void deleteAccount(int id) throws SQLException {
		sqlMapper.delete("deleteAccount", id);
	}
}

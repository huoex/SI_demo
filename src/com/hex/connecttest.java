package com.hex;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibatis.sqlmap.client.SqlMapClient;

public class connecttest {

	@Test
	public void test() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlMapClient sql =(SqlMapClient) ac.getBean("sqlMapClient");
		List<Account> ls = sql.queryForList("selectAllAccounts");
		
		System.out.println(ls);
		for (Account entity : ls) {
			System.out.println(entity.getId() + "," + entity.getFirstName()
					+ "," + entity.getLastName() + ","
					+ entity.getEmailAddress());
		}
		
//		fail("Not yet implemented");
	}

}

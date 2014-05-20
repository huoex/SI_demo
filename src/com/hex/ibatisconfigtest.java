package com.hex;

import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

public class ibatisconfigtest {

	@Test
	public void test() {
		ibatisconfig ic =  new ibatisconfig();
		try {
			ArrayList al = (ArrayList) ibatisconfig.selectAllAccounts();
			ibatisconfig.selectAllAccounts();
			Account ac = ibatisconfig.selectAccountById(1);
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// todo
//		fail("Not yet implemented");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}

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
			ArrayList al = (ArrayList) ic.selectAllAccounts();
			ic.selectAllAccounts();
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO
//		fail("Not yet implemented");
	}

}

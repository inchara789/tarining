package com.cruds.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.cruds.db.DBConnectionManager;

public class TestBDBConn {

	@Test
	public void test() {
		Connection conn=DBConnectionManager.getConnection();
		assertNotNull(conn);
	}

}

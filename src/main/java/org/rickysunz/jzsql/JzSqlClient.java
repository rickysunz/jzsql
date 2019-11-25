package org.rickysunz.jzsql;

import java.sql.Connection;
import java.util.List;

public class JzSqlClient {
	
	private Connection connection;

	public JzSqlClient() {
		
	}
	
	public JzSqlClient(Connection connection) {
		this.connection = connection;
	}
	
	public int insert(Object item) {
		return 0;
	}
	
	public int update(Object item) {
		return 0;
	}
	
	public int execute(String sql) {
		return 0;
	}
	
	public int execute(String sql,Object ... param) {
		return 0;
	}
	
	public List<Object> query(String sql) {
		return null;
	}
	
	public List<Object> query(String sql, Object ... param) {
		return null;
	}

}

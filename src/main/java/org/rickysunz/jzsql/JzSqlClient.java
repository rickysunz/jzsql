package org.rickysunz.jzsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class JzSqlClient {
	
	private Connection connection;

	public JzSqlClient() {
		
	}
	
	public JzSqlClient(Connection conn) {
		this.connection = conn;
	}
	
	private Connection getConnection() {
		return connection;
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
	
	public int execute(String sql,Object ... params) {
		return 0;
	}
	
	public <E> List<E> query(String sql, Class<E> elementClass) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			List<E> result = new ArrayList<E>();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while(rs.next()) {
				E element = elementClass.newInstance();
				result.add(element);
			}
			
			return result;
			
		} finally {
			closeQuietly(rs);
			closeQuietly(stmt);
			closeQuietly(conn);
		}
	}
	
	public <E> List<E> query(String sql, Object ... params) {
		
		return null;
	}
	
	private void closeQuietly(AutoCloseable closeable) {
		try {
			if(closeable!=null) closeable.close();
		} catch (Exception ex) {
			
		}
	}

}

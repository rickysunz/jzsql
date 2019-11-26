package org.rickysunz.jzsql;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestJzSql {

	public TestJzSql() {
		
	}
	
	@Test
	public void testQuery() {
		try {
			JzSqlClient client = new JzSqlClient();
			List<Object> result = client.query("");
			assertEquals(result, "");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

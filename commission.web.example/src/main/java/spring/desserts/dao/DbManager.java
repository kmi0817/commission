package spring.desserts.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbManager {

	public static Connection getConnection() throws Exception {
		Connection conn = null;
		
		try {
            // MySQL JDBC 드라이버 클래스
            String jdbc_driver = "com.mysql.cj.jdbc.Driver";
            
            // MySQL 연결 정보
            String jdbc_url = System.getenv("jdbc_url");
            String jdbc_user = System.getenv("jdbc_user");
            String jdbc_passwd = System.getenv("jdbc_passwd");
			
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, jdbc_user, jdbc_passwd);
		} catch (Exception e) {
			System.out.println("Connection Error: " + e);
		}
		
		return conn;
	}
}

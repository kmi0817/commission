package spring.desserts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DessertsDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public ArrayList<DessertsDO> getAll() throws Exception {
		ArrayList<DessertsDO> desserts = new ArrayList<DessertsDO>();
		
		conn = DbManager.getConnection();
		String sql = "SELECT * FROM desserts";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DessertsDO dessertsDO = new DessertsDO(
						Integer.parseInt(rs.getString("id")),
						rs.getString("name"),
						rs.getString("description")
						);
				desserts.add(dessertsDO);
			}
		} catch (Exception e) {
			System.out.println("SQL Error: " + e);
		}
		
		return desserts;
	}
}

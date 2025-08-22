package com.mvns.web.dao;

import java.sql.*;
import com.mvns.web.model.Group;

public class GroupDao 

{
	public Group getGroup(int id) {
		
		Group g =new Group();
		/*//manualy entered
		 * g.setId(4);
		 *  g.setName("steve"); 
		 *  g.setTech("python");
		 */
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nagdb","root","1996");
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery("select * from newtable where id="+id);
			if(rs.next()) {
				g.setId(rs.getInt("id"));
				g.setName(rs.getString("name"));
				g.setTech(rs.getString("tech"));
			}
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		return g;
		
	}

	
}

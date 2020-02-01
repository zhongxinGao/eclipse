package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements PersonDao {
	 Connection conn=null;
	    PreparedStatement pstmt=null;
	    ResultSet rs=null;
	    
	@Override
    public List<Person> getAllPerson() {
        List<Person> person=new ArrayList<Person>();
        String sql="select * from person";
        try {
            conn=PersonDB.getConnection();
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while(rs.next()){
            	Person p=new Person(rs.getInt(1), rs.getString(2), rs.getInt(3));
                person.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
        	PersonDB.closeAll(rs, pstmt, conn);
        }
        return person;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.dao;

import expenses.dbutil.DBConnExp;
import expenses.pojo.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Maraxys
 */
public class UsersDAO {
    public static boolean ValidateUserLogin(Users u) throws SQLException {
        Connection conn=DBConnExp.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where user_id=? and password=?");    
        
            ps.setString(1,u.getUserId());
            ps.setString(2,u.getPassword());
            
        ResultSet rs=ps.executeQuery();
        if(rs.next()) {
            return true;
        }
        else {
            return false;
        }
    
    }
}

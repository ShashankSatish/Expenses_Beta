/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.dao;

import expenses.dbutil.DBConnExp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Maraxys
 */
public class CategoriesDAO {
    
    public static void addToCat(String uid,int budget) throws SQLException {
        Connection conn=DBConnExp.getConnection();
        
            PreparedStatement ps=conn.prepareStatement("insert into catwise_expense(user_id,budget) values(?,?)");
                ps.setString(1,uid);
                ps.setInt(2,budget);
            ps.executeUpdate();
    }
}

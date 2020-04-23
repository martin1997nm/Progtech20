package Beadando.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQL {

    String dbURL = "jdbc:mysql://localhost/ProgTech20";
    String username = "root";
    String password = "";
    Connection dbCon;

    public SQL() {
        try {
            this.dbCon = DriverManager.getConnection(this.dbURL, this.username, this.password);
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Disconnect() {
        try {
            this.dbCon.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean checkLogin(String username, String password) {
        PreparedStatement prepStatement = null;
        ResultSet resultSet = null;
        
        try {
            prepStatement = this.dbCon.prepareStatement("SELECT `username`, `password` FROM `users` WHERE `username` = ? AND `password` = SHA2(?, 256)");
            prepStatement.setString(1, username);
            prepStatement.setString(2, password);
            resultSet = prepStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                prepStatement.close();
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public Statement createStatement() {
        try {
            return this.dbCon.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

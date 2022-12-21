package za.ac.cput.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @since: 27 May 2021
 */
public class DBConnect {
  
  public static Connection makeConnection() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/students";
    String uname = "root";
    String password = "@Admin0912";
    Connection con = null;
    
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, uname, password);
    } 
    catch (ClassNotFoundException ex) {
      Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
    }
    return con;
  }
  
  public static void main(String[] args) throws SQLException {
    System.out.println(makeConnection());
  }
}

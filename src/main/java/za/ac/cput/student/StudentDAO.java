
package za.ac.cput.student;

import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import za.ac.cput.database.DBConnect;
/**
 *
 * @since: 27 May 2021
 */
public class StudentDAO {
  
  //Select Method
  public static String select() throws SQLException {
    List<Student> list = new ArrayList<>();
    Connection con = DBConnect.makeConnection();
    Statement st = con.createStatement();
      
    String sql = "SELECT * FROM students";
    ResultSet rs = st.executeQuery(sql);
      
    while(rs.next()){
      Student student = new Student();
      student.setId(rs.getString("id"));
      student.setStudent_name(rs.getString("student_name"));
      student.setCourse(rs.getString("course"));
      student.setFees(rs.getString("fees"));

      list.add(student); 
    }
    String json = new Gson().toJson(list);
      
    return json;
  }
  
  //Update Method
  public static void update(Student student) throws SQLException{
    Connection con = DBConnect.makeConnection();
    Statement st = con.createStatement();
    
    String sql = "UPDATE students SET student_name = '"+student.getStudent_name()+"',  course = '"+student.getCourse()+"', fees = '"+student.getFees()+"' ";
    st.executeUpdate(sql);
  }
  
  //Insert method
  public static void insert(Student student) throws SQLException {
    Connection conn = DBConnect.makeConnection();
    String sql = "INSERT INTO students (student_name, course, fees) VALUES ( '"+student.getStudent_name()+"', '"+student.getCourse()+"', '"+student.getFees()+"' )";
      
    if(!student.getStudent_name().equals("") && !student.getCourse().equals("") && !student.getFees().equals("")) {
      Statement statment = conn.createStatement();
      statment.executeUpdate(sql);
    }
  }
  
  public static void main(String[] args) throws SQLException {
    System.out.println(select());
  }
}

package za.ac.cput.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import za.ac.cput.student.Student;
import za.ac.cput.student.StudentDAO;

/**
 *
 * @since: 27 May 2021
 */
public class Insert extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    
    PrintWriter out = response.getWriter();
    try {

      String student_name = request.getParameter("studentName");
      String course = request.getParameter("course");
      String fees = request.getParameter("fees");
      
      Student student = new Student();
      student.setStudent_name(student_name);
      student.setCourse(course);
      student.setFees(fees);
      
      StudentDAO.insert(student);
      out.println(StudentDAO.select());
    } 
    catch (SQLException ex) {
      out.println("Error connecting");
      Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    doGet(request, response);
  }
}

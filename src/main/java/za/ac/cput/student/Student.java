package za.ac.cput.student;
/**
 *
 * @since: 27 May 2021
 */
public class Student {
  private String id;
  private String student_name;
  private String course;
  private String fees;

  public Student (){}
  
  public Student(String id, String student_name, String course, String fees) {
    this.id = id;
    this.student_name = student_name;
    this.course = course;
    this.fees = fees;
  }
  
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStudent_name() {
    return student_name;
  }

  public void setStudent_name(String student_name) {
    this.student_name = student_name;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public String getFees() {
    return fees;
  }

  public void setFees(String fees) {
    this.fees = fees;
  }  
}
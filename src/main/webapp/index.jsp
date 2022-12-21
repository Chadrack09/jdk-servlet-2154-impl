<%-- Document : index Created on : 24 May 2021 --%>

  <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>AJAX JSP</title>
      <link rel="stylesheet" href="css/style.css" />

      <script <script src="js/jquery.js"></script>
    </head>

    <body>
      <!-- Ajax Header section will be loaded here -->

      <!-- main section -->
      <main class="container">
        <div class="form-container">
          <form id="form_register">
            <h1>Student Form</h1>
            <small>Please, fill up all field</small>
            <div class="form-content">
              <div class="student-name">
                <label for="studentName">Student Name</label>
                <input type="text" name="studentName" id="studentName">
              </div>
              <div class="student-course">
                <label for="course">Course</label>
                <input type="text" name="course" id="course">
              </div>
              <div class="student-fee">
                <label for="fees">Fees</label>
                <input type="text" name="fees" id="fees">
              </div>
              <div class="student-fee">
                <input type="submit" value="Register" id="register">
              </div>
            </div>
          </form>
        </div>
        <div class="table-container">
          <div class="query">
            <div class="all-option">
              <span>Show</span>
              <select name="options" id="options">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
              </select>
            </div>
            <div class="search-container">
              <span>Search</span>
              <input type="text" placeholder="Search Student">
            </div>
          </div>
          <form action="" method="GET" id="display_form">
            <table id="table">
              <thead>
                <tr>
                  <td>Name</td>
                  <td>Course</td>
                  <td>Fee</td>
                  <td></td>
                  <td></td>
                </tr>
              </thead>
              <tbody>

              </tbody>
            </table>
          </form>
        </div>
      </main>

      <%-- Model Container --%>
        <div class="model-container" id="model_container">
          <span class="close" id="close">&times;</span>
          <div class="model-content container">
            <div class="form-container ">
              <form action="Update" method="POST">
                <h1>Student Form</h1>
                <div class="form-content">
                  <div class="student-name">
                    <label for="studentName">Edit Student</label>
                    <input type="text" name="studentName">
                  </div>
                  <div class="student-course">
                    <label for="course">Course</label>
                    <input type="text" name="course">
                  </div>
                  <div class="student-fee">
                    <label for="fees">Fees</label>
                    <input type="text" name="fees">
                  </div>
                  <div class="student-fee">
                    <input type="submit" value="Edit" id="edit">
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>

        <form action="" method="post">
          <a href="test.jsp"><input type="submit" value="Submit"></a>
        </form>

        <div class="nums container" style="margin-top: 5rem">
          <div class="num">10%</div>
          <div class="num">20%</div>
          <div class="num">30%</div>
          <div class="num">40%</div>
          <div class="num">50%</div>
        </div>
        <script src="js/script.js"></script>
    </body>

    </html>
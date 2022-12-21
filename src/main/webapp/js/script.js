class Page {
  static addHeader() {
    $.ajax({
      url: 'components/header.jsp',
      method: 'GET'
    }).done((data) => {
      $('body').prepend(data);
    })
  }
  static addFooter() {
    $.ajax({
      url: 'components/footer.jsp',
      method: 'GET'
    }).done((data) => {
      $('body').append(data)
    })
  }
}

class Student {
  static select() {
    $.ajax({
      url: 'Select',
      method: 'GET',
      dataType: 'json'
    }).done(function (data) {
      $('#display_form #table tbody').empty();
      $.each(data, function (i, student) {
        $('#display_form #table').append('<tr><td>' + student.student_name + '</td><td>' + student.course + '</td><td>' + student.fees + '</td><td><input type="submit" value="Edit"></td><td><input type="submit" value="Delete"></td></tr>');
      });

      $('#display_form').on({
        submit: function (e) {
          e.preventDefault();
        },
        click: function (e) {
          if (e.target.value == "Edit") {
            const model_container = $('#model_container');
            const close = $('#close');
            model_container.css('display', 'block');
            close.on('click', function () {
              model_container.css('display', 'none');
            });
            $(window).on('click', function (e) {
              if ($(e.target).is(model_container)) {
                model_container.css('display', 'none');
              }
            });
          }
        }
      });
    });
  }
  static insert() {
    $('#form_register').on('submit', function (e) {
      e.preventDefault();
      const data = $(this).serialize();

      $.ajax({
        url: 'Insert',
        type: 'POST',
        dataType: 'JSON',
        data: data,
      }).done(function (data) {
        Student.select();
        console.log('Successfully Added');
      });
    });
  }

  static edit() {
    $('#display_form').on({
      click: function (e) {

      }
    })
  }
}


$(() => {
  Page.addHeader();
  Page.addFooter();

  Student.select();
  Student.insert();
  Student.edit();
});

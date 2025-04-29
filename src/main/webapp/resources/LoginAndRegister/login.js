/**
 * 
 */



$(document).ready(function () {
       var errorMsg = "${errorMsg}";

       if ($.trim(errorMsg) !== "") {
           // Retrieve email from sessionStorage if error exists
           var savedEmail = sessionStorage.getItem('email');
           if (savedEmail) {
               $('#email').val(savedEmail);
           }
       }

       // Store email on input
       $('#email').on('input', function () {
           sessionStorage.setItem('email', $(this).val());
       });
   });
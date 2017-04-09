$(document).ready(function(){
  var time

  window.onload = myTimer();

  function myTimer(){
    var timer = 10;
    time = setInterval(function () {
      timer--;
      if(timer > 4) {
        $('.timer').html(timer + ' seconds');
      }
      else if (timer > 0) {
        $('.timer').html('hurry ' + timer + ' seconds');
      }
      else {
        window.location = "end.html";
      }
    }, 1000);
  }

  // $('.test').click(function(){
  //   clearInterval(time);
  //   myTimer();
  // });

});

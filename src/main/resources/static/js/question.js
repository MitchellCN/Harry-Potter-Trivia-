$(document).ready(function(){
  var timer = 10;
  var interval = setInterval(function () {
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
});

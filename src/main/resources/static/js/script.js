$(document).ready(function(){

  $('.toggle').click(function(){
    $('.show-toggle').slideToggle();
  });
});



// $(document).ready(function(){
//   var timer = 5;
//   setInterval(function () {
//     timer--;
//     if(timer > 0) {
//       $('.timer').html(timer);
//     }
//     else {
//       window.location = "end.html";
//     }
//   }, 1000);
// });

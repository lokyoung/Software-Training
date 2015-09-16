
window.onload = function(){
  var a = document.getElementsByTagName("p");
  var num = 0;
  for (var i = 0; i < a.length; i++) {
    var l = a[i].innerHTML.toLowerCase();
    if(l.indexOf("a") >= 0){
      num = num + 1;
    }
  }
  document.write("共有"+num+"个字符串包含A或a");
}

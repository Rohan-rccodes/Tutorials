
// JavaScript for adding the "Copy to Clipboard" functionality
var copyButton1 = document.getElementById("copy-button1");
copyButton1.addEventListener("click", function() {
  var code = document.getElementById("code1").innerText;
  navigator.clipboard.writeText(code).then(function() {
    alert("Code copied to clipboard!");
  }, function(err) {
    console.error("Failed to copy code: ", err);
  });
});

var copyButton2 = document.getElementById("copy-button2");
copyButton2.addEventListener("click", function() {
  var code = document.getElementById("code2").innerText;
  navigator.clipboard.writeText(code).then(function() {
    alert("Code copied to clipboard!");
  }, function(err) {
    console.error("Failed to copy code: ", err);
  });
});






















// function myFunction() {
//     var copyText = document.getElementById("myInput");
//     copyText.select();
//     copyText.setSelectionRange(0, 99999);
//     navigator.clipboard.writeText(copyText.value);
    
//     var tooltip = document.getElementById("myTooltip");
//     tooltip.innerHTML = "Copied: " + copyText.value;
//   }
  
//   function outFunc() {
//     var tooltip = document.getElementById("myTooltip");
//     tooltip.innerHTML = "Copy to clipboard";
//   }
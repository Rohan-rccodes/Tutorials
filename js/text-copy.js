
  // Add click event listener to each copy code button
  document.querySelectorAll(".copy-code-button").forEach(function(button) {
    button.addEventListener("click", function() {
      // Get the code element
      var codeElement = this.parentElement.querySelector("code");
 
      // Create a temporary textarea to copy the code
      var textarea = document.createElement("textarea");
      textarea.value = codeElement.innerText;
      document.body.appendChild(textarea);
 
      // Select and copy the code
      textarea.select();
      document.execCommand("copy");
 
      // Remove the temporary textarea
      document.body.removeChild(textarea);
 
      // Change the button text to "Copied!" for a short duration
      var originalText = this.innerText;
      this.innerText = "Copied!";
      setTimeout(function() {
        button.innerText = originalText;
      }, 1500);
    });
  });
// code copy 
    const copyButton = document.getElementById('copy-button');
    const codeBlock = document.querySelector('.code-snippet pre code');

    copyButton.addEventListener('click', () => {
        const textToCopy = codeBlock.textContent;

        const tempTextArea = document.createElement('textarea');
        tempTextArea.value = textToCopy;
        document.body.appendChild(tempTextArea);
        tempTextArea.select();
        document.execCommand('copy');
        document.body.removeChild(tempTextArea);

        copyButton.textContent = 'Copied!';
        setTimeout(() => {
            copyButton.textContent = 'Copy';
        }, 2000);
    });


// // JavaScript for adding the "Copy to Clipboard" functionality
// var copyButton1 = document.getElementById("copy-button1");
// copyButton1.addEventListener("click", function() {
//   var code = document.getElementById("code1").innerText;
//   navigator.clipboard.writeText(code).then(function() {
//     alert("Code copied to clipboard!");
//   }, function(err) {
//     console.error("Failed to copy code: ", err);
//   });
// });

// var copyButton2 = document.getElementById("copy-button2");
// copyButton2.addEventListener("click", function() {
//   var code = document.getElementById("code2").innerText;
//   navigator.clipboard.writeText(code).then(function() {
//     alert("Code copied to clipboard!");
//   }, function(err) {
//     console.error("Failed to copy code: ", err);
//   });
// });

// var prevScrollpos = window.pageYOffset;

// window.onscroll = function()
//  {
// var currentScrollPos = window.pageYOffset;

//   if (prevScrollpos > currentScrollPos) {
//     document.getElementById("navbar").style.top = "0";
//   } else {
//     document.getElementById("navbar").style.top = "-62px";
//   }
//   prevScrollpos = currentScrollPos;
// }


// code for dropdown 
const tutdropbtn = document.querySelector(".tutdrop-btn");
const dropdowncontent = document.querySelector(".dropdown-content");

tutdropbtn.addEventListener("click",()=>{
  dropdowncontent.classList.toggle("dropdownhidden")
})

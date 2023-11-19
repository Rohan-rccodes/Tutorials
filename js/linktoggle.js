let anchor = document.querySelector(".anchor"),
		icon = document.querySelector(".icon");
	anchor.addEventListener("click",()=>
{
    if(icon.classList.contains("fa-caret-down"))
    {
        icon.classList.remove("fa-caret-down")
        icon.classList.add("fa-caret-up")
        }else{
        icon.classList.remove("fa-caret-up")
        icon.classList.add("fa-caret-down")
        }
   
    })


/*
    HRvoid scriptsheet
*/ 
try
{
    // let main = document.getElementById('main');
    let menu = document.getElementById('aside');
    let aside = document.querySelectorAll('#aside a')
    
    var isActive = true; // default active
    
    /*
        menu open function : isActive enable
    */
    
    // function menu_open(){
    //     menu.style.display = "block";
    //     main.style.gridTemplateColumns = "3fr 1fr";
    //     isActive = true;
    // }
    /*
        menu close function : isActive disable
    */
    // function menu_close(){
    //     menu.style.display = "none";
    //     main.style.gridTemplateColumns = "1fr";
    //     isActive = false;
    // }
    
    /*
        menu button function : open & close
    */
    
    // document.getElementById('menu_button').onclick = () => (isActive)? menu_close() : menu_open();
    
    /*
        menu anchor function : active
    */
    aside[0].classList.add('asideActive') // default
    
    aside.forEach(i => {
    
        i.onclick = () => {
        
            aside.forEach(o => o.classList.remove('asideActive'))

            i.classList.add('asideActive')  // active
        }    
    })
}
catch(e)
{
    console.log(e);
}
// the end




// let alink = document.querySelectorAll(".sidebar .sidelinks a")

// console.log(alink[0].innerHTML)
// alink[0].classList.add("red")

// for (let i = 0; i < alink.length; i++) {

//   alink[i].onclick = () => {

//     const red = document.querySelector('.red');

//     if(red) red.classList.remove('red');

//     for (let i = 0; i < alink.length; i++) {

//       console.log(alink[i].innerHTML)

//       alink[i].addEventListener("click", () => {

//         alink[i].classList.add("red")
        
//       })
//     }
//   }
// }

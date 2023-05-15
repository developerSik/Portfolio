const choosier = document.querySelector('.ProductSelectMenu_container__18idj');
const toggle = document.querySelector('.ProductSelect_title__3FqMO');
const arrow = document.querySelector('.ProductSelect_moreButton__2P_Sz');
const items = document.querySelectorAll('.ProductSelectMenu_content__39QFr div li');
const lists = document.querySelector('.ProductSelectMenu_content__39QFr');
const heartsbtn = document.querySelectorAll('.ProductFloatButton_wishButton__2uCyk');

toggle.addEventListener('click', function () {
    choosier.classList.toggle('ProductSelectMenu_unfold__95PrK');
    arrow.classList.toggle('ProductSelect_isOpenMoreInfo__201IV');
    if(choosier.classList.length>1) {
        lists.style.display ="block";
    }else{
        lists.style.display ="none";
    }
    });


// heartsbtn.forEach(item=>item.addEventListener('click',function (){
//     if(item.getAttribute('aria-pressed')==='true'){
//         item.classList.add('wishButton_active__3CKVe');
//         item.style.transition="scale 1s";
//         item.style.scale= "0.5";
//         item.setAttribute('aria-pressed','false');
//         item.style.scale= "1.0";
//         setTimeout(()=>{item.classList.remove('wishButton_active__3CKVe');},300);
//
//     }else if(item.getAttribute('aria-pressed')==='false'){
//         item.classList.add('wishButton_active__3CKVe');
//         item.setAttribute('aria-pressed','true');
//         setTimeout(()=>{item.classList.remove('wishButton_active__3CKVe')},300);
//     }
// }));

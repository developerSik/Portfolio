const choosier = document.querySelector('.ProductSelectMenu_container__18idj');
const toggle = document.querySelector('.ProductSelect_title__3FqMO');
const arrow = document.querySelector('.ProductSelect_moreButton__2P_Sz');
const items = document.querySelectorAll('.ProductSelectMenu_content__39QFr div li');
const lists = document.querySelector('.ProductSelectMenu_content__39QFr');
const heartbtn = document.querySelector('.ProductFloatButton_wishButton__2uCyk');
const moreinfobtn = document.querySelector('.ProductEtcInfo_titleArea__4p9Wk');
const moreinfo = document.querySelector('#tmi');
const moreinfoarrow = document.querySelector('.ProductEtcInfo_button__rAty1');

const showmorebtn = document.querySelector('MoreButton_button__3qNcH');


toggle.addEventListener('click', function () {
    choosier.classList.toggle('ProductSelectMenu_unfold__95PrK');
    arrow.classList.toggle('ProductSelect_isOpenMoreInfo__201IV');
    if(choosier.classList.length>1) {
        lists.style.display ="block";
    }else{
        lists.style.display ="none";
    }
    });

// showmorebtn.addEventListener('click',function () {
//     showmorebtn.classList.toggle('MoreButton_isFold__JVqoe');
//
// });

heartbtn.addEventListener('click',function () {
    if(heartbtn.getAttribute('aria-pressed')==='true') {
        heartbtn.setAttribute('aria-pressed', 'false');
    }  else{
        heartbtn.setAttribute('aria-pressed', 'true');
    }
});

moreinfobtn.addEventListener('click',function () {
    moreinfobtn.classList.toggle('ProductEtcInfo_fold__26Z5O');
    moreinfoarrow.classList.toggle('MoreButton_isFold__JVqoe');
    if(moreinfobtn.classList.length>1){
        moreinfo.style.display="block";
    }else{
        moreinfo.style.display="none";
    }
});
const choosier = document.querySelector('.ProductSelectMenu_container__18idj');
const toggle = document.querySelector('.ProductSelect_title__3FqMO');

const arrow = document.querySelector('.ProductSelect_moreButton__2P_Sz');
const items = document.querySelectorAll('.ProductSelectMenu_content__39QFr div li');

toggle.addEventListener('click', function () {
    choosier.classList.toggle('ProductSelectMenu_unfold__95PrK');
    arrow.classList.toggle('ProductSelect_isOpenMoreInfo__201IV');
    if(choosier.classList.length>1) {
    items.forEach(item=>item.style.display="block");

    }else{
        items.forEach(item=>item.style.display="none");
    }
    })


$(window).resize(function(){


    if (window.innerWidth > 758) {
        $(".web-header-mobile").hide();
        $(".web-header-large").show();
    }

    else {
        $(".web-header-large").hide();
        $(".web-header-mobile").show();

    }

}).resize();
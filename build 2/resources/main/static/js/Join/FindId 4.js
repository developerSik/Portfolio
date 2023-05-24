var getMail = RegExp(/^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/);

$("#email").on("keyup",function() {
    if ($("#email").val() == "") {
        $("#pemail").html("이메일을 입력해주세요.")
        $("#email").css("borderColor", "red")
        $("#pemail").css("Color", "#red")

        $("#email").focus();
        return false;
    }
    else if(!getMail.test($("#email").val())){
        $("#pemail").html("이메일에 형식에 맞게 입력해주세요.")
        $("#email").css("borderColor", "#f66")
        $("#pemail").css("Color", "#f66")

        $("#mail").val("");
        $("#mail").focus();
        return false;

    }
    else {
        $("#pemail").html("")
        $("#email").css("borderColor", "rgba(0, 0, 0, 0.08)")
        $("#pemail").html("")
        $("#email").css("borderColor", "rgba(0, 0, 0, 0.08)")
        $('#checkEmail').css("opacity", "1")
        $('#checkEmail').css("pointer-events", "auto")
        $.ajax({
            url: `/join/check-id/${$(this).val()}`,
            success:
            function (result) {
                if (result) {
                    $("#pemail").text("찾으신 아이디입니다.");
                    $("#pemail").css('color', 'blue')
                } else {
                    $("#pemail").text("없는 아이디입니다.");
                    $("#pemail").css('color', 'red')
                }
            }
        });
        return false;
    }



});
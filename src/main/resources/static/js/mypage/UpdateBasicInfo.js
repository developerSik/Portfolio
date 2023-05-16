/*이메일 변경*/
$("#emailChangeBtn").click(function () {
    if ($("#userName").is(":disabled")) {
        $('#userName').attr("disabled", false);
        $("#userName").css("background-color", "white");
        $("#changeEmailInfo").show();
        $("#emailCheckBtn").show();
        $("#emailChangeBtn").hide();


        $(document).ready(function () {
            $("#userName").hover(function () {
                $("#userName").css("border-color", "#6B95FC");
            }, function () {
                $("#userName").css("border-color", "");
            });
        });
    } else {
        $("#changeEmailInfo").hide();
        $('#userName').attr("disabled", true);
        $("#userName").css("background-color", "#e7e7e7");
    }
});


/*전화번호 변경*/
$("#mobileChangeBtn").click(function () {
    if ($("#mobileNumber").is(":disabled")) {
        $('#mobileNumber').attr("disabled", false);
        $("#mobileNumber").css("background-color", "white");
        $("#mobileCheckBtn").show();
        $(".input-btn-wrap").show();
        $("#mobileChangeBtn").hide();



        /*호버*/
        $(document).ready(function () {
            $("#mobileNumber").hover(function () {
                $("#mobileNumber").css("border-color", "#6B95FC");
            }, function () {
                $("#mobileNumber").css("border-color", "");
            });
        });
    } else {
        $('#mobileNumber').attr("disabled", true);
        $("#mobileNumber").css("background-color", "#e7e7e7");
        $("#emailCheckBtn").show();
        $(".input-btn-wrap").hide();
        $(".tr").hide();
    }
});


/*사진변경*/
$(document).ready(function () {
    $("#btn_updatePhoto").click(function () {
        $("#file_input").click();
    });

    $("#file_input").change(function () {
        var file = this.files[0];
        var reader = new FileReader();

        reader.onload = function (e) {
            $("#profile_image").attr("src", e.target.result);
        };

        reader.readAsDataURL(file);
    });

    $("#btn_deletePhoto").click(function () {
        $("#profile_image").attr("src", "https://d2v80xjmx68n4w.cloudfront.net/assets/icon/mykmong-profile-default@3x.png");
    });
});

/*이메일 유효성 검사*/
var getMail = RegExp(/^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/);

/*이메일 인증*/
$("#userName").on("keyup", function () {
    if ($("#userName").val() == "") {
        $("#emailError").show();
        $("#emailRetryBtn").hide();
        $("#userName").css("borderColor", "red")
        $("#userName").focus();

        return false;
    } else if (!getMail.test($("#userName").val())) {
        $("#userName").html("이메일에 형식에 맞게 입력해주세요.")
        $("#userName").css("borderColor", "#f66")
        $("#userName").css("Color", "#f66")
        $("#emailError").show();

        $("#userName").focus();
        return false;

    } else {
        $("#userName").html("")
        $("#userName").css("borderColor", "rgba(0, 0, 0, 0.08)")
        $("#emailError").hide();
        return false;
    }
});
$(document).ready(function () {


    $("#emailChangeBtn").click(function () {
        $("#userName").val("");
    });

});
/*$(document).ready(function () {
    $("#emailCheckBtn").click(function () {
        $("#emailConfirmArea").show();

    });
});*/

/*비번 인증*/




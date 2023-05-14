$("#password").on("propertychange change keyup paste input", function () {
    if ($("#password").val() == "") {
        $("#ppassword").html("비밀번호를 입력해주세요.")
        $("#password").css("borderColor", "#f66")
        $("#password").focus();
        return false;
    } else if ($("#password").val().length < 10 || $("#password").val().length > 20) {
        $("#ppassword").html("10자리 이상 20자리 이하로 입력해주세요.")
        $("#password").css("borderColor", "#f66")
        $("#password").focus();
        return false;
    } else if ($("#password").val().length < 10 || $("#password").val().length > 20) {
        $("#ppassword").html("10자리 이상 20자리 이하로 입력해주세요.")
        $("#password").css("borderColor", "#f66")
        $("#password").focus();
        return false;
    } else {
        $("#ppassword").html("")
        $("#password").css("borderColor", "rgba(0, 0, 0, 0.08)")
        return false;
    }
});

$(document).ready(function() {
    $("#oldPassword").click(function() {
        if ($(this).css("border-color") === "#6B95FC") {
            $(this).css("border-color", "");
        } else {
            $(this).css("border-color", "#6B95FC");
        }
    });
});

$(document).ready(function() {
    $("#my-div").click(function(event) {
        $(this).css("border-color", "red");
        event.stopPropagation(); // 이벤트 전파 중단
    });

    $(document).click(function() {
        $("#my-div").css("border-color", ""); // 원래 색상으로 돌리기
    });
});

/*$("#oldPassword").click(function () {
    $("#oldPassword").css("borderColor", "#6B95FC")
});*/

$("#newPassword").click(function () {
    $("#newPassword").css("borderColor", "#6B95FC")
});

$("#newPasswordConfirm").click(function () {
    $("#newPasswordConfirm").css("borderColor", "#6B95FC")
});


let modal = $('.ReactModalPortal');
let BtnModalView = $('.btn_check_modal_view');
let BtnModalClose = $('.btn_modal_close');
$(modal).hide();

//   전체동의 모달 열기
$(BtnModalView).on('click', function () {
    $(modal).show();
});

//   전체동의 모달 닫기
$(BtnModalClose).on('click', function () {
    $(modal).hide();
});

var getMail = RegExp(/^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/);

$("#password").on("propertychange change keyup paste input",function() {
    if ($("#password").val() == "") {
        $("#ppassword").html("비밀번호를 입력해주세요.")
        $("#password").css("borderColor", "#f66")
        $("#password").focus();
        return false;
    }
    else if ($("#password").val().length < 10 || $("#password").val().length > 20) {
        $("#ppassword").html("10자리 이상 20자리 이하로 입력해주세요.")
        $("#password").css("borderColor", "#f66")
        $("#password").focus();
        return false;
    }
    else if ($("#password").val().length < 10 || $("#password").val().length > 20) {
        $("#ppassword").html("10자리 이상 20자리 이하로 입력해주세요.")
        $("#password").css("borderColor", "#f66")
        $("#password").focus();
        return false;
    }
    else {
        $("#ppassword").html("")
        $("#password").css("borderColor", "rgba(0, 0, 0, 0.08)")
        return false;
    }
});
$("#email").on("propertychange change keyup paste input",function() {
    if ($("#email").val() == "") {
        $("#pemail").html("이메일을 입력해주세요.")
        $("#email").css("borderColor", "red")
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
        return false;
    }
});

$("#name").on("propertychange change keyup paste input",function() {
    if ($("#name").val() == "") {
        $("#pname").html("이름을 입력해주세요.")
        $("#name").css("borderColor", "red")
        $("#name").focus();
        return false;
    }
    else {
        $("#pname").html("")
        $("#name").css("borderColor", "rgba(0, 0, 0, 0.08)")
        return false;
    }
});

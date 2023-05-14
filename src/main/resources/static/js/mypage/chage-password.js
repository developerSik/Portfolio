
/*
if(!/^(?=.*[a-zA-Z])(?=.*\d)(?=.*\W).{8,20}$/.test(pwd)){
    alert("비밀번호는 영문과 특수문자 숫자를 포함하며 8자 이상이어야 합니다.");
    return false;
}
*/

$("#newPassword").on("keyup",function() {
    if(!/^(?=.*[a-zA-Z])(?=.*\d)(?=.*\W).{8,20}$/.test(pwd)){
        $(".pwd-text").css("color","red")
        return false;
    }
});



$(document).ready(function() {
    $(".wz.button.primary").click(function(event) {
        $("#oldPassword").on("keyup",function() {
            if ($("#oldPassword").val() == "") {
                $("#oldPassword").html("비밀번호를 입력해주세요.")
                $("#oldPassword").css("borderColor", "#f66")
                $("#oldPassword").focus();
                return false;
            }
            else if ($("#oldPassword").val().length < 10 || $("#oldPassword").val().length > 20) {
                $("#oldPassword").html("10자리 이상 20자리 이하로 입력해주세요.")
                $("#oldPassword").css("borderColor", "#f66")
                $("#oldPassword").focus();
                return false;
            }

            else {
                $("#oldPassword").html("")
                $("#oldPassword").css("borderColor", "rgba(0, 0, 0, 0.08)")
                return false;
            }
        });
    });
});
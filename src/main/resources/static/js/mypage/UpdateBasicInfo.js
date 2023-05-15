/*$(document).ready(function () {
    $(".bt").click(function () {
        $(".show").hide();
        $(".bt").hide();
    });
});*/
/*이메일 변경*/
$("#emailChangeBtn").click(function () {
    if ($("#userName").is(":disabled")) {
        $('#userName').attr("disabled", false);
        $("#userName").css("background-color", "white");
        $("#changeEmailInfo").show();
        $("#emailCheckBtn").show();
        $("#emailChangeBtn").hide();


        $(document).ready(function() {
            $("#userName").hover(function() {
                $("#userName").css("border-color", "#6B95FC");
            }, function() {
                $("#userName").css("border-color", "");
            });
        });
    }else{
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
        $("#mobileChangeBtn").hide();


        /*호버*/
        $(document).ready(function() {
            $("#mobileNumber").hover(function() {
                $("#mobileNumber").css("border-color", "#6B95FC");
            }, function() {
                $("#mobileNumber").css("border-color", "");
            });
        });
    }else{
        $('#mobileNumber').attr("disabled", true);
        $("#mobileNumber").css("background-color", "#e7e7e7");
        $("#emailCheckBtn").show();
        $(".tr").hide();
    }
});

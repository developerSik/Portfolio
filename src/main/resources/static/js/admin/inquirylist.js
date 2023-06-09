

function getSelectedLectureIds() {
    const inquiryIds = [];
    $(".inquiryCheckbox:checked").each(function() {
        inquiryIds.push($(this).val());
    });
    return inquiryIds;
}


function deleteLectures(inquiryIds) {
    console.log(inquiryIds);
    $.ajax({
        url: "/admin/inquiry/delete",
        type: "POST",
        // method: "DELETE",
        // dataType: "json",
        contentType: "application/json",
        data: JSON.stringify(inquiryIds),
        success: function() {
            showWarnModal("삭제에 성공 하였습니다.");
            setTimeout(() => {
                location.reload();
            }, 1000);
        },
        error: function() {
            showWarnModal("삭제에 실패 하였습니다.");
        }
    });
}



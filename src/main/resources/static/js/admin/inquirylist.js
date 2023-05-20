$(document).ready(function() {
    const $tr = $(".table-content table");
    let text ="";
    inquirys.forEach(inquiry => {
        text +=
            `
                       <tr onclick="location.href='/admin/inquiry/read?id=${inquiry.id}'" class="tr">
                            <td onclick="event.cancelBubble=true" style="cursor: default">
                            <input type="checkbox" name="table-row" class="term"/>
                            </td>
                            <td>${inquiry.id}</td>
                            <td>${inquiry.name}</td>
                            <td>${inquiry.identification}</td>
                            <td>${inquiry.inquireContent}</td>
                            <td>${inquiry.inquireDate}</td>
                            <td>${inquiry.status}</td>
                       </tr>


        `
    });
    $tr.append(text);
})

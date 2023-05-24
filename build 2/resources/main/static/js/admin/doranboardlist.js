$(document).ready(function() {
    const $tr = $(".table-content table");
    let text ="";
    doranBoards.forEach(doranboard => {
        text +=
            `
                        <tr onclick="location.href='/admin/doranBoard/read?id=${doranboard.id}'" class="tr">
                            <td onclick="event.cancelBubble=true" style="cursor: default">
                                <input type="checkbox" name="table-row" class="term"/>
                            </td>
                            <td>${doranboard.id}</td>
                            <td>${doranboard.identification}</td>
                            <td>${doranboard.title}</td>
                            <td>${doranboard.content}</td>
                            <td>${doranboard.registerDate}</td>
                            <td>${doranboard.viewCount}</td>
                        </tr>


        `
    });
    $tr.append(text);
})

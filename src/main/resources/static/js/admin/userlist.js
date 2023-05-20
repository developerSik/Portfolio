$(document).ready(function() {
    const $tr = $(".table-content table");
    let text ="";
    users.forEach(user => {
        text +=
            `
                        <tr class="tr">
                            <td>
                            <input type="checkbox" name="table-row" class="term"/>
                            </td>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.identification}</td>
                   
                            <td>010-1234-1234</td>
                            <td>aaa1234@gmail.com</td>
                        </tr>

        `
    });
    $tr.append(text);
})

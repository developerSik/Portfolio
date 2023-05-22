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
                            <td>${user.address}</td>
                            <td>${user.phoneNumber}</td>
                            <td>${user.status}</td>
                        </tr>

        `
    });
    $tr.append(text);
})

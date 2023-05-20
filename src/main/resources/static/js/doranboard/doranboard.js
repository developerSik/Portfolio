$(document).ready(function(){
    const $ul = $(".wcommunity-webzine-list ul");

    let text = "";
    boards.forEach(board => {
        text += `
                   <li>
                        <a href="">
                            <div class="wcommunity-story">
                                <div class="story-info">
                                    <p class="title">${board.title}</p>
                                    <p class="summary">${board.content}</p>
                                    <p class="info"><em class="editor">${board.name}</em>
                                    <em class="date"></em><em class="symp"></em></p>
                                </div>
                                <!--<div class="img-wrap">
                                    <div class="story-img"
                                         style="background-image:url(https://cdn.wadiz.kr/ft/images/green001/2022/0913/20220913111130235_29.png/wadiz/resizecrop/420x320/format/jpg/quality/80)"></div>
                                </div>-->
                            </div>
                        </a>
                    </li>
        `
    });

    $ul.html(text);
});
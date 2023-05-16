
const Calendar = tui.Calendar;
const container = document.getElementById('calendar');
const options = {
    defaultView: 'month',
    useFormPopup: true,
    useDetailPopup: true,
    isReadOnly: true,

    gridSelection: {
        enableDblClick: false,
        enableClick: false,
    },
    month: {
        dayNames: ['일', '월', '화', '수', '목', '금', '토'],
        isAlways6Weeks: false,
        visibleEventCount: 4,
    },
    timezone: {
        zones: [
            {
                timezoneName: 'Asia/Seoul',
                displayLabel: 'Seoul',
            },
            {
                timezoneName: 'Europe/London',
                displayLabel: 'London',
            },
        ],
    },


    // calendars: [
    //     {
    //         id: '1',
    //         name: '과학',
    //         backgroundColor: '#2e51ef',
    //     },
    //     {
    //         id: '2',
    //         name: '스포츠',
    //         backgroundColor: '#9f8673',
    //     },
    //
    //     {
    //         id: '3',
    //         name: '전통',
    //         backgroundColor: '#705f53',
    //     },
    //
    //     {
    //         id: '4',
    //         name: '박물관',
    //         backgroundColor: '#74aaf0',
    //     },
    //     {
    //         id: '5',
    //         name: '농촌',
    //         backgroundColor: '#90949c',
    //     },
    //     {
    //         id: '6',
    //         name: '미술관',
    //         backgroundColor: '#9b72e7',
    //     },
    //     {
    //         id: '7',
    //         name: '공방',
    //         backgroundColor: '#f0bb9d',
    //     },
    //     {
    //         id: '8',
    //         name: '기타',
    //         backgroundColor: '#7a87f5',
    //     }
    // ],
};


const calendar = new Calendar(container, options);

calendar.on('clickEvent', ({ event }) => {
    console.log(event)
});

var currentDate = calendar.getDate();


$(".year").text(currentDate.getFullYear()+ "년");
$(".month").text(currentDate.getMonth() + 1 + "월");

$("#calender-prev").click(() => {
    currentDate = calendar.getDate();

    var prevDate = new Date(currentDate.getFullYear(), currentDate.getMonth() - 1, 1);
    var prevYear = prevDate.getFullYear();
    var prevMonthIndex = prevDate.getMonth();

    $(".year").text(prevYear+ "년");
    $(".month").text(prevMonthIndex + 1 + "월");

    calendar.prev();
});

$("#calender-next").click(() => {
    currentDate = calendar.getDate();

    var nextDate = new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 1);
    var nextMonthIndex = nextDate.getMonth();
    var nextYear = nextDate.getFullYear();

    $(".year").text(nextYear+ "년");
    $(".month").text(nextMonthIndex + 1 + "월");

    calendar.next();
})

$("#today").click(() => {
    $(".year").text(year+ "년");
    $(".month").text(month + "월");

    calendar.today();
});
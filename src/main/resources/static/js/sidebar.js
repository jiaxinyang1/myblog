function notice() {
    $.ajax({
        url:'/Notice',
        type:'post',
        success:function (data) {

            for (var i=0;i<data.length;i++){
                var com ="<p >"+data[i].date+"</p>\n" +
                    "<p style='font-size: 15px'>"+data[i].content+"</p>"
                $("#notice").append(com)
            }

        }
    })
}
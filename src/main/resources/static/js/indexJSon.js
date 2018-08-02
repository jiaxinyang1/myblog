function blog_post_content() {
    $.ajax({
        url:'/Summary',
        type:'post',
        contentType: "application/json;charset=utf-8",
        data:{

        },
        success : function (data) {
            var page=$("#page").text();
            var index=parseInt(page)

            for (var i = index*5; i <(index*5)+5 &&i<data.length ; i++) {
                $("#blog-post_0"+(i+1)).children("h2").html(data[i].title)
                $("#blog-post_0"+(i+1)).children("p:first").html(data[i].date)
                $("#blog-post_0"+(i+1)).children("#main_text").html(data[i].brief)
                $("#blog-post_0"+(i+1)).children("p:last").html(data[i].classification)

            }

            $("#page").html(index+1)

        }
    })
}
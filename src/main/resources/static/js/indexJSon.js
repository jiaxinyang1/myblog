function blog_post_content() {
    $.ajax({
        url:'/Summary',
        type:'post',
        contentType: "application/json;charset=utf-8",
        data:{
        },
        success : function (data) {
            var page=$("#page").text()
            var index=parseInt(page)

            for (var  i = index*5; i <(index*5)+5 &&i<data.length ; i++) {

                var com=" <div  id=\"blog-post_01\" class=\"blog-post\" ><!--测试文本-->\n" +
                    "                    <a class=\"blog-post-title\" onclick=\"go_to_content(this)\" style=\"font-size: 20px\">"+data[i].title+" </a>\n" +
                    "                    <p  class=\"blog-post-meta\" >"+data[i].date+"</p>\n" +
                    "                    <p id=\"main_text\" style=\"color:lightslategray;font-size: 16px\"  >\n"+data[i].brief+
                    "                    </p>\n" +
                    "                    <p class=\"blog-post-meta\" style=\"text-align: right\">"+data[i].classification+" </p>\n" +
                    "                </div>"

                $("#Summary_content").append(com)
            /*    $("#blog-post_0"+j).children("a").html(data[i].title)
                $("#blog-post_0"+j).children("p:first").html(data[i].date)
                $("#blog-post_0"+j).children("#main_text").html(data[i].brief)
                $("#blog-post_0"+j).children("p:last").html(data[i].classification)
                j++*/

            }

            $("#page").html(index+1)

        }
    })
}
function go_to_content(element) {
    var d={};
    d.title=element.innerHTML;
    $.ajax({
        url:'/GetContentTitle',
        type:'post',
        contentType:'application/json;charset=utf-8',
        data:JSON.stringify(d),
        success:location.href="/ftlContent"
    })

}

function recently_articles() {

    console.log("asdasd");
    $.ajax({
        url:'/Recently',
        type:'post',
        contentType:'application/json;charset=utf-8',
        success: function (data) {
            for (var i=0;i<data.length;i++) {
                console.log(data[i]);
                var com=" <li><a onclick='go_to_content(this)'>"+data[i].title+"</a></li>"
                $("#recently_articles_list").append(com)
            }
        }
        
    })
    
}
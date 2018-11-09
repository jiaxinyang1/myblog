function show_content() {
    $.ajax({
        url:'/MainContent',
        type:'post',
        data:{

        },
        success : function (data) {
            $("#title").html(data.title)
            $("#description").html(data.description)
            $("#main_content").html(data.content)

        }


    })

}
function show_comment() {
    $.ajax({
        url:'/ShowComment',
        type:'post',
        data:{

        },
        success : function (data) {

            for(var i=0;i<data.length;++i)
            {
                var com="<div class=\"media\" style=\"margin-top: 50px\">\n" +
                    "                <a class=\"media-left\" href=\"#\">\n" +
                    "                    <img class=\"media-object\" src=\"https://secure.gravatar.com/avatar/78d605e6a9cfcf84bead33b5042b04d4?s=44&d=mm&r=g\"\n" +
                    "                         alt=\"媒体对象\">\n" +
                    "                </a>\n" +
                    "                <div class=\"media-body\" >\n" +
                    "                    <h4 class=\"media-heading\">"+data[i].nickname+"</h4>\n" +
                    data[i].content+
                    "                </div>\n" +
                    "            </div>"
                $("#comment_body").append(com)
            }


        }

    })
    
}
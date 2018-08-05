<!DOCTYPE html>
<html  xmlns:th="http://www.thymeleaf.org">
<html lang="zh-CN">
<head>
    <link rel="stylesheet" type="text/css" href="css/index.css"/>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Static Top Navbar Example for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="navbar-static-top.css" rel="stylesheet">
    <link href="blog.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script src="https://cdn.bootcss.com/jquery/2.0.0/jquery.min.js"></script>

    <script src="js/indexJSon.js"></script>
</head>

<body onload="blog_post_content()">
<!-- Static navbar -->
<nav id="my_nav" class="navbar navbar-default navbar-static-top" style="opacity: 0.8">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" >灵梦小站</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">神社</a></li>
                <li><a href="Content.html">C++闲谈</a></li>
                <li><a href="#contact">Direct笔记</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>


<div class="container"  style="margin-bottom: 80px">
    <img src="image/title2.jpg" class="img-rounded" width="1000" height="200px">
    <div  style="margin-left: 70px;margin-top: 50px" class="blog-header">
        <h1 class="blog-title">欢迎来到幻想乡</h1>
        <p class="lead blog-description" style="color: slategrey">异变处理事务所</p>
    </div>
    <div class="row" >
        <div class="col-sm-8 blog-main" style="padding-left: 30px">
            <div style="padding-left: 70px" id="Summary_content">
                <div  id="blog-post_01" class="blog-post" >
                    <a class="blog-post-title" onclick="go_to_content(this)(this)" ></a>
                    <p  class="blog-post-meta" ></p>
                    <p id="main_text" style="color:lightslategray;font-size: 16px" >
                    </p>
                    <p class="blog-post-meta" style="text-align: right"> </p>
                </div>
                <div  id="blog-post_02" class="blog-post" >
                    <a class="blog-post-title" onclick="go_to_content(this)(this)" ></a>
                    <p  class="blog-post-meta" ></p>
                    <p id="main_text" style="color:lightslategray;font-size: 16px" >
                    </p>
                    <p class="blog-post-meta" style="text-align: right"> </p>
                </div>
                <div  id="blog-post_03" class="blog-post" >
                    <a class="blog-post-title" onclick="go_to_content(this)(this)" ></a>
                    <p  class="blog-post-meta" ></p>
                    <p id="main_text" style="color:lightslategray;font-size: 16px" >
                    </p>
                    <p class="blog-post-meta" style="text-align: right"> </p>
                </div>
                <div  id="blog-post_04" class="blog-post" >
                    <a class="blog-post-title" onclick="go_to_content(this)(this)" ></a>
                    <p  class="blog-post-meta" ></p>
                    <p id="main_text" style="color:lightslategray;font-size: 16px" >
                    </p>
                    <p class="blog-post-meta" style="text-align: right"> </p>
                </div>
                <div  id="blog-post_05" class="blog-post" >
                    <a class="blog-post-title" onclick="go_to_content(this)(this)" ></a>
                    <p  class="blog-post-meta" ></p>
                    <p id="main_text" style="color:lightslategray;font-size: 16px" >
                    </p>
                    <p class="blog-post-meta" style="text-align: right"> </p>
                </div>

            </div>


                <div style="margin-top: 20px"><!--导航下一页上一页-->
                    <p hidden id="page">0</p><!--标记页数-->
                    <a style="float: right" onclick="blog_post_content()">查看更多</a></span>
                </div>


        </div>
        <!--侧边栏-->
        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
            <div class="sidebar-module sidebar-module-inset">
                <div><!--公告栏主题内容-->
                    <h4>公告栏</h4>
                    <p id="Notice_time">2016.6.8</p>
                    <p id="Notice_content">公告栏测试内容，这里是公告栏测试的内容</p>
                </div>
                <div class="sidebar-module" style="margin-top: 30px">
                    <h4>近期文章</h4>
                    <ol class="list-unstyled" style="color: slategrey"><!--近期文章-->
                        <li><p href="#">近期文章测试</p></li>
                        <li><p href="#">近期文章测试</p></li>
                        <li><p href="#">近期文章测试</p></li>
                        <li><p href="#">近期文章测试</p></li>
                    </ol>
                </div>

            </div>
            <div class="sidebar-module" style="margin-top: 30px">
                <h4>文档归档</h4>
                <ol class="list-unstyled">
                    <li><a href="#">March 2014</a></li>
                    <li><a href="#">February 2014</a></li>
                    <li><a href="#">January 2014</a></li>
                    <li><a href="#">December 2013</a></li>
                    <li><a href="#">November 2013</a></li>
                    <li><a href="#">October 2013</a></li>
                    <li><a href="#">September 2013</a></li>
                    <li><a href="#">August 2013</a></li>
                    <li><a href="#">July 2013</a></li>
                    <li><a href="#">June 2013</a></li>
                    <li><a href="#">May 2013</a></li>
                    <li><a href="#">April 2013</a></li>
                </ol>
            </div>
            <div class="sidebar-module" style="margin-top: 30px">
                <h4>文章分类</h4>
                <ol class="list-unstyled" style="color: slategrey"><!--近期文章-->
                    <li><p href="#">c++</p></li>
                    <li><p href="#">dirctX</p></li>
                    <li><p href="#">Java</p></li>
                    <li><p href="#">杂谈</p></li>
                </ol>
            </div>
            <div class="sidebar-module">
                <h4>链接</h4>
                <ol class="list-unstyled">
                    <li><a href="https://github.com/jiaxinyang1">GitHub</a></li>
                    <li><a href="#">Twitter</a></li>
                    <li><a href="#">Facebook</a></li>
                </ol>
            </div>
        </div><!-- /.blog-sidebar -->

    </div> <!-- /container -->

    <div class="page-header"></div>
    <footer  style="text-align: center;padding-bottom: 20px;" >
        <a style="font-size: 16px">此生无悔入东方，来世愿生幻想乡</a>
    </footer>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script type="text/javascript" src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script>

</script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

</body>
</html>

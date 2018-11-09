<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>添加内容</title>
</head>
<body>
<div >
    <form  role="form" action="/AddContent"  method="post">
        <div class="input-group">
            <label>标题</label>
            <input type="text" name="title" class="form-control" placeholder="请输入标题">
        </div>
        <br>
        <div class="input-group">
            <label>描述</label>
            <input type="text" name="description" class="form-control" placeholder="请输入...">
        </div>
        <br>
        <div class="input-group" style="width: 100%">
            <label >文章</label>
            <br>
            <textarea name="content" class="form-control" rows="5" style="width: 100%"></textarea>
        </div>
        <br>
        <div class="input-group">
            <label>分类</label>
            <input type="text" name="classification" class="form-control" placeholder="请输入...">
        </div>
        <div class="form-group" style="margin-top: 30px">
            <button type="submit" class="btn btn-default">提交</button>
        </div>
    </form>
</div>
</body>
</html>
<%@ page pageEncoding="utf-8" language="java" contentType="text/html; utf-8" %>
<html>
<head>
  <script language="JavaScript" type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
  <script language="JavaScript" type="text/javascript">
      $(function(){  // 网页加载事件
          // 点击事件
        $("#but1").click(function(){
           //发送请求获取数据
            $.ajax({
                type: "post",  //请求方式
                url: "getStudentData",  //控制请求地址
                //data: "name=John&location=Boston", 客户端组控制器传递的数据
                success: function(data){  //回调函数
                  //console.log(data);
                    // 使用js动态操作dom
                   var table="<table border=1><tr><td>学号</td><td>姓名</td><td>性别</td><td>地址</td><td>生日</td></tr>";
                    for(var i=0;i<data.length;i++){
                        table=table+"<tr><td>"+data[i].xh+"</td><td>"+data[i].name+"</td><td>"+data[i].sex+"</td><td>"+data[i].address+"</td><td>"+data[i].birthday+"</td></tr>";
                    }
                   table=table+"</table>";
                   $("#showStudent").html(table);
                }
            });
        });
      });
  </script>
</head>
<body>
  显示所有的学生信息
 <button id="but1" type="button" name="button" value="显示学生">显示学生</button>
 <div id="showStudent"></div>
</body>
</html>

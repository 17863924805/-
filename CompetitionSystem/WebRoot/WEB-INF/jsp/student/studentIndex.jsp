<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生个人中心-学科竞赛</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Tpye" content="text/html;charset=utf-8">
	<!--样式文件引用-->
	<link href="<%=path%>/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="<%=path%>/css/studentIndex.css" />
	<!--JavaScript插件都是依赖与jQuery库-->
	<script type="text/javascript" src="<%=path%>/js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="<%=path%>/bootstrap/dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/studentIndex.js" ></script>
  </head>
  
  <body>
     <div>
		<div class="head">
				<div class="head-right">
					<a href="#">退出</a>
					<a href="#" id="helloUser">林欢雯，欢迎您</a>
				</div>
			</div>
			<div class="row rowadd">
				<div class="col-md-2 left-part">
					<div class="panel panel-default">
						<!-- Default panel contents -->
						<div class="panel-heading"><i class="glyphicon glyphicon-home"></i>个人中心</div>
						<!-- List group -->
						<ul class="list-group list-g">
							<li class="list-group-item">概况</li>
							<li class="list-group-item">竞赛管理</li>
							<li class="list-group-item">我的消息</li>
							<li class="list-group-item">获奖情况</li>
							<li class="list-group-item">我的信息</li>
							<li class="list-group-item">下载中心</li>
							<li class="list-group-item"></li>
						</ul>
					</div>
				</div>
				<div class="col-md-10 right-part">
				  <jsp:include page="test.jsp"></jsp:include>
				  <%--  <jsp:include page="studentBrief.jsp"></jsp:include> --%>
				   <!-- <iframe src="studentBrief.html" height="700px" width="100%" scrolling="no" frameborder="no"> -->
				   <!-- <iframe src="studentComManage.html" height="700px" width="100%" scrolling="no" frameborder="no">-->
				   	 <!--<iframe src="studentMessage.html" height="700px" width="100%" scrolling="no" frameborder="no">-->
				   	 	<!--<iframe src="studentAward.html" height="700px" width="100%" scrolling="no" frameborder="no">-->
				   	 <!--<iframe src="studentInfo.html" height="700px" width="100%" scrolling="no" frameborder="no">-->
				   	 	<!-- <iframe src="studentDownload.html" height="700px" width="100%" scrolling="no" frameborder="no"> -->
				</div>
			</div>
		</div>
  </body>
</html>

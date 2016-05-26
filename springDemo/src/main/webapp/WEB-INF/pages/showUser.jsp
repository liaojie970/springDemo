<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../../Resource/jQuery/jquery-1.8.3.min.js" type=text/javascript></script>
<title>显示用户</title>
</head>
<body>
	姓名:${user.name }
	<script type="text/javascript">
		$(function($) {
			$.ajax({
				type : "POST",
				url : "../getUserJson.do",
				success : function(msg) {
					$('body').append(msg);
				}
			});
		});
	</script>
</body>
</html>
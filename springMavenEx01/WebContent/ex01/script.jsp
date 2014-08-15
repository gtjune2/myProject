<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript">
function chkForm(pForm) {
//	alert(pForm);

}
</script>
</head>
<body>
	<form action="post" action="script.jsp">
		아이디 : <input type="text" name="txtId" id="txtId"><br>
		비밀번호 : <input type="password" name="txtPwd" id="txtPwd"><br>
		<input type="button" value="로그인" onclick="chkForm(this.form)">
		<div id="dvMessage">
		
		</div>
	</form>
</body>
</html>
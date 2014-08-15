<%@page import="member.CheerLeader"%>
<%@page import="member.Player"%>
<%@page import="member.MemberService"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<select>
	<option></option>
<%
ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
MemberService memberService = (MemberService)appContext.getBean("memberPlayer");

memberService.setIMember(new Player("김동주", 18));
//System.out.println(memberService.getIMember().GetMember());
%>
	<option><%=memberService.getIMember().GetMember() %></option>
<%
memberService = (MemberService)appContext.getBean("memberCheerLeader");

memberService.setIMember(new CheerLeader("박기량", "롯데", 18));
%>
	<option><%=memberService.getIMember().GetMember() %></option>
</select>
</body>
</html>
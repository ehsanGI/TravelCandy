<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script src="/js/andular.jsp" > </script>
	<title>Insert title here</title>
</head>
<body>

	
	<s:url id="welcomePL" namespace="/" action="hello" >
      <s:param name="request_locale" >pl</s:param>
   </s:url>
   <s:url id="welcomeEN" namespace="/" action="hello" >
      <s:param name="request_locale" >en</s:param>
   </s:url>
   
   <s:a href="%{welcomeEN}" >English</s:a>
   <s:a href="%{welcomePL}" >Polish</s:a>


	<h1>
		<s:property value="getText('hello')" />
	</h1>
	
	
	
	
	
</body>
</html>
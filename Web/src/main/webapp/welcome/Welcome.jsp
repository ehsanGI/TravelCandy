<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<s:include value="/global/GlobalImports.jsp"></s:include>
	
	<script src="welcome/js/welcome.js" > </script>
	<link type="text/css" rel="stylesheet" href="welcome/css/welcome.css" />
	<title>Insert title here</title>
</head>
<body>


	<section id="iLanguages">
		<s:url id="welcomePL" namespace="/" action="hello">
			<s:param name="request_locale">pl</s:param>
		</s:url>
		<s:url id="welcomeEN" namespace="/" action="hello">
			<s:param name="request_locale">en</s:param>
		</s:url>

		<s:a href="%{welcomeEN}">English</s:a>
		<s:a href="%{welcomePL}">Polish</s:a>
		
	</section>


	<h1>
		<s:property value="getText('welcome')" />
	</h1>
	
	<section id="iMenu">
		<s:include value="/global/GlobalMenu.jsp"></s:include>
	</section>
	
	
	
</body>
</html>
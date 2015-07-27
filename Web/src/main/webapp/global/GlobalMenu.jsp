<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script src="/js/andular.jsp" > </script>
	<title>Insert title here</title>
</head>
<body>

	
	<%-- <s:url id="welcomePL" namespace="/" action="hello" >
      <s:param name="request_locale" >pl</s:param>
   </s:url>
   <s:url id="welcomeEN" namespace="/" action="hello" >
      <s:param name="request_locale" >en</s:param>
   </s:url> --%>


	<section id="iGlobalMenu">
	
		<ul>
				<s:iterator value="globalMenuItems">
					<li>
						<a href="<s:property value="url"/>">
							<s:property value="name"/>
						</a> 
					</li>
				</s:iterator>
		</ul>
		
	</section>




</body>
</html>
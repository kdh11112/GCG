<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
	<!-- 해당 ${serverTime}이라는 것은 아까 controller에서 처리 결과를 속성값을 추가하여 보냄으로써 반아온 값 el로 표기 -->
</body>
</html>

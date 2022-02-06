<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Main</title>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
</head>
<body>
	<%@ include file="/WEB-INF/include/include-gnb.jspf" %>
	
	<div id="body">
		<div id="searchMenu" class="leftBox">
			<div id="serchBox" class="leftBox">
				<p class="margin0">위도 <input type="text" id="lat" value="37.46345162276179" style="width:150px; height:20px;">
				<p class="margin0">경도 <input type="text" id="lng" value="126.90732784503186" style="width:150px; geight:20px;">
				<input type="hidden" value="${nodeid }" id="nodeidVal">
				<input type="hidden" value="${nodename }" id="nodenameVal">
				<input type="hidden" value="${lat }" id="latVal">
				<input type="hidden" value="${lng }" id="lngVal">
				<a href="#this" id="sc_btn" class="btn">길찾기</a>
			</div>
		</div>
		<div id="resultBox" class="leftBox">
		</div>
		
		<div id="bodyBox">
			<div id="mapBox" class="mapBox">
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/include/include-body.jspf" %>
	<script src="<c:url value='/js/kakaoAPI/map.js'/>" charset="utf-8"></script>
	
	<script type="text/javascript">$("#node_find").addClass("selected");</script>
	
	<script type="text/javascript">
		$("#node_info").addClass("selected");

		fn_clickSetting();
	</script>
</body>
</html>
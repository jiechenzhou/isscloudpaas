<%@ include file="/WEB-INF/pages/include.jsp" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<youi:html>
	<head>
		<title>错误提示页面</title>
		<%@ include file="/WEB-INF/pages/common/commonScriptAndCss.jsp"%>
	</head>
	<body>
		<youi:panel styleClass="col-sm-offset-2 col-sm-8" caption="错误信息" column="12">
			${errorCode} : ${errorInfo}
		</youi:panel>
	</body>
</youi:html>

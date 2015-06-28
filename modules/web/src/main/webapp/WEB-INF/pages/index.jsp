<%@ include file="/WEB-INF/pages/include.jsp" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<youi:html i18n="i18n.index" title="i18n.index.title">
	<head>
		<%@ include file="/WEB-INF/pages/common/commonScriptAndCss_debug.jsp"%>
		<%response.setHeader("Cache-Control","no-cache, no-store"); %>
	</head>
	
	<youi:body decorator="youi">
		
	</youi:body>
	
	<script type="text/javascript">
		$(function(){
			//加载欢迎页面
			open_welcome_page();
			
			//
			//10秒钟刷新一次
			//$.youi.noticeIntervals = window.setInterval(showUserNoticeStatus,1000*10);
			//
		});
		/**
		 * 打开首页
		 */
		function open_welcome_page(){
			$('body',document).bootstrapLayout('loadPage','000000','welcome.html','首页&nbsp;&nbsp;');
		}
		/**
		 * 打开密码修改框
		 */
		function open_header_modify_password(){
			//$('body',document).borderLayout('loadPage','000001','modifyPassword.html','修改密码');
		}
		
	</script>
</youi:html>
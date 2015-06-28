<%@ include file="/WEB-INF/pages/include.jsp"%>

<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<youi:script src="/scripts/3.0/lib/highcharts.js"/>
<youi:script src="/scripts/3.0/lib/highcharts-more.js"/>
<youi:page pageId="000000">
	<!-- 页面描述：欢迎页面-->
	<!--**********************************子页面**********************************-->

	<!--**********************************子页面**********************************-->
	<youi:ajaxUrl name="addUser" src="/esb001/addUser.json"></youi:ajaxUrl>
	<youi:ajaxUrl name="removeUser" src="/esb001/removeUser.json"></youi:ajaxUrl>
	
	<!-- 放在页面开始处，最先执行，根据实际情况调整-->
	<youi:func name="init" urls="addUser,removeUser">

		$('#container').highcharts({
	        title: {
	            text: '月平均',
	            x: -20 //center
	        },
	        subtitle: {
	            text: 'Source: WorldClimate.com',
	            x: -20
	        },
	        xAxis: {
	            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
	                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
	        },
	        yAxis: {
	            title: {
	                text: 'Temperature (°C)'
	            },
	            plotLines: [{
	                value: 0,
	                width: 1,
	                color: '#808080'
	            }]
	        },
	        tooltip: {
	            valueSuffix: '°C'
	        },
	        legend: {
	            layout: 'vertical',
	            align: 'right',
	            verticalAlign: 'middle',
	            borderWidth: 0
	        },
	        series: [{
	            name: 'Tokyo',
	            data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
	        }, {
	            name: 'New York',
	            data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]
	        }, {
	            name: 'Berlin',
	            data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]
	        }, {
	            name: 'London',
	            data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
	        }]
	    });


$('#container_polar').highcharts({

        chart: {
            polar: true
        },

        title: {
            text: ''
        },

        pane: {
            startAngle: 0,
            endAngle: 360
        },

        xAxis: {
            tickInterval: 45,
            min: 0,
            max: 360,
            labels: {
                formatter: function () {
                    return this.value + '°';
                }
            }
        },

        yAxis: {
            min: 0
        },

        plotOptions: {
            series: {
                pointStart: 0,
                pointInterval: 45
            },
            column: {
                pointPadding: 0,
                groupPadding: 0
            }
        },

        series: [{
            type: 'column',
            name: 'Column',
            data: [8, 7, 6, 5, 4, 3, 2, 1],
            pointPlacement: 'between'
        }, {
            type: 'line',
            name: 'Line',
            data: [1, 2, 3, 4, 5, 6, 7, 8]
        }, {
            type: 'area',
            name: 'Area',
            data: [1, 8, 2, 7, 3, 6, 4, 5]
        }]
    });
	</youi:func>
	
	<style>
	
		.pan{
			color:red;
			border:1px solid silver;
			padding:3px;
			margin:3px;
			border-radius:10px;
		}
		
		.c1 .pan{
			font-size:17px;
		}
		
		.c2 .pan{
			font-size:15px;
		}
	</style>
		
	<div id="page_index_container">
		<youi:panel column="12" height="485" caption="表单">
			<youi:form id="form_test" caption="" panel="false" action="/local/upload/uploadFile111.json">
				<youi:fieldLayout columns="1">
					<youi:fieldSwfupload notNull="true" property="swfupload" caption="附件" height="200" buttonWidth="73" buttonHeight="30"></youi:fieldSwfupload>
					<youi:fieldUpload property="uploads" caption="影像"  height="200"></youi:fieldUpload>
				</youi:fieldLayout>
			</youi:form>
		</youi:panel>
		<youi:panel  caption="快捷访问" column="6" height="611" >
			<a href="decorators/esb/images/sso.jpg" target="_blank">单点登录介绍</a>
			
			<div id="container"></div>
		</youi:panel>
		
		<youi:panel caption="我的消息" column="6" height="150">
			<div id="container_plot"></div>
		</youi:panel>
		
		<youi:panel caption="我的申请" column="6" height="440">
			<div id="container_polar"></div>
		</youi:panel>
	</div>
	
	<!-- 监听通知变化 -->
	<youi:func name="noticereceiver_notice_afterReceive" params="active">
		//alert(active);
	</youi:func>
	
	<youi:func name="grid_user_change" params="record">
		//alert(record.loginName);
	</youi:func>
	
	<youi:func name="grid_user_beforeSubmit">
		return true;
	</youi:func>
</youi:page>
<%@ include file="/WEB-INF/pages/include.jsp" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<youi:page>
	<!-- 页面描述： -->
	<!--**********************************子页面**********************************-->
	<youi:subpage caption=" " id="subpage_task1" subpageId="task001" 
		formAction="flow/taskcomplete/{taskId}.json" formSubmit="提 交"
		src="flow/taskform/{taskId}.html" height="400">
		<youi:button name="close" caption="关闭" order="200"/>
	</youi:subpage>
	<!--**********************************子页面**********************************-->
	
	<!--**********************************页面内容********************************-->
	<youi:grid id="form_task" caption="任务列表" idKeys="processDefinitionId,id" 
		src="/workflow/run/getPagerTasks.json"  panel="false"
		reset="NOT" submit="NOT" add="NOT" edit="NOT" remove="NOT">
		
		<youi:gridCol property="id" caption="任务ID"/>
		<youi:gridCol width="200" property="name" caption="任务名称"/>
		<youi:gridCol width="200" property="createTime" type="date" format="millis" textFormat="yyyy-MM-dd HH:mm:ss" caption="创建时间"/>
		<youi:gridCol property="formKey" caption="表单"></youi:gridCol>
		<youi:gridCol property="assignee" caption="操作人"/>
		<youi:button name="completeTask" caption="执行任务" active="1"/>
	</youi:grid>
	<!-- 完成任务窗口 -->
	<youi:form id="form_completeTask" dialog="true" action="/workflow/run/completeTask.json">
		<youi:fieldLayout>
			<youi:fieldHidden property="taskId"/>
		</youi:fieldLayout>
	</youi:form>
	<!--**********************************页面内容********************************-->
	
	<!--**********************************页面函数********************************-->
	<youi:func name="func_grid_completeTask">
		var gridElement = $elem('form_task',pageId),
			subpageElem = $elem('subpage_task1',pageId);
		var selectedRecord = gridElement.grid('getSelectedRecord');
		if(selectedRecord.formKey){//打开表单
			//open task form
			subpageElem.subpage('open',selectedRecord,selectedRecord.formKey,{taskId:selectedRecord.id});
		}else{//通过任务
			var formCompleteTask = $elem('form_completeTask',pageId);
			formCompleteTask.form('fillRecord',{taskId:selectedRecord.id}).form('submit');
		}
	</youi:func>
	<!--  -->
	<youi:func name="form_completeTask_afterSubmit">
		var gridElement = $elem('form_task',pageId);
		gridElement.grid('pReload');
	</youi:func>
	<!--  -->
	<youi:func name="subpage_task1_afterSubmit">
		var gridElement = $elem('form_task',pageId),
			subpageElem = $elem('subpage_task1',pageId);
		gridElement.grid('pReload');
		subpageElem.subpage('close');
	</youi:func>
	<!--**********************************页面函数********************************-->
</youi:page>
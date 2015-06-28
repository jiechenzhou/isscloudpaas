<%@ include file="/WEB-INF/pages/include.jsp" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<youi:page>
	<!-- 页面描述： -->
	<!--**********************************子页面**********************************-->
	<youi:subpage caption="流程设计" subpageId="flow_design"
		 type="window" src="/page/workflow.flow/design.html">
	</youi:subpage>
	<!--**********************************子页面**********************************-->
	
	<!--**********************************页面内容********************************-->
	<!-- grid-流程列表-->
	<youi:grid id="grid_flow" idKeys="flowId" dataFormId="form_flow"  caption="流程列表" 
				src="/local/workflow/flow/getPagerFlows.json" 
				editSrc="/local/workflow/flow/getFlow.json" panel="false"
				removeSrc="/local/workflow/flow/removeFlow.json">
		<youi:fieldLayout>
			<youi:fieldText property="flowCaption"  caption="流程描述"></youi:fieldText>
			<youi:fieldText property="status"  caption="流程状态"></youi:fieldText>
		</youi:fieldLayout>
		
		<youi:gridCol width="300" property="flowCaption"  caption="流程描述"/>
		<youi:gridCol width="180" property="flowName"  caption="流程定义"/>
		<youi:gridCol property="status"  caption="部署状态"/>
		<youi:gridCol width="160" property="deployTime"  caption="部署时间"/>
		<youi:gridCol property="deployId"  caption="部署 "/>
		<youi:gridCol width="160" property="version"  caption="版本号"/>
		
		<youi:button name="upload" caption="上传" active="1" order="201"/>
		<youi:button name="design" caption="设计" active="1" order="201"/>
		<youi:button name="deploy" caption="部署"  order="202" active="1"/>
	</youi:grid>
	
	<!-- form-流程编辑 -->
	<youi:form dialog="true" caption="流程" id="form_flow" idKeys="flowName"
		 action="/local/workflow/flow/saveFlow.json">
		<youi:fieldLayout prefix="record" columns="1">
			<youi:fieldHidden property="flowId"  caption="流程ID"/>
			<youi:fieldHidden property="deployTime"  caption="部署时间"/>
			<youi:fieldHidden property="status"  caption="流程状态"/>
			
			<youi:fieldText width="602" notNull="true" property="flowName"  caption="流程名"/>
			<youi:fieldText width="602" notNull="true" property="flowCaption"  caption="流程描述"/>
			
			<youi:fieldText width="602" property="businessService"  caption="业务服务"/>
		</youi:fieldLayout>
		<br/>
	</youi:form>
	<!--  -->
	<youi:form dialog="true" id="form_upload" caption="流程上传" action="/local/workflow/flowdes/uploadFlow.json">
		<youi:fieldLayout prefix="upload" columns="1">
			<youi:fieldHidden property="flowId"  caption="流程ID"/>
			<youi:fieldLabel width="602" property="flowCaption"  caption="流程描述"/>
			<youi:fieldFile width="602" property="contentFile" caption="流程文件"/>
		</youi:fieldLayout>
	</youi:form>
	
	<!-- form_flow_deploy流程部署 -->
	<youi:form dialog="true" id="form_flow_deploy" caption="流程部署"  confirmMessage="确认部署?"
		action="/local/workflow/flow/deploy.json">
		<youi:fieldLayout prefix="deploy" columns="1">
			<youi:fieldHidden property="flowId"  caption="流程ID"/>
			<youi:fieldText notNull="true" width="602"  property="flowCaption"  caption="流程描述"/>
			<youi:fieldSelect width="602" defaultValue="1" notNull="true" property="deployType" caption="部署类型">
				<youi:fieldOption value="0" caption="全部部署"></youi:fieldOption>
				<youi:fieldOption value="1" caption="仅部署流程"></youi:fieldOption>
				<youi:fieldOption value="2" caption="仅部署表单"></youi:fieldOption>
			</youi:fieldSelect>
		</youi:fieldLayout>
		
		<youi:button name="customSubmit" caption="提交数据"></youi:button>
	</youi:form>
	
	<!--**********************************页面内容********************************-->
	
	<!--**********************************页面函数********************************-->
	<!-- 流程文件上传 -->
	<youi:func name="func_grid_upload">
		var gridElement = $elem('grid_flow',pageId),
			selectedRecord = gridElement.grid('getSelectedRecord');
		
		$elem('form_upload',pageId).form('reset').form('fillRecord',selectedRecord).form('open');
	</youi:func>
	<!-- 打开设计器 -->
	<youi:func name="func_grid_design">
		var subpageElement = $elem('subpage_flow_design',pageId),
			gridElement = $elem('grid_flow',pageId),
			selectedRecord = gridElement.grid('getSelectedRecord');	
			subpageElement.subpage('open',selectedRecord);
	</youi:func>
	
	<!-- 流程部署 -->
	<youi:func name="func_grid_deploy">
		var formElement = $elem('form_flow_deploy',pageId),
			gridElement = $elem('grid_flow',pageId),
			selectedRecord = gridElement.grid('getSelectedRecord');
		formElement.form('fillRecord',selectedRecord).form('open');
	</youi:func>
	
	<youi:func name="form_upload_afterSubmit" params="result">
		$elem('form_upload',pageId).form('close');
		$elem('grid_flow',pageId).grid('refresh');
	</youi:func>
	
	<youi:func name="func_form_customSubmit">
		var formElem = $elem('form_flow_deploy',pageId);
		$elem('form_flow_deploy',pageId).form('submitAction','aa.json',null,true,'');
	</youi:func>
	
	<!--**********************************页面函数********************************-->
</youi:page>
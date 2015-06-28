<%@ include file="/WEB-INF/pages/include.jsp" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<youi:html title="工作流设计器">
	<head>
		<%@ include file="/WEB-INF/pages/common/commonScriptAndCss.jsp"%>
		
		<youi:script src="/scripts/3.0/youi/youi.flow.js"/>
		<youi:script src="/scripts/3.0/youi/youi.workflow.js"/>
		<youi:script src="/scripts/3.0/youi/youi.wfdesigner.js"/>
		
		<style>
			body{
				padding:0px;margin:0px;
			}
			#youi_log{
				height:300px;
				overflow-y:auto;
				overflow-x:hidden;
			}
			
			.xml-line{
				color:#3F7F7F;
			}
			.attr-key{
				color:#7F007F;
			}
			
			.attr-value{
				color:blue;
			}
			
			.youi-tabs .tabs-panel{
				position:relative;
			}
			
			.youi-dialog-container{
				z-index:99;
			}
		</style>
	</head>
	
	<body>
		<%
			//TODO 移植到后台
			request.setAttribute("flowId",request.getParameter("flowId"));
		%>
		
		<youi:convert name="jobStauts"></youi:convert>
		
		<youi:form styleClass="designer_bind_form" id="form_flow" reset="NOT" submit="NOT" caption="工作流设计器"
			action="/workflow/flowdes/saveFlowXml.json">
			<youi:fieldLayout columns="2">
				<youi:fieldHidden property="flowId"/>
				<youi:fieldLabel width="200" property="flowName" caption="流程名"/>
				<youi:fieldLabel width="400" property="flowCaption" caption="流程描述"/>
				<youi:fieldHidden property="flowContent"></youi:fieldHidden>
			</youi:fieldLayout>
		</youi:form>	
		
		<div id="designer">
			<youi:table columns="3">
				<youi:cell width="200">
					<div style="width:200px;overflow-x:hidden;">
						<youi:tree id="tree_element" width="1000">
							<ul>
								<li id="tree_element_root" class="treeNode root">
									<span class=""><a class="">流程元素</a></span>
									<ul></ul>
								</li>
							</ul>
						</youi:tree>
					</div>
				</youi:cell>
				<youi:cell>
					<div id="designer_toolbar"></div>
					<youi:tabs id="tabs_flow_editor" itemHeight="450">
						<youi:tabItem caption="设计" id="designer">
							<youi:workflow processKey="${flowId}" loadSrc="/workflow/flowdes/getFlowHtml.json"/>
						</youi:tabItem>
						<youi:tabItem caption="activiti xml" id="activitiXml">
							<div id="xeditor_flow"></div>
						</youi:tabItem>
						
						<youi:tabItem caption="关联表单" id="showForms">
							<youi:grid id="grid_flow_form" caption="" panel="false" idKeys="findPath" usePager="false"
								src="/workflow/flowdes/getFlowForms.json" load="false"
								reset="NOT" submit="NOT" add="NOT" remove="NOT" edit="NOT">
								<youi:fieldLayout>
									<youi:fieldHidden property="flowId"></youi:fieldHidden>
								</youi:fieldLayout>
								<youi:gridCol width="400" property="findPath" caption="表单路径"/>
								<youi:gridCol width="140" property="formCode" caption="表单名"/>
								<youi:gridCol width="260" property="formCaption" caption="表单描述"/>
								<youi:gridCol width="80" type="link" 
									property="openFormEditor" caption=" " defaultValue="编辑"/>
							</youi:grid>
						</youi:tabItem>
					</youi:tabs>
				</youi:cell>
				<youi:cell width="200">
					<div id="designer_propertyTable"></div>
				</youi:cell>
			</youi:table>
		</div>
		
		<!-- 候选角色 -->
		<youi:form id="form_candidateGroups" dialog="true" reset="NOT" submit="确认" 
			caption="候选角色" zIndex="1001">
			<youi:fieldLayout prefix="candidateGroups" columns="1" labelWidths="1">
				<youi:fieldTree property="code" 
					caption="" rootText="候选角色" popup="false" simple="false" check="true" src="/fuc/role/getRoles.json" show="roleCaption"  code="roleId"/>
			</youi:fieldLayout>
		</youi:form>
		
		<youi:form id="form_expression" dialog="true" reset="NOT" submit="确认" 
			caption="表达式" zIndex="1002">
			<youi:fieldLayout prefix="expression" columns="1">
				<youi:fieldText property="code" caption="表达式" escapeSpecial="true" width="500"></youi:fieldText>
			</youi:fieldLayout>
		</youi:form>
		
		<!-- form属性 -->
		<youi:form id="form_formProperties" dialog="true" reset="NOT" submit="确认" caption="表单属性">
			<youi:fieldLayout prefix="formProperties" columns="1">
				<youi:fieldHidden property="nodeId" caption="节点ID"/>
				<youi:fieldLabel property="caption" caption="节点名称"/>
			</youi:fieldLayout>
			<div style="position:relative;height:350px;">
				<youi:fieldLayout prefix="formProperties" columns="1" labelWidths="0">
					<youi:fieldGrid property="formProperties" mode="reload" caption=""  width="795">
						<youi:grid id="grid_formProperties" panel="false"
							add="NOT" edit="NOT" remove="NOT"
							reset="NOT" submit="NOT" editable="true" 
							load="false">
							<youi:gridCol editor="fieldText" width="200" property="name" caption="属性名"/>
							<youi:gridCol editor="fieldText" width="200" property="value" caption="属性表达式"/>
						</youi:grid>
					</youi:fieldGrid>
				</youi:fieldLayout>
			</div>
			<br/>
		</youi:form>
		
		
		<script type="text/javascript">
			$(function(){
				$.youi.log.logLevel = 4;
				
				var converts = {};
				$.extend(
					$.youi.serverConfig.convertArray,{
						'candidateUsers':$.youi.serverConfig.convertArray['jobStauts'],
						'component_orderBy':{'asc':'正序','desc':'逆序'}
					},converts
				);
				
				$('#designer').wfdesigner({
					formId:'form_flow',
					elementTreeId:'tree_element'
				});
			});
			
			//$('#xeditor_flow').xeditor({
			//	readonly:true
			//});
		</script>
		<youi:func name="grid_flow_form_link_openFormEditor" params="rowId">
			//flow:2c9dc6043c413a7b013c413c36b10001/startEvent:startevent1
			if(rowId){
				var nodeId = rowId.split(':')[2];
				$('#designer').workflowDesigner('openUserTaskForm',nodeId);
			}
		</youi:func>
		
		<youi:func name="tabs_flow_editor_beforeSelect" params="tabId">
			if($('#'+tabId).is('.active')){
				return false;
			}
			
			var activeToolsbar = false;
			if('activitiXml'==tabId){//查看activitiXml
				$('#designer').workflowDesigner('save',function(xml){
					var params = 'flowContent='+encodeURIComponent(xml)+'&flowName='+$('#field_flowName').fieldValue();
					$('#xeditor_flow').xeditor('loadXml','/workflow/flowdes/getFlowActivitiXml.json',params);
				});
			}else if('showForms'==tabId){
				$('#grid_flow_form').grid('refresh');
			}else{
				activeToolsbar = true;
			}
			if(activeToolsbar){
				$('#designer_toolbar').find('.toolbar-item').removeClass('disabled');
			}else{
				$('#designer_toolbar').find('.toolbar-item').addClass('disabled');
			}
			return true;
		</youi:func>
	</body>
</youi:html>
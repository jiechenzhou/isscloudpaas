<%@ include file="/WEB-INF/pages/include.jsp" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<youi:html title="表单设计器">
	<head>
		<%@ include file="/WEB-INF/pages/common/commonScriptAndCss_debug.jsp"%>
		
		<script src="<%=request.getContextPath()%>/scripts/lib/jquery.mousewheel.js" type="text/javascript"></script>
		
		<script src="<%=request.getContextPath()%>/scripts/youi/youi.toolbar.js" type="text/javascript"></script>
		<script src="<%=request.getContextPath()%>/scripts/youi/youi.formDesigner.js" type="text/javascript"></script>
		<script src="<%=request.getContextPath()%>/scripts/youi/youi.pageEditor.js" type="text/javascript"></script>
		<script src="<%=request.getContextPath()%>/scripts/youi/youi.snippet.js" type="text/javascript"></script>
		<script src="<%=request.getContextPath()%>/scripts/youi/youi.propertyTable.js" type="text/javascript"></script>
		<script src="<%=request.getContextPath()%>/scripts/youi/youi.accordion.js" type="text/javascript"></script>
	
		<youi:style href="/styles/youi.toolbar.css"/>
		<youi:style href="/styles/youi.accordion.css"/>
		<youi:style href="/styles/youi.propertyTable.css"/>
		<youi:style href="/styles/youi.snippet.css"/>
		<youi:style href="/styles/youi.pageEditor.css"/>
		<youi:style href="/styles/youi.formDesigner.css"/>
		
		<style>
			body{
				margin:0;
				padding:0;
			}
			#youi_log{
				height:300px;
				overflow-y:auto;
				overflow-x:hidden;
			}
			
		</style>
	</head>
	
	<body>
		<%
			request.setAttribute("mySrc","aa.json?c=1");
		%>
		
		
		<youi:panel id="panel_formDesigner" caption="流程表单设计">
			<youi:fieldLayout>
				<youi:fieldLabel property="formCaption" caption="表单描述"/>
			</youi:fieldLayout>
			
			<div id="formDesigner" class="youi-formDesigner">
				<div id="formDesigner_toolbar"></div>
				<table cellspacing="0" width="100%">
					<tr>
						<td valign="top" class="layout-td panel-west">
							<div id="formDesigner_accordion" class="youi-accordion " style="width:200px;">
								<div >
									<h3 class="youi-accordion-header youi-widget-header"><span class="youi-icon youi-icon-triangle"></span><a class="accordion-a" href="#">页面结构</a></h3>
									<div class="youi-accordion-content youi-widget-content">
										<div id="formDesigner_tree_widgets"></div>
									</div>
								</div>
								<div >
									<h3 class="youi-accordion-header youi-widget-header"><span class="youi-icon youi-icon-triangle"></span><a class="accordion-a" href="#">布局组件</a></h3>
									<div class="youi-accordion-content youi-widget-content">
										<div id="formDesigner_snippet_layout">
											<div id="div" class="snippet-item"><span class="snippet-item-span">div</span></div>
											<div id="table" class="snippet-item"><span class="snippet-item-span">table</span></div>
										</div>
									</div>
								</div>
								<div >
									<h3 class="youi-accordion-header youi-widget-header"><span class="youi-icon youi-icon-triangle"></span><a class="accordion-a" href="#">页面组件</a></h3>
									<div class="youi-accordion-content youi-widget-content">
										<div id="formDesigner_snippet_component">
											<div id="grid" class="snippet-item"><span class="snippet-item-span">grid组件</span></div>
											<div id="form" class="snippet-item"><span class="snippet-item-span">form组件</span></div>
											<div id="panel" class="snippet-item"><span class="snippet-item-span">panel组件</span></div>
											<div id="tree" class="snippet-item"><span class="snippet-item-span">tree组件</span></div>
											<div id="tab" class="snippet-item"><span class="snippet-item-span">tab组件</span></div>
											<div id="accordion" class="snippet-item"><span class="snippet-item-span">accordion组件</span></div>
											<div id="fieldLayout" class="snippet-item"><span class="snippet-item-span">表单布局组件</span></div>
											<div id="buttons" class="snippet-item"><span class="snippet-item-span">按钮容器</span></div>
											<div id="button" class="snippet-item"><span class="snippet-item-span">按钮</span></div>
										</div>
									</div>
								</div>
								<div >
									<h3 class="youi-accordion-header youi-widget-header"><span class="youi-icon youi-icon-triangle"></span><a class="accordion-a" href="#">表单组件</a></h3>
									<div class="youi-accordion-content youi-widget-content">
										<div id="formDesigner_snippet_field">
											<div id="fieldText" class="snippet-item"><span class="snippet-item-span">文本框</span></div>
											<div id="fieldArea" class="snippet-item"><span class="snippet-item-span">文本域</span></div>
											<div id="fieldSelect" class="snippet-item"><span class="snippet-item-span">下拉框</span></div>
											<div id="fieldPassword" class="snippet-item"><span class="snippet-item-span">密码框</span></div>
											<div id="fieldCalendar" class="snippet-item"><span class="snippet-item-span">日历</span></div>
											<div id="fieldCheckboxGroup" class="snippet-item"><span class="snippet-item-span">复选框组</span></div>
											<div id="fieldRadioGroup" class="snippet-item"><span class="snippet-item-span">单选框组</span></div>
											<div id="fieldTree" class="snippet-item"><span class="snippet-item-span">表单树</span></div>
										</div>
									</div>
								</div>
								
								<div >
									<h3 class="youi-accordion-header youi-widget-header"><span class="youi-icon youi-icon-triangle"></span><a class="accordion-a" href="#">流程模型</a></h3>
									<div class="youi-accordion-content youi-widget-content">
										<youi:tree id="tree_busModel" dataFormId="form_agency"
										hideRoot="false" rootText="流程模型"
										iteratorSrc="${mySrc}" 
										iteratorParam="agencyId"
										idAttr="agencyId" 
										textAttr="agencyCaption" 
										pidAttr="parentAgencyId"
										
										dragable="true"
										dropStyle="fieldDrop" />
									</div>
								</div>
							</div>
						</td>
						<td valign="top" class="layout-td panel-center">
							<div id="formDesigner_pageEditor">
								<div class="drop-marker"></div>
							</div>
						</td>
						<td valign="top" class="layout-td panel-east" width="240px">
							<div id="formDesigner_propertyTable">
								
							</div>
						</td>
					</tr>
				</table>
				
			</div>
		</youi:panel>
		<!-- 表单保存 -->
		<youi:form dialog="true" action="/des/form/saveForm.json" reset="NOT" submit="保存" id="formDesigner_save" caption="保存表单">
			<youi:fieldLayout columns="1">
				<youi:fieldHidden property="formId" caption="formId"/>
				<youi:fieldText  property="formCaption" caption="表单描述" width="498"/>
				<youi:fieldArea caption="表单xml" readonly="true" width="500"  rows="15" property="content"/>
			</youi:fieldLayout>
		</youi:form>
		<!-- 表单函数编辑 -->
		<youi:form dialog="true" reset="NOT" submit="保存" id="formDesigner_funcs" caption="页面函数">
			<div class="container_funcs" style="height:400px;overflow-y:auto;">
				
			</div>
		</youi:form>
		
		<script type="text/javascript">
			$(function(){
				
				var height = $(window).height() - 39-$('#formDesigner').offset().top;
				var booleanConvert = {'true':'是','false':'否'};
				$('#formDesigner').formDesigner({
					height:height,
					converts:{
						'field_notVisible':booleanConvert,
						'field_readonly':booleanConvert,
						'field_notNull':booleanConvert
					},
					propertyGroupDescs:${propertyGroupDescs}
				});
			});
			
		</script>
		
		<youi:func name="formDesigner_save_afterSubmit" params="result">
			$.youi.messageUtils.showMessage('保存成功！');
			$('#formDesigner_save').form('fillRecord',result.record).form('close');
		</youi:func>
		
		<youi:func name="func_tree_busModel_stop" params="event,ui">
			if(ui.dropNode){
				//
				var formDesigner = $('#formDesigner');
				formDesigner.formDesigner('addFieldElem',
						ui.dropNode,'fieldText',null,{caption:ui.dragNode.find('>span>a').text(),property:ui.dragNode.attr('id')});
			}
		</youi:func>
	</body>
</youi:html>
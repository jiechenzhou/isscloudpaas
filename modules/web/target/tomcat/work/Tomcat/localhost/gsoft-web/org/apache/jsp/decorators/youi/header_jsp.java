/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-06-28 04:03:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.decorators.youi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/pages/include.jsp", Long.valueOf(1435462375184L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fyoui_005fscript_0026_005fsrc_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fyoui_005fscript_0026_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fyoui_005fscript_0026_005fsrc_005fnobody.release();
    _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody.release();
    _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_youi_005fscript_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_youi_005fscript_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_youi_005fstyle_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_youi_005fstyle_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-sm-12\">\r\n");
      out.write("\t<div class=\"pull-left sys-logo\"></div>\r\n");
      out.write("\t<div class=\"pull-left sys-title\"><h3>");
      if (_jspx_meth_youi_005fout_005f0(_jspx_page_context))
        return;
      out.write("</h3></div>\r\n");
      out.write("\t\r\n");
      out.write("\t<ul id=\"main-menu\" class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t<li class=\"dropdown hidden-xs\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"> \r\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-user padding-right-small\"></span>\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"./\">账户信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"./\">修改密码</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<a tabindex=\"-1\" href=\"logout.html\"  title=\"退出系统\" >\r\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-off padding-right-small\"></span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_youi_005fscript_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  youi:script
    com.gsoft.framework.ui.ScriptTag _jspx_th_youi_005fscript_005f0 = (com.gsoft.framework.ui.ScriptTag) _005fjspx_005ftagPool_005fyoui_005fscript_0026_005fsrc_005fnobody.get(com.gsoft.framework.ui.ScriptTag.class);
    _jspx_th_youi_005fscript_005f0.setPageContext(_jspx_page_context);
    _jspx_th_youi_005fscript_005f0.setParent(null);
    // /decorators/youi/header.jsp(5,0) name = src type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_youi_005fscript_005f0.setSrc("/decorators/youi/layout.js");
    int[] _jspx_push_body_count_youi_005fscript_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_youi_005fscript_005f0 = _jspx_th_youi_005fscript_005f0.doStartTag();
      if (_jspx_th_youi_005fscript_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_youi_005fscript_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_youi_005fscript_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_youi_005fscript_005f0.doFinally();
      _005fjspx_005ftagPool_005fyoui_005fscript_0026_005fsrc_005fnobody.reuse(_jspx_th_youi_005fscript_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_youi_005fscript_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  youi:script
    com.gsoft.framework.ui.ScriptTag _jspx_th_youi_005fscript_005f1 = (com.gsoft.framework.ui.ScriptTag) _005fjspx_005ftagPool_005fyoui_005fscript_0026_005fsrc_005fnobody.get(com.gsoft.framework.ui.ScriptTag.class);
    _jspx_th_youi_005fscript_005f1.setPageContext(_jspx_page_context);
    _jspx_th_youi_005fscript_005f1.setParent(null);
    // /decorators/youi/header.jsp(6,0) name = src type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_youi_005fscript_005f1.setSrc("/decorators/youi/menu.js");
    int[] _jspx_push_body_count_youi_005fscript_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_youi_005fscript_005f1 = _jspx_th_youi_005fscript_005f1.doStartTag();
      if (_jspx_th_youi_005fscript_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_youi_005fscript_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_youi_005fscript_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_youi_005fscript_005f1.doFinally();
      _005fjspx_005ftagPool_005fyoui_005fscript_0026_005fsrc_005fnobody.reuse(_jspx_th_youi_005fscript_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_youi_005fstyle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  youi:style
    com.gsoft.framework.ui.StyleTag _jspx_th_youi_005fstyle_005f0 = (com.gsoft.framework.ui.StyleTag) _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody.get(com.gsoft.framework.ui.StyleTag.class);
    _jspx_th_youi_005fstyle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_youi_005fstyle_005f0.setParent(null);
    // /decorators/youi/header.jsp(8,0) name = href type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_youi_005fstyle_005f0.setHref("/decorators/youi/layout.css");
    int[] _jspx_push_body_count_youi_005fstyle_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_youi_005fstyle_005f0 = _jspx_th_youi_005fstyle_005f0.doStartTag();
      if (_jspx_th_youi_005fstyle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_youi_005fstyle_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_youi_005fstyle_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_youi_005fstyle_005f0.doFinally();
      _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody.reuse(_jspx_th_youi_005fstyle_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_youi_005fstyle_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  youi:style
    com.gsoft.framework.ui.StyleTag _jspx_th_youi_005fstyle_005f1 = (com.gsoft.framework.ui.StyleTag) _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody.get(com.gsoft.framework.ui.StyleTag.class);
    _jspx_th_youi_005fstyle_005f1.setPageContext(_jspx_page_context);
    _jspx_th_youi_005fstyle_005f1.setParent(null);
    // /decorators/youi/header.jsp(9,0) name = href type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_youi_005fstyle_005f1.setHref("/decorators/youi/menu.css");
    int[] _jspx_push_body_count_youi_005fstyle_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_youi_005fstyle_005f1 = _jspx_th_youi_005fstyle_005f1.doStartTag();
      if (_jspx_th_youi_005fstyle_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_youi_005fstyle_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_youi_005fstyle_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_youi_005fstyle_005f1.doFinally();
      _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody.reuse(_jspx_th_youi_005fstyle_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_youi_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  youi:out
    com.gsoft.framework.ui.standard.OutTag _jspx_th_youi_005fout_005f0 = (com.gsoft.framework.ui.standard.OutTag) _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody.get(com.gsoft.framework.ui.standard.OutTag.class);
    _jspx_th_youi_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_youi_005fout_005f0.setParent(null);
    // /decorators/youi/header.jsp(13,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_youi_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sys.title}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_youi_005fout_005f0 = _jspx_th_youi_005fout_005f0.doStartTag();
    if (_jspx_th_youi_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_youi_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_youi_005fout_005f0);
    return false;
  }
}
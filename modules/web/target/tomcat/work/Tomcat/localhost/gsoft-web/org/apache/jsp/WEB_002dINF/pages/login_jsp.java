/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-06-28 04:03:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/pages/include.jsp", Long.valueOf(1435462375184L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fauthenticated;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fauthenticated = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fauthenticated.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/scripts/3.0/lib/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/scripts/3.0/lib/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      if (_jspx_meth_youi_005fstyle_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_youi_005fstyle_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<title>系统登录");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userAdapter}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      if (_jspx_meth_shiro_005fauthenticated_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        \r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12 center login-header\">\r\n");
      out.write("        \t<br/>\r\n");
      out.write("            <div align=\"center\"><h2>平台</h2></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/span-->\r\n");
      out.write("    </div><!--/row-->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"well col-md-6 center login-box col-md-offset-3\">\r\n");
      out.write("            <div class=\"alert alert-info\">\r\n");
      out.write("                \t请输入您的用户名和密码登录\r\n");
      out.write("            </div>\r\n");
      out.write("            <form class=\"form-horizontal\" action=\"login.html\" method=\"post\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <div class=\"input-group input-group-lg\">\r\n");
      out.write("                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user red\"></i></span>\r\n");
      out.write("                        <input type=\"text\" name=\"username\" class=\"form-control\" value=\"demo-plt\" placeholder=\"Username\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"></div><br>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-group input-group-lg\">\r\n");
      out.write("                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock red\"></i></span>\r\n");
      out.write("                        <input type=\"password\" name=\"password\" class=\"form-control\" value=\"123456\" placeholder=\"Password\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <div class=\"clearfix\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"login-error pull-right\">\r\n");
      out.write("                    \t");
      if (_jspx_meth_youi_005fout_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p class=\"center col-md-5\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Login</button>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </fieldset>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/span-->\r\n");
      out.write("    </div><!--/row-->\r\n");
      out.write("</div><!--/fluid-row-->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_youi_005fstyle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  youi:style
    com.gsoft.framework.ui.StyleTag _jspx_th_youi_005fstyle_005f0 = (com.gsoft.framework.ui.StyleTag) _005fjspx_005ftagPool_005fyoui_005fstyle_0026_005fhref_005fnobody.get(com.gsoft.framework.ui.StyleTag.class);
    _jspx_th_youi_005fstyle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_youi_005fstyle_005f0.setParent(null);
    // /WEB-INF/pages/login.jsp(9,0) name = href type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_youi_005fstyle_005f0.setHref("/styles/3.0/bootstrap.css");
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
    // /WEB-INF/pages/login.jsp(10,0) name = href type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_youi_005fstyle_005f1.setHref("/styles/login.css");
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

  private boolean _jspx_meth_shiro_005fauthenticated_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:authenticated
    org.apache.shiro.web.tags.AuthenticatedTag _jspx_th_shiro_005fauthenticated_005f0 = (org.apache.shiro.web.tags.AuthenticatedTag) _005fjspx_005ftagPool_005fshiro_005fauthenticated.get(org.apache.shiro.web.tags.AuthenticatedTag.class);
    _jspx_th_shiro_005fauthenticated_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fauthenticated_005f0.setParent(null);
    int _jspx_eval_shiro_005fauthenticated_005f0 = _jspx_th_shiro_005fauthenticated_005f0.doStartTag();
    if (_jspx_eval_shiro_005fauthenticated_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<!-- authenticated -->\r\n");
        out.write("\t<input id=\"hasLogin\" type=\"hidden\" value=\"true\" />\r\n");
        out.write("\t");
        if (true) {
          _jspx_page_context.forward("index.html");
          return true;
        }
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_shiro_005fauthenticated_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fauthenticated_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fauthenticated.reuse(_jspx_th_shiro_005fauthenticated_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fauthenticated.reuse(_jspx_th_shiro_005fauthenticated_005f0);
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
    // /WEB-INF/pages/login.jsp(53,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_youi_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_youi_005fout_005f0 = _jspx_th_youi_005fout_005f0.doStartTag();
    if (_jspx_th_youi_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_youi_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fyoui_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_youi_005fout_005f0);
    return false;
  }
}

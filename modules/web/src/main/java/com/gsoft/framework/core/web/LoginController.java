/**
 * 
 */
package com.gsoft.framework.core.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gsoft.framework.core.Constants;
import com.gsoft.framework.core.exception.BusException;
import com.gsoft.framework.core.web.view.DataModelAndView;
import com.gsoft.framework.core.web.view.Message;
import com.gsoft.framework.security.IUserAdapter;
import com.gsoft.framework.security.UserService;

/**
 * @author zhyi_12
 *
 */
@Controller
public class LoginController {
	
	@Autowired(required=false)
	private UserService userService;

	/**
	 * 登录页面
	 * @param request
	 * @param response
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping("/login.html")
	public ModelAndView login(
    		HttpServletRequest request,
    		HttpServletResponse response){
		
		String userAdapterName = WebUtils.getCleanParam(request, "userAdapter");
		
		IUserAdapter userAdapter = userService.getUserAdapter(userAdapterName);
		
		String viewName = "login";
		
		if(userAdapter!=null){
			viewName +=("-"+userAdapterName);
		}
		
		return new ModelAndView(viewName);
	}
	
	
	@RequestMapping("/common/login1.html")
	public ModelAndView login1(
    		HttpServletRequest request,
    		HttpServletResponse response) throws IOException{
		
		request.setAttribute("userAdapter", "userAdapter");
//		WebUtils.redirectToSavedRequest(request, response, "/login.html?userAdapter=user1");
		WebUtils.issueRedirect(request, response, "/login.html?userAdapter=user1");
		
		return null;
	}
	
	/**
	 * 退出登录页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/logout.html")
	public ModelAndView logout(
    		HttpServletRequest request,
    		HttpServletResponse response){
		//退出系统
		org.apache.shiro.SecurityUtils.getSubject().logout();
		
		try {
			WebUtils.issueRedirect(request, response, "/login.html");
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 首页，登录成功跳转页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/index.html")
	public ModelAndView index(
    		HttpServletRequest request,
    		HttpServletResponse response){
		return new ModelAndView("index");
	}
	
	/**
	 * 欢迎页
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/welcome.html")
	public ModelAndView welcome(
    		HttpServletRequest request,
    		HttpServletResponse response){
		return new ModelAndView("welcome");
	}
	
	/**
	 * 密码修改页
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/modifyPassword.html")
	public ModelAndView modifyPassword(
    		HttpServletRequest request,
    		HttpServletResponse response){
		return new ModelAndView("modifyPassword");
	}
	
	/**
	 * 修改用户登录密码交易
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/doModifyPassword.json")
	public DataModelAndView doModifyPassword(
    		HttpServletRequest request,
    		HttpServletResponse response){
//		AccountPrincipal currentAccount = SecurityUtils.getAccount();
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String oldPassword = request.getParameter("oldPassword");
		
		if(StringUtils.isEmpty(oldPassword)){
			throw new BusException("旧密码不能为空！");
		}
		if(StringUtils.isEmpty(password)){
			throw new BusException("新密码不能为空！");
		}
		if(StringUtils.isEmpty(confirmPassword)){
			throw new BusException("确认密码不能为空！");
		}
		
		if(!password.equals(confirmPassword)){
			throw new BusException("两次输入的密码不一致！");
		}
		
//		userService.modifyPassword(currentAccount.getLoginName(), password, confirmPassword, oldPassword);
		
		
		return new DataModelAndView(new Message(Constants.SUCCESS_CODE,"密码修改成功"));
	}
}

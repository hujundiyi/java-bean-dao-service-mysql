package com.hujun.NetShop.Servlet;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hujun.NetShop.Bean.UserBean;
import com.hujun.NetShop.Service.UserOperationService;
import com.hujun.NetShop.Util.MailUtils;
import com.hujun.NetShop.Util.MyBeanUtils;
import com.hujun.NetShop.Util.UUIDUtils;

/**
 * Servlet implementation class UserOperationServlet
 */
public class UserOperationServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public UserOperationServlet() {
		// TODO Auto-generated constructor stub
	}

	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String usernameString = request.getParameter("username");
		String passwordString = request.getParameter("password");
		UserOperationService userService = new UserOperationService();

		System.out.println(usernameString + "-----" + passwordString);
		try {
			UserBean userBean = userService.login(usernameString, passwordString);
			if (userBean != null) {
				request.getSession().setAttribute("loginUser", userBean);
				return "/index.jsp";
			}
		} catch (Exception e) {
			String msg = e.getMessage();
			request.setAttribute("msg", msg);
			return "/login.jsp";
		}
		return null;
	}

	// 注册
	public String register(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("点击了register");
		// 采用封装的bean工具类 将参数转成用户
		Map<String, String[]> parameterMap = request.getParameterMap();
		UserBean user = new UserBean();
		MyBeanUtils.populate(user, parameterMap);

		// 为user的id、state、code设置相应的值
		user.setUid(UUIDUtils.getId());
		// 激活状态
		user.setState("0");
		user.setCode(UUIDUtils.getCode());

		// 在service中处理数据库
		UserOperationService userService = new UserOperationService();
		int result = userService.register(user);
		// 插入成功 发送邮件
		if (result != 0) {
			request.setAttribute("msg", "用户注册成功，请到邮箱激活！");
			MailUtils.sendMail(user.getEmail(), user.getCode());
			return "/info.jsp";
		} else {
			request.setAttribute("msg", "用户注册失败");
			return "/info.jsp";
		}
	}

	// 邮箱激活
	public String active(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String codeString = request.getParameter("code");
		UserOperationService userService = new UserOperationService();
		int result = userService.active(codeString);
		if (result == 0) {
			request.setAttribute("msg", "没有此用户信息");
			return "/info.jsp";
		} else if (result == 1) {
			request.setAttribute("msg", "激活成功，请登录");
			return "/login.jsp";
		} else {
			request.setAttribute("msg", "此用户已经激活");
			return "/info.jsp";
		}

	}

}

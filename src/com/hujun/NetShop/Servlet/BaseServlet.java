package com.hujun.NetShop.Servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseServlet
 */
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 本来servlet 生命周期会先走init 再走service 再走doget或者dopost 当走到service的时候 我们重写了service
	 * 然后直接执行客户端（jsp）传过来的方法 后面的servlet直接继承这个类就好了
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取客户端传给服务端的方法值
		String mdString = request.getParameter("method");
		// 一般功能执行完之后要跳转页面 所以定义一个跳转页面的路径
		String pathString = null;
		// 获取字节码文件
		Class clazz = this.getClass();

		try {
			// 通过字节码文件判断是否有传过来的方法 有就执行
			Method method = clazz.getMethod(mdString, HttpServletRequest.class, HttpServletResponse.class);

			System.out.println("----" + method.getName());
			// 执行当前对象上的方法 执行完之后返回一个跳转路径
			pathString = (String) method.invoke(this, request, response);

			// 跳转页面 请求转发
			if (pathString != null) {
				request.getRequestDispatcher(pathString).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

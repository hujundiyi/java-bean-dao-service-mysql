package com.hujun.NetShop.Servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hujun.NetShop.Bean.Product;
import com.hujun.NetShop.Service.ProductService;

/**
 * Servlet implementation class indexServlet
 */
public class indexServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	// 默认方法
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse rep) throws Exception {
		ProductService proService = new ProductService();
		List<Product> newList = proService.getHotestProduct();
		List<Product> hotList = proService.getNewestProduct();
		req.setAttribute("newList", newList);
		req.setAttribute("hotList", hotList);

		return "/jsp/index.jsp";
	}
}

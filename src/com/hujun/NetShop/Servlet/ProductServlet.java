package com.hujun.NetShop.Servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hujun.NetShop.Bean.Product;
import com.hujun.NetShop.Service.ProductService;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * 获取最新的商品
	 */
	public String getNewestProduct(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ProductService service = new ProductService();
		List<Product> products = service.getNewestProduct();
		request.setAttribute("newestProduct", products);
		return null;
	}

	/*
	 * 获取最热的商品
	 */
	public String getHotestProduct(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ProductService service = new ProductService();
		List<Product> products = service.getNewestProduct();
		request.setAttribute("hotestProduct", products);

		return null;
	}

}

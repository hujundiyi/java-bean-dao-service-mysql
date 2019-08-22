package com.hujun.NetShop.Servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hujun.NetShop.Bean.Category;
import com.hujun.NetShop.Service.CategoryService;
import com.hujun.NetShop.Util.JedisUtils;

import net.sf.json.JSONArray;
import redis.clients.jedis.Jedis;

/**
 * Servlet implementation class CategoryServlet
 */
public class CategoryServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public String getAllCategory(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 在redis中获取全部分类信息
		Jedis jedis = JedisUtils.getJedis();
		String jsonStr = jedis.get("categoryJson");

		if (null == jsonStr || "".equals(jsonStr)) {
			System.out.println("没有redis缓存");
			// 查数据库
			CategoryService categoryService = new CategoryService();
			List<Category> cateList = categoryService.getAllCategory();

			// 2. 第二种方式 通过ajax请求 将分类数据转成json数据返回 然后 操作dom放入相应的位置
			/*
			 * 这里需要注意 这个请求是否每次进入一个页面都要请求，如果每次请求我们都要去数据库中取的话 明显是不合理的 应该使用redis从缓存中拿
			 */

			// 将全部分类转成json数据
			jsonStr = JSONArray.fromObject(cateList).toString();
			jedis.getSet("categoryJson", jsonStr);

			// 将json数据相应返回到客户端
			response.setContentType("application/json;charset=utf-8");
			response.getWriter().print(jsonStr);
		} else {
			System.out.println("有redis缓存");
			// 将json数据相应返回到客户端
			response.setContentType("application/json;charset=utf-8");
			response.getWriter().print(jsonStr);
		}

		return null;

	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse rep) throws Exception {
		CategoryService categoryService = new CategoryService();
		List<Category> cateList = categoryService.getAllCategory();
		// 1.第一种方式 将分类数据存到request里面 然后页面利用jstl标签去取
		req.setAttribute("categoryList", cateList);

		return "/jsp/index.jsp";
	}
}

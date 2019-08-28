/**
 * 
 */
package com.hujun.NetShop.Dao;

import java.util.List;

import com.hujun.NetShop.Bean.Product;

/**
 * @version:1.0.0
 * @Description:
 * @author: hujun
 * @date: 2019-08-22
 */
public interface ProductDao {

	/**
	 * @Description:获取最新商品
	 */
	public List<Product> getNewestProduct() throws Exception;

	/**
	 * @Description:获取最热商品
	 */
	public List<Product> getHotestProduct() throws Exception;

	/**
	 * @Description:
	 * @param pid
	 * @return
	 */
	public Product finfindById(String pid) throws Exception;

}

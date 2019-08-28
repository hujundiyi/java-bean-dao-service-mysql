/**
 * 
 */
package com.hujun.NetShop.Service;

import java.util.List;

import com.hujun.NetShop.Bean.Product;
import com.hujun.NetShop.Dao.ProductDao;
import com.hujun.NetShop.DaoImpl.ProductDaoImpl;

/**
 * @version:1.0.0
 * @Description:
 * @author: hujun
 * @date: 2019-08-22
 */
public class ProductService {

	/**
	 * @throws Exception
	 * @Description:
	 */
	public List<Product> getNewestProduct() throws Exception {
		ProductDao productDao = new ProductDaoImpl();
		List<Product> productList = productDao.getNewestProduct();
		return productList;

	}

	/**
	 * @throws Exception
	 * @Description:
	 */
	public List<Product> getHotestProduct() throws Exception {
		ProductDao productDao = new ProductDaoImpl();
		List<Product> productList = productDao.getHotestProduct();
		return productList;

	}

	/**
	 * @Description:
	 * @return
	 */
	public Product findById(String pid) throws Exception {
		ProductDao dao = new ProductDaoImpl();
		return dao.finfindById(pid);
	}

}

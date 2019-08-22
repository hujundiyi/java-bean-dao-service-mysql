/**
 * 
 */
package com.hujun.NetShop.Service;

import java.util.List;

import com.hujun.NetShop.Bean.Category;
import com.hujun.NetShop.Dao.CategoryDao;
import com.hujun.NetShop.DaoImpl.CategoryDaoImpl;

/**
 * @version:1.0.0
 * @Description:
 * @author: hujun
 * @date: 2019-08-20
 */
public class CategoryService {

	/**
	 * @Description:
	 * @return
	 */
	public List<Category> getAllCategory() {
		CategoryDao categoryDao = new CategoryDaoImpl();
		return categoryDao.getAllCategory();
	}

}

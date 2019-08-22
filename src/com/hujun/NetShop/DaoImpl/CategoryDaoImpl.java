/**
 * 
 */
package com.hujun.NetShop.DaoImpl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hujun.NetShop.Bean.Category;
import com.hujun.NetShop.Dao.CategoryDao;
import com.hujun.NetShop.Util.JDBCUtils;

/**
 * @version:1.0.0
 * @Description:
 * @author: hujun
 * @date: 2019-08-20
 */
public class CategoryDaoImpl implements CategoryDao {
	@Override
	public List<Category> getAllCategory() {
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String sqlString = "SELECT * FROM category";

		try {
			List<Category> cateList = qr.query(sqlString, new BeanListHandler<Category>(Category.class));
			return cateList;
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("查询分类失败");
		}
	}
}

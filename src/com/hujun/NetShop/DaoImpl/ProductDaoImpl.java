/**
 * 
 */
package com.hujun.NetShop.DaoImpl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hujun.NetShop.Bean.Product;
import com.hujun.NetShop.Dao.ProductDao;
import com.hujun.NetShop.Util.JDBCUtils;

/**
 * @version:1.0.0
 * @Description:
 * @author: hujun
 * @date: 2019-08-22
 */
public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getNewestProduct() throws Exception {
		// 获取最热商品 pflag 0是有货 1没货 按照时间降序
		String sqlString = "select * from product where pflag=0 order by pdate desc limit 0, 9";
		QueryRunner qRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<Product> products = qRunner.query(sqlString, new BeanListHandler<Product>(Product.class));
		return products;
	}

	@Override
	public List<Product> getHotestProduct() throws Exception {

		// 获取最热商品 pflag 0是有货 1没货 is_hot 是否最热
		String sqlString = "select * from product where pflag=0 and is_hot=1 order by pdate desc limit 0, 9";
		QueryRunner qRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<Product> products = qRunner.query(sqlString, new BeanListHandler<Product>(Product.class));

		return products;
	}

}

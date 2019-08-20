/**
 * 
 */
package com.hujun.NetShop.Service;

import java.sql.SQLException;

import com.hujun.NetShop.Bean.UserBean;
import com.hujun.NetShop.Dao.UserDao;
import com.hujun.NetShop.DaoImpl.UserDaoImpl;

/**
 * @version:1.0.0
 * @Description:
 * @author: hujun
 * @date: 2019-08-06
 */
public class UserOperationService {

	public UserBean login(String userName, String password) throws SQLException {
		UserBean user = new UserBean();
		UserDao userDao = new UserDaoImpl();
		user = userDao.login(userName, password);
		if (user != null) {
			return user;
		}
		return null;
	}

	public int register(UserBean user) {
		// 向数据库中插入数据
		UserDao userDao = new UserDaoImpl();
		return userDao.register(user);

	}
}

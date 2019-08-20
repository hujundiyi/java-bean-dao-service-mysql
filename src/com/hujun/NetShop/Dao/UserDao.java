/**
 * 
 */
package com.hujun.NetShop.Dao;

import com.hujun.NetShop.Bean.UserBean;

/**
 * @version:1.0.0
 * @Description:
 * @author: hujun
 * @date: 2019-08-06
 */
public interface UserDao {

	// 根据用户名和密码查询用户登录
	public UserBean login(String name, String password);

	/**
	 * @Description:
	 * @param user
	 * @return
	 */
	public int register(UserBean user);

}

/**
 * 
 */
package com.hujun.NetShop.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.hujun.NetShop.Bean.UserBean;
import com.hujun.NetShop.Dao.UserDao;
import com.hujun.NetShop.Util.JDBCUtil;
import com.hujun.NetShop.Util.JDBCUtils;

/**
 * @version:1.0.0
 * @Description:
 * @author: hujun
 * @date: 2019-08-06
 */
public class UserDaoImpl implements UserDao {

	@Override
	public UserBean login(String name, String password) {
		UserBean user = new UserBean();
		Connection conn = JDBCUtil.getConn();

		String sql = "select * from user where name = ? and password = ?";

		PreparedStatement statement;
		try {
			statement = conn.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, password);

			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				// 这里先用这种方式进行 等项目中期的时候 融入hibernate 或者 mybats 就不用一个一个写了
				user.setUid(resultSet.getString("uid"));
				user.setUsername(resultSet.getString("username"));
				user.setName(resultSet.getString("name"));
				user.setBirthday(resultSet.getString("birthday"));
				user.setCode(resultSet.getString("code"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				user.setSex(resultSet.getString("sex"));
				user.setState(resultSet.getString("state"));
				user.setTelephone(resultSet.getString("telephone"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int register(UserBean user) {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

		String updatesalString = "INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			// 没有这个用户名 可以注册
			Object[] params = { user.getUid(), user.getUsername(), user.getPassword(), user.getName(), user.getEmail(),
					user.getTelephone(), user.getBirthday(), user.getSex(), user.getState(), user.getCode() };
			System.out.println("------" + user.getSex());
			int result = qr.update(updatesalString, params);
			if (result != 0) {
				// 插入成功
				return result;
			} else {
				throw new RuntimeException("操作失败， 请重新注册");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}

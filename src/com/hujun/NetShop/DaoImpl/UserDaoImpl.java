/**
 * 
 */
package com.hujun.NetShop.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

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

		String sql = "select * from user where username=? and password=?";

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
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int register(UserBean user) {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		String checkSqlString = "select * from user where username=?";
		String updatesalString = "INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			UserBean checkUserBean = qr.query(checkSqlString, new BeanHandler<UserBean>(UserBean.class),
					user.getUsername());
			if (checkUserBean == null) {
				// 没有这个用户名 可以注册
				Object[] params = { user.getUid(), user.getUsername(), user.getPassword(), user.getName(),
						user.getEmail(), user.getTelephone(), user.getBirthday(), user.getSex(), user.getState(),
						user.getCode() };
				int result = qr.update(updatesalString, params);
				if (result != 0) {
					// 插入成功
					return result;
				} else {
					throw new RuntimeException("操作失败， 请重新注册");
				}
			} else {
				throw new RuntimeException("已有用户名，无需重复注册");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	// 激活邮箱
	@Override
	public int active(String codeString) {
		String checkSql = "select * from user where code=?";
		String updateSql = "update user set state='1', code='' where uid=?";
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

		try {
			UserBean checkUser = qr.query(checkSql, new BeanHandler<UserBean>(UserBean.class), codeString);
			if (checkUser != null) {
				// 有这个用户
				String uid = checkUser.getUid();
				if (checkUser.getState().equals("0")) {
					// 还没激活 激活
					return qr.update(updateSql, uid);
				} else {
					// 已经激活
					return 2;
				}

			} else {
				// 没有这个用户
				return 0;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}

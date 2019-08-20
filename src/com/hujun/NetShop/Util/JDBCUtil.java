package com.hujun.NetShop.Util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {

	static String driverClass = null;
	static String urlString = null;
	static String nameString = null;
	static String passwordString = null;

	// 从配置文件中读取数据库的相关属性
	static {
		// 1.创建一个属性配置对象
		Properties properties = new Properties();
		InputStream iStream = null;

		try {
//	-> 这种方式错误 路径不对 要放在根下		iStream = new FileInputStream("jdbc.properties");
			// 下面这种方式是在类加载器中加载这个文件 因为这个文件是与class类文件同一个文件

			iStream = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
			// 2.导入输入流
			properties.load(iStream);
			// 3.读取属性
			driverClass = properties.getProperty("driverClass");
			urlString = properties.getProperty("url");
			nameString = properties.getProperty("name");
			passwordString = properties.getProperty("passWord");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取连接
	 * 
	 * @return 一个mysql的连接
	 */
	public static Connection getConn() {
		Connection conn = null;
		try {
			// 1.注册驱动
//			DriverManager.registerDriver(new Driver());
			// 1-1.注册mysql驱动-参照文档
			Class.forName(driverClass);
			// 2.建立连接
			conn = DriverManager.getConnection(urlString, nameString, passwordString);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return conn;
	}

	/**
	 * @param conn
	 * @param statement
	 * @param resultSet 释放一个连接
	 */
	public static void release(Connection conn, Statement statement, ResultSet resultSet) {
		closeConnection(conn);
		closeRs(resultSet);
		closeStatement(statement);
	}

	/**
	 * @param conn
	 * @param statement
	 * @param resultSet
	 * @param resultSet 释放一个连接
	 */
	public static void release(Connection conn, Statement statement) {
		closeConnection(conn);
		closeStatement(statement);
	}

	private static void closeRs(ResultSet rSet) {

		try {
			if (rSet != null) {
				rSet.close();
			}

		} catch (Exception e2) {
			// TODO: handle exception
		} finally {
			rSet = null;
		}
	}

	private static void closeStatement(Statement statement) {
		try {
			if (statement != null) {
				statement.close();
			}

		} catch (Exception e2) {
			// TODO: handle exception
		} finally {
			statement = null;
		}
	}

	private static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}

		} catch (Exception e2) {
			// TODO: handle exception
		} finally {
			conn = null;
		}
	}
}

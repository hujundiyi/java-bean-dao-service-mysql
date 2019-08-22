package com.hujun.NetShop.Util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtils {
	// 创建连接池
	private static JedisPoolConfig config;
	private static JedisPool pool;

	static {
		config = new JedisPoolConfig();
		config.setMaxTotal(30);
		config.setMaxIdle(2);

		/**
		 * 这里要设置一下redis的启动ip地址 因为是本地就用127这个了 如果打包的话 要改变的
		 * 
		 */
		pool = new JedisPool(config, "127.0.0.1", 6379);
	}

	// 获取连接的方法
	public static Jedis getJedis() {
		return pool.getResource();
	}

	// 释放连接
	public static void closeJedis(Jedis j) {
		j.close();
	}
}

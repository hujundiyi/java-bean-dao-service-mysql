# java-bean-dao-service-mysql
本人 在重新自学了java基础课程之后
采用常规的bean+dao+service+mysql的方式
尝试从搭建到开发到发布的过程完成一个企业级javaEE的自学应用
内容是涉及到电商行业的的各个模块
大家想跟着我一起学习的 可以看看哦
后面会陆续接入java框架的


<1>首先加入需要的jar库文件
	1.mysql-connector-java-5.1.39-bin.jar文件  jdbc的mysql驱动
	2.mail.jar  注册的邮件发送
	3.jstl.jar  通过表达式，将数据显示在jsp
	4.c3p0-0.9.2-pre5.jar  数据连接池 
	5.commons-beanutils-1.8.3.jar  模型工具类
	6.commons-dbutils-1.4.jar      数据库操作工具类
	7.commons-fileupload-1.2.1.jar  文件上传工具类
	8.commons-io-1.4.jar            io工具类
	9.commons-logging-1.1.1.jar     log工具类
	10.mchange-commons-java-0.2.3.jar  c3p0数据库连接池的辅助包,没有这个包系统启动的时候会报错
	11.standard.jar  与jstl一起使用  没有jstl会报错

<2>创建数据库
	store_v1.0.sql是数据库执行语句  在navicat中执行就可以创建表和相关数据了
	相关建表的原则和思路个人建议还是先学习jdbc的相关课程  如果有基础可以忽略

<3>编写代码
	思路：因为我们用到的是servlet 所以 为了可以更好的调度和尽量减少代码 封装一个baseServlet的类
	这样后面的servlet都继承他 当从页面点击链接或者按钮的时候 发送请求 请求中带有method参数 servlet
	通过这个参数的值 来找到这个参数所带表的方法  希望这里好好理解  代码中会有相关注释
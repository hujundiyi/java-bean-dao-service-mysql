## java-bean-dao-service-mysql
本人 在重新自学了java基础课程之后
采用常规的bean+dao+service+mysql的方式
尝试从搭建到开发到发布的过程完成一个企业级javaEE的自学应用
内容是涉及到电商行业的的各个模块
大家想跟着我一起学习的 可以看看哦
后面会陆续接入java框架的


## <1>首先加入需要的jar库文件
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

## <2>创建数据库
	store_v1.0.sql是数据库执行语句  在navicat中执行就可以创建表和相关数据了
	相关建表的原则和思路个人建议还是先学习jdbc的相关课程  如果有基础可以忽略

## <3>编写代码
	思路：
	1.因为我们用到的是servlet 所以 为了可以更好的调度和尽量减少代码 封装一个baseServlet的类
	这样后面的servlet都继承他 当从页面点击链接或者按钮的时候 发送请求 请求中带有method参数 servlet
	通过这个参数的值 来找到这个参数所带表的方法  希望这里好好理解  代码中会有相关注释
	
	2.关于注册发送邮件 windows用户可以使用易邮邮件服务器搭建自己的服务器 觉得麻烦的 可以在util工具中找到mailutil
	工具类 将里面的发送邮件账户和密码改成自己用的qq或者163的邮箱 这样就可以发送邮件了 但是采用这种方法激活的话 你们的
	激活链接里面的localhost要改成你们自己的域名 我相信能看懂这一步的 应该能够明白内网和外网的相关知识了吧 
	如果不明白的话 那我建议你应该看看邮件的收发机制文档 然后仔细观察激活链接 能够联想到什么
	
	3.基本90%采用面向接口编程 但是在service没有采用接口的模式 而是直接调用dao层接口 这里想要更完美的 可以自行修改
	
	4.在看页面jsp的时候 必须要懂得知识点是jstl、el表达式 cookie、session、get、post等基础知识 理解透
	
	5.如果代码中有不懂得 欢迎加我v 私聊 我还有很多的学习资料可以分享 加我时注明：学习


<img src="/WebContent/resources/chatImage/chatImage.jpg" width=100px alt="vx二维码"/>
	
	
	
	
	

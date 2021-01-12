package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Main01 {

    /**
     * MyBatis HelloWorld 小结:
     * 	 两个重要的配置文件
     * 		mybatis-config.xml: 全局配置文件，数据库连接信息、 引入SQL映射文件等....
     * 		EmployeeMapper.xml: SQL映射文件，配置增删改查的SQL语句的映射
     *
     *  两个重要的对象
     *  	SqlSessionFactory: SqlSession的工厂对象， 主要是用于获取SqlSession对象
     *  	SqlSession: Java程序与数据库的会话对象，可以理解为是对Connection的封装
     */
    public static SqlSessionFactory getSqlSessionFactory() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Hello World!");
        System.out.println();

        SqlSession sqlSession = getSqlSessionFactory().openSession();
        Employee employee = sqlSession.selectOne("suibian.selectEmployee", 1001);
        System.out.println(employee);

        sqlSession.close();
    }
}

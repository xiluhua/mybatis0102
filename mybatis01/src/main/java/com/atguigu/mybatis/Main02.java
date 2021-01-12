package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Main02 extends Main01{

    public static void main(String[] args) throws Exception {

        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            //mapper接口： dao接口
			/*
			 * 两个绑定:
			 * 	 1. Mapper接口与SQL映射文件的绑定.  映射文件的namesapce的值必须指定成接口的全类名.
			 * 	 2. Mapper接口的方法  与 SQL映射文件的具体SQL语句的绑定    SQL语句的id值  必须指定成接口的方法名.
			 *
			 * Mapper接口开发的好处:
			 * 	 1. 有更明确的类型
			 * 	 2. 接口本身: 接口本身就是抽象. 抽出了规范.
			 * 			EmployeeDao:    EmployeeDaoJdbcImpl 、 EmployeeDaoHibernateImpl、MyBatis代理实现类
			 */
            //获取MyBatis为Mapper接口生成的代理实现类对象
            EmployeeDao dao = sqlSession.getMapper(EmployeeDao.class);
            System.out.println(dao.getClass().getName());

            Employee employee  = dao.getEmployeeById(1001);

            System.out.println(employee);
        } finally {
            sqlSession.close();
        }
    }
}

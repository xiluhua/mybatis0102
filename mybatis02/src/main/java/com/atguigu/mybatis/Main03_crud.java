package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Date;

public class Main03_crud extends Main01{

    public static void main(String[] args) throws Exception {

        SqlSession sqlSession = getSqlSessionFactory().openSession();
//        SqlSession sqlSession = getSqlSessionFactory().openSession(true); // true: transaction 自动提交
        try {
            //获取Mapper接口的代理实现类对象
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//            //查询
//            Employee employee =mapper.getEmployeeById(1004);
//            System.out.println(employee);

            //添加
			Employee employee = new Employee(null, "苍老师3", null, 1, new Date());
            int result = mapper.addEmployee(employee);
            System.out.println("result: "+result);
			System.out.println("返回的主键值: " + employee.getId());
			/*
			JDBC操作获取新插入数据的主键值:
			Connection conn = null ;
			PreparedStatement  ps = conn.prepareStatement("sql", PreparedStatement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			ps.getGeneratedKeys();
			*/
            //修改
//			Employee employee  =
//					new Employee(1006, "敏敏", "mm@sina.com", 2);
//			int result = mapper.updateEmployee(employee);
//            System.out.println("result: "+result);

            //删除
//			int result= mapper.deleteEmployeeById(1006);
//			System.out.println("result: "+result);

            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }
}

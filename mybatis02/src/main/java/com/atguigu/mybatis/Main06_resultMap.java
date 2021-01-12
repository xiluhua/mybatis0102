package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeMapper;
import com.atguigu.mybatis.dao.EmployeeMapperResultMap;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Map;

public class Main06_resultMap extends Main01{

    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();
        try {
            EmployeeMapperResultMap mapper = session.getMapper(EmployeeMapperResultMap.class);

            Employee employee = mapper.getEmployeeById(1004);
            System.out.println(employee);

        } finally {
            session.close();
        }
    }
}

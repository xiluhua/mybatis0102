package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeMapperResultMap;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class Main07_resultMap_cascade extends Main01{

    // 级联有两种方式
    // 方式一 & 方式二
    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();
        try {
            EmployeeMapperResultMap mapper = session.getMapper(EmployeeMapperResultMap.class);

            Employee employee = mapper.getEmpAndDept(1004);
            System.out.println(employee);
            System.out.println(employee.getDept());

        } finally {
            session.close();
        }
    }
}

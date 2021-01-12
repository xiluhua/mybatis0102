package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeMapperDynamicSQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

public class Main16_dynamicSql_batch extends Main01{

    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();

        try {
            EmployeeMapperDynamicSQL mapper = session.getMapper(EmployeeMapperDynamicSQL.class);
            List<Employee> emps = new ArrayList<>();
            emps.add(new Employee(null, "AA", "aa@sina.com", 1));
            emps.add(new Employee(null, "BB", "bb@sina.com", 2));
            emps.add(new Employee(null, "CC", "cc@sina.com", 1));


            mapper.addEmps(emps);

            session.commit();
        } finally {
            session.close();
        }
    }
}

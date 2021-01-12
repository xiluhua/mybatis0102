package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeMapperDynamicSQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

public class Main15_dynamicSql_foreach extends Main01{

    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();

        try {
            EmployeeMapperDynamicSQL mapper = session.getMapper(EmployeeMapperDynamicSQL.class);
            Employee condition = new Employee();

            List<Integer> ids = new ArrayList<Integer>();
            ids.add(1002);
            ids.add(1003);
            ids.add(1004);
            ids.add(1005);
            List<Employee> emps = mapper.getEmpsByIds(ids);
            System.out.println(emps);
        } finally {
            session.close();
        }
    }
}

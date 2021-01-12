package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Department;
import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.DepartmentMapperResultMap;
import com.atguigu.mybatis.dao.EmployeeMapperDynamicSQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class Main11_dynamicSql_where extends Main01{

    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();

        try {
            EmployeeMapperDynamicSQL mapper = session.getMapper(EmployeeMapperDynamicSQL.class);
            Employee condition = new Employee();
//            condition.setId(1004);
            condition.setLastName("敏敏");
            condition.setEmail("mm@sina.com");
            condition.setGender(2);
            List<Employee > emps = mapper.getEmpsByConditionIfWhere(condition);
            System.out.println(emps);

        } finally {
            session.close();
        }
    }
}

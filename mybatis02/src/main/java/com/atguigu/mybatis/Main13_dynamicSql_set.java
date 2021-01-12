package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeMapperDynamicSQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class Main13_dynamicSql_set extends Main01{

    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();

        try {
            EmployeeMapperDynamicSQL mapper = session.getMapper(EmployeeMapperDynamicSQL.class);
            Employee condition = new Employee();
//            condition.setId(1004);
            condition.setEmail("mm@sina.com");
            condition.setLastName("敏敏");
            condition.setGender(2);
            int result = mapper.updateEmpByConditionSet(condition);
            System.out.println(result);

        } finally {
            session.close();
        }
    }
}

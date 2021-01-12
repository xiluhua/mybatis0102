package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeMapperResultMap;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class Main08_resultMap_association_stepsQuery extends Main01{

    // 分步查询一
    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();
        try {
            EmployeeMapperResultMap mapper = session.getMapper(EmployeeMapperResultMap.class);

            Employee employee = mapper.getEmpAndDeptStep(1004);
            System.out.println(employee.getLastName());
            System.out.println("--------------------------------------------");
            System.out.println(employee.getDept());

        } finally {
            session.close();
        }
    }
}

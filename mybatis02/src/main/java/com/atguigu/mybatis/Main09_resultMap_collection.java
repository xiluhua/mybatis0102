package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Department;
import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.DepartmentMapperResultMap;
import com.atguigu.mybatis.dao.EmployeeMapperResultMap;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class Main09_resultMap_collection extends Main01{

    // 分步查询二
    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();
        try {
            DepartmentMapperResultMap mapper = session.getMapper(DepartmentMapperResultMap.class);

            Department dept = mapper.getDeptAndEmps(4);
            System.out.println(dept);
            System.out.println(dept.getEmps());

        } finally {
            session.close();
        }
    }
}

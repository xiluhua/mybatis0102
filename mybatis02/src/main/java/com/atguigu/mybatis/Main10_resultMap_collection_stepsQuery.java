package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Department;
import com.atguigu.mybatis.dao.DepartmentMapperResultMap;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class Main10_resultMap_collection_stepsQuery extends Main01{

    // 分步查询 collection
    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();
        try {
            DepartmentMapperResultMap mapper = session.getMapper(DepartmentMapperResultMap.class);

            Department dept = mapper.getDeptAndEmpsStep(4);
            System.out.println(dept.getDepartmentName());
            System.out.println("---------------------------");
            System.out.println(dept.getEmps());

        } finally {
            session.close();
        }
    }
}

package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main05_emps extends Main01{

    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();

        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//			List<Employee> emps = mapper.getEmps();
//			emps.forEach(employee -> System.out.println(employee));

			Map<String,Object> map = mapper.getEmployeeByIdReturnMap(1003);
            map.forEach((k,v)->System.out.println("k : " + k + " v : " + v));

//            Map<Integer,Employee> map = mapper.getEmpsReturnMap();
//            map.forEach((k,v)->System.out.println("k : " + k + " v : " + v));
        } finally {
            session.close();
        }
    }
}

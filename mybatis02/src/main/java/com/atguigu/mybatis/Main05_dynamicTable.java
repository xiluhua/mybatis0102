package com.atguigu.mybatis;

import com.atguigu.mybatis.beans.Employee;
import com.atguigu.mybatis.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;
import java.util.Map;

public class Main05_dynamicTable extends Main01{

    public static void main(String[] args) throws Exception {
        SqlSessionFactory ssf = getSqlSessionFactory();
        SqlSession session = ssf.openSession();

        try {
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

			Map<String,Object> map = new HashMap<String,Object>();
			map.put("tbl", "tbl_employee");
			map.put("id", 1003);
			map.put("ln", "苍老师");
			Employee employee = mapper.getEmployeeByMap(map);
			System.out.println(employee);

        } finally {
            session.close();
        }
    }
}

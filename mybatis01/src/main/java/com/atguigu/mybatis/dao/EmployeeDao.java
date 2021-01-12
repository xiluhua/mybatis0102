package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.beans.Employee;

public interface EmployeeDao {
	
	//定义 CRUD 相关的方法
	
	//根据id查询Employee
	public Employee getEmployeeById(Integer id);
}

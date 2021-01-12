package com.atguigu.mybatis.dao;

import java.util.List;

import com.atguigu.mybatis.beans.Employee;

public interface EmployeeMapperResultMap {
	
	public Employee getEmployeeById(Integer id);
	
	public Employee getEmpAndDept(Integer id);
	
	public Employee getEmpAndDeptStep(Integer id);
	
	public List<Employee> getEmpsByDid(Integer did);
}

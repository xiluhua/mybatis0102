package com.atguigu.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatis.beans.Employee;

public interface EmployeeMapperDynamicSQL {
	
	public List<Employee> getEmpsByConditionIfWhere(Employee Condition);
	
	public List<Employee> getEmpsByConditionTrim(Employee Condition);
	
	public int updateEmpByConditionSet(Employee Condition);
	
	public List<Employee> getEmpsByConditionChoose(Employee Condition);
	
	public List<Employee> getEmpsByIds(@Param("ids") List<Integer> ids);
	
	//批量操作:  修改  删除  添加
	public void addEmps(@Param("emps") List<Employee> emps);
	
}

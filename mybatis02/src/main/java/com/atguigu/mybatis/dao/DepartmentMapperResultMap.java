package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.beans.Department;

public interface DepartmentMapperResultMap {
	
	public Department getDeptById(Integer id);
	
	public Department getDeptAndEmps(Integer id);
	
	public Department getDeptAndEmpsStep(Integer id);
}

package com.atguigu.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatis.beans.Employee;

public interface EmployeeMapper {
	
	//定义 CRUD 相关的方法
	
	//根据id查询Employee
	public Employee getEmployeeById(Integer id);
	
	//添加一个新的Employee
	public Integer addEmployee(Employee employee);
	
	//修改一个Employee
	public Integer updateEmployee(Employee employee);
	
	//删除一个Employee
	public Integer deleteEmployeeById(Integer id);

	//第一种写法
//	public Employee getEmployeeByIdAndLastName(Integer id,
//	                                           String lastName);

	//第二种写法
	public Employee getEmployeeByIdAndLastName(@Param("id") Integer id,
                                                @Param("lastName") String lastName);

	public Employee getEmployeeByMap(Map<String, Object> map);

	public Employee getEmployeeByMapDynamicTable(Map<String, Object> map);


	//day02
	//查询多行数据返回一个对象的集合
	public List<Employee> getEmps();

	//查询单条数据返回一个Map
	public Map<String, Object> getEmployeeByIdReturnMap(Integer id );

	//查询多条数据返回一个Map
	@MapKey("id")  // 指定使用对象的哪个属性作为Map的key.
	public Map<Integer,Employee>  getEmpsReturnMap();
}

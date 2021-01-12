package com.atguigu.mybatis.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Date;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	
	private Integer id ; 
	private String lastName; 
	private String email ;
	private Integer gender ;
	private Date createTime;

	// in use from Main07_resultMap_cascade
	private Department dept;

	public Employee(Integer id, String lastName, String email, Integer gender) {
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
	}

    public Employee(Integer id, String lastName, String email, Integer gender, Date createTime) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.createTime = createTime;
    }
}

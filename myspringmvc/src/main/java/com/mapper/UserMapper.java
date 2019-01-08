package com.mapper;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.bean.User;

@Repository(value = "userMapper")
public interface UserMapper {

	@Select("select id,username,password from user where username=#{username} and password=#{password}")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	@Results({ @Result(id = true, column = "id", property = "id"), @Result(column = "username", property = "username"),
			@Result(column = "password", property = "password") })
	User loginByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

}

package com.hihoo.mio.shopping.modules.service;

import com.hihoo.mio.shopping.modules.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

	/**
	 * 根据用户名查找用户
	 * @param name
	 * @return
	 */
	@Select("SELECT * FROM user WHERE name = #{name}")
	User findByName(@Param("name") String name);

	@Insert("INSERT INTO user(ID,NAME,AGE) VALUES(#{id}, #{name}, #{age})")
	int insert(@Param("id") String id,@Param("name") String name, @Param("age") String age);
}

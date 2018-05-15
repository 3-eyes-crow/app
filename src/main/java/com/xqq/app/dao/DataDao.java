package com.xqq.app.dao;

import com.xqq.app.domain.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DataDao {

    @Select("select * from users")
    List<Users> listUsers();

    @Insert("insert into users(id,firstname,lastname,phone,email) values(#{id},#{firstName},#{lastName},#{phone},#{email})")
    @SelectKey(statement = "select sq_users.nextval from dual", keyProperty = "id",
            resultType = int.class, before = true)
    int saveUser(Users user);

    @Update("update users set firstName = #{firstName}, lastName = #{lastName}, phone = " +
            "#{phone}, email=#{email} where id = #{id}")
    int updateUser(Users user);

    @Delete("delete from users where id = #{id}")
    int deleteUser(String id);
}

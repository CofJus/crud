
/**
 * @author CJH
 * UserDao
 */
package com.hhu.repository;

import com.hhu.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository

public interface UserDao {
    @Select(" SELECT * FROM userinfo WHERE username=#{username} AND password=#{password}")
    public User getUserByMessage(@Param("username") String username, @Param("password") String password);
}

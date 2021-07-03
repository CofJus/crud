
/**
 * @author CJH
 * UserDao
 */
package com.hhu.dao;

import com.hhu.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public User getUserByMessage(@Param("username") String username, @Param("password") String password);
}

package org.sang.security02.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.security02.model.Role;
import org.sang.security02.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    User loadUserByUsername(String username);
    List<Role> getUserRolesByUid(Integer id);
}

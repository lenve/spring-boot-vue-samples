package org.sang.dao1;

import org.sang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sang on 2018/7/16.
 */
public interface UserDao extends JpaRepository<User,Integer>{
}

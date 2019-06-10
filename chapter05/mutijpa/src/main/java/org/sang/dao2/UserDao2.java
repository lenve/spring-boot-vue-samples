package org.sang.dao2;

import org.sang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sang on 2018/7/16.
 */
public interface UserDao2 extends JpaRepository<User,Integer>{
}

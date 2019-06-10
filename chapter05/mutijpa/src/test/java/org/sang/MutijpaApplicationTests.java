package org.sang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sang.dao1.UserDao;
import org.sang.dao2.UserDao2;
import org.sang.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MutijpaApplicationTests {
	@Autowired
	UserDao userDao;
	@Autowired
	UserDao2 userDao2;
	@Test
	public void contextLoads() {
		List<User> all = userDao.findAll();
		System.out.println(all);
		List<User> all2 = userDao2.findAll();
		System.out.println(all2);
	}
}

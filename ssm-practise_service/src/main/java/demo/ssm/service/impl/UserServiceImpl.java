package demo.ssm.service.impl;

import demo.ssm.dao.UserDao;
import demo.ssm.pojo.User;
import demo.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUser(User user) {
        return userDao.findUser(user);
    }
}

package org.patters.structural.bridge;

public abstract class UserService {

    protected UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public abstract void save(User user);
}

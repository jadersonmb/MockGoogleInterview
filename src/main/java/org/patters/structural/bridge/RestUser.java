package org.patters.structural.bridge;

public class RestUser extends UserService {

    public RestUser(UserDao userDao) {
        super(userDao);
    }

    @Override
    public void save(User user) {
        System.out.println("Save Rest user");
    }
}

package org.patters.structural.bridge;


public class EJBUser extends UserService {

    public EJBUser(UserDao userDao) {
        super(userDao);
    }

    @Override
    public void save(User user) {
        System.out.println("Save user in EJB");
    }
}

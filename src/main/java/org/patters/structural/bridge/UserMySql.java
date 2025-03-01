package org.patters.structural.bridge;

public class UserMySql implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("Save user in MySql");
    }
}

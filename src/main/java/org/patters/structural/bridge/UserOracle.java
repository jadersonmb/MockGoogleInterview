package org.patters.structural.bridge;

public class UserOracle implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("Save user in Oracle");
    }
}

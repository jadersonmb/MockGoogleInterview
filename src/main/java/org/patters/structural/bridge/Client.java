package org.patters.structural.bridge;

public class Client {

    public static void main(String[] args) {
        User user = new User();
        user.setName("John");
        user.setNickname("Doe");

        UserService userService = new RestUser(new UserMySql());
        userService.save(user);

        UserService EJBUser = new EJBUser(new UserOracle());
        EJBUser.save(user);
    }
}

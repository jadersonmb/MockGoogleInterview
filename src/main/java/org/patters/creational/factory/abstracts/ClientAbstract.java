package org.patters.creational.factory.abstracts;


import org.patters.creational.factory.abstracts.factory.RestAbstractFactory;
import org.patters.creational.factory.abstracts.factory.ServiceAbstractFactory;
import org.patters.creational.factory.abstracts.interfaces.CarService;
import org.patters.creational.factory.abstracts.interfaces.UserService;

public class ClientAbstract {
    public static void main(String[] args) {
        //ServiceAbstractFactory factory = new EJBAbstractFactory();
        ServiceAbstractFactory factory = new RestAbstractFactory();
        UserService userService = factory.getUserService();
        CarService carService = factory.getCarService();

        System.out.println(userService.delete());
        System.out.println(userService.save());
        System.out.println(carService.module());
    }
}

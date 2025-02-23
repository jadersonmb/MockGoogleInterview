package org.patters.creational.factory.abstracts.factory;

import org.patters.creational.factory.abstracts.interfaces.CarService;
import org.patters.creational.factory.abstracts.interfaces.UserService;
import org.patters.creational.factory.abstracts.service.CarEJBService;
import org.patters.creational.factory.abstracts.service.UserEJBService;

public class EJBAbstractFactory implements ServiceAbstractFactory {
    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }
}

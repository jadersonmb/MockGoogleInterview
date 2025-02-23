package org.patters.creational.factory.abstracts.factory;

import org.patters.creational.factory.abstracts.interfaces.CarService;
import org.patters.creational.factory.abstracts.interfaces.UserService;
import org.patters.creational.factory.abstracts.service.CarRestService;
import org.patters.creational.factory.abstracts.service.UserRestService;

public class RestAbstractFactory implements ServiceAbstractFactory {
    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
}

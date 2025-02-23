package org.patters.creational.factory.abstracts.factory;

import org.patters.creational.factory.abstracts.interfaces.UserService;
import org.patters.creational.factory.abstracts.interfaces.CarService;

public interface ServiceAbstractFactory {
    UserService getUserService();

    CarService getCarService();
}

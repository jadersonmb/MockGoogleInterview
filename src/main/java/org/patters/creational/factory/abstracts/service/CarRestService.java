package org.patters.creational.factory.abstracts.service;

import org.patters.creational.factory.abstracts.interfaces.CarService;

public class CarRestService implements CarService {
    @Override
    public String module() {
        return "Rest Car";
    }
}

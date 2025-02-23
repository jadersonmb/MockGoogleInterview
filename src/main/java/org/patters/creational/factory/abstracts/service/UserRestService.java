package org.patters.creational.factory.abstracts.service;

import org.patters.creational.factory.abstracts.interfaces.UserService;

public class UserRestService implements UserService {
    @Override
    public String save() {
        return "Rest API save";
    }

    @Override
    public String delete() {
        return "Rest API delete";
    }
}

package org.patters.creational.factory.abstracts.service;

import org.patters.creational.factory.abstracts.interfaces.UserService;

public class UserEJBService implements UserService {
    @Override
    public String save() {
        return "Save EJB";
    }

    @Override
    public String delete() {
        return "Delete EJB";
    }
}

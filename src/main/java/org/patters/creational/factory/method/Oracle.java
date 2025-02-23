package org.patters.creational.factory.method;

public class Oracle implements DBFactory {
    @Override
    public void connect() {
        System.out.println("Connect to Oracle");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect from Oracle");
    }

    @Override
    public void execute() {
        System.out.println("Execute query in Oracle");
    }
}

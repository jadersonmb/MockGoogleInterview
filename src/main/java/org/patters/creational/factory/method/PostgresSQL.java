package org.patters.creational.factory.method;

public class PostgresSQL implements DBFactory {

    @Override
    public void connect() {
        System.out.println("Connect to PostgresSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect to PostgresSQL");
    }

    @Override
    public void execute() {
        System.out.println("Execute to PostgresSQL");
    }
}

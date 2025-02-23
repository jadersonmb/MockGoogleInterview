package org.patters.creational.factory.method;

public interface DBFactory {
    void connect();
    void disconnect();
    void execute();
}

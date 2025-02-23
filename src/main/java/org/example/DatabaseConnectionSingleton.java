package org.example;

public class DatabaseConnectionSingleton {

    private static DatabaseConnectionSingleton instance = null;

    private DatabaseConnectionSingleton() {}

    public synchronized static DatabaseConnectionSingleton getInstance() {
        if(instance == null) {
            instance = new DatabaseConnectionSingleton();
        }
        return instance;
    }
}

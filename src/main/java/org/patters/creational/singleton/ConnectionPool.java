package org.patters.creational.singleton;

import java.util.List;

public class ConnectionPool {

    private static ConnectionPool instance = null;
    private final List<Connection> connectionPolls;

    private ConnectionPool() {
        int POOL_SIZE = 1;
        connectionPolls = new java.util.ArrayList<>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionPolls.add(new Connection());
        }
    };

    static ConnectionPool getInstance() {
        if(instance == null){
            instance = new ConnectionPool();
        }
        return instance;
    }

    public Connection getConnection(){
        Connection availableConnection = null;
        for (Connection connection : connectionPolls) {
            if(!connection.inUsed()){
                availableConnection = connection;
                break;
            }
        }

        if(availableConnection == null){
            System.out.println("Connection pool is full");
            return null;
        }

        availableConnection.setInUsed(true);
        return availableConnection;
    }

    public void leaveConnection(Connection connection){
        connection.setInUsed(false);
    }

}

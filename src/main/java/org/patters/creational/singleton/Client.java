package org.patters.creational.singleton;

public class Client {
    public static void executeQuery() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = connectionPool.getConnection();
        if (connection != null) {
            connection.executeQuery("SELECT * FROM table");
        }
        assert connection != null;
        connection.setInUsed(true);
        connectionPool.leaveConnection(connection);
    }

    public static void executeQueryTwo() {
        Connection connection = ConnectionPool.getInstance().getConnection();
        if (connection != null) {
            connection.executeQuery("SELECT * FROM table");
        }

    }

    public static void main(String[] args) {
        executeQuery();
        executeQueryTwo();
    }
}

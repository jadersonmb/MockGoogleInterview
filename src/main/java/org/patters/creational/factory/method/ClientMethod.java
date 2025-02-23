package org.patters.creational.factory.method;

public class ClientMethod {
    public static void main(String[] args) {
        OracleFactory db = new OracleFactory();
        //PostgresSQLFactory db = new PostgresSQLFactory();
        //OracleFactory db = new OracleFactory();

        db.exclusiveMethod();
        db.connect();
        db.execute();
        db.disconnect();
    }
}
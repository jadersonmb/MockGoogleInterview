package org.patters.creational.singleton;

public class Connection {

    private boolean inUsed = false;

    public void executeQuery(String query) {
        System.out.println("Execute query: " + query);
    }

    public boolean inUsed() {
        return inUsed;
    }

    public void setInUsed(boolean inUsed) {
        this.inUsed = inUsed;
    }
}

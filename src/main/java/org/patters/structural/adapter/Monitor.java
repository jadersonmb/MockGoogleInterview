package org.patters.structural.adapter;

public class Monitor implements VGA {

    @Override
    public void setImage(String image) {
        System.out.println("Set image in monitor: " + image);
    }
}

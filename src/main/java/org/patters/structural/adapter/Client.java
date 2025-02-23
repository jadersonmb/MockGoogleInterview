package org.patters.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Monitor monitor = new Monitor();

        //computer.connectPort(monitor);
        computer.connectPort(new HDMIToVGAAdapter(monitor));
        computer.setImageAndSound("Dragon", "HABITUE");

    }
}

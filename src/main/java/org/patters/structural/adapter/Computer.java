package org.patters.structural.adapter;

public class Computer implements HDMI {

    private HDMI port;

    public void connectPort(HDMI port) {
        System.out.println("Connect port to computer");
        this.port = port;
    }

    public void setImageAndSound(String image, String sound) {
        if(port != null) {
            port.setImage(image);
            port.setSound(sound);
        }
    }

    @Override
    public void setImage(String image) {
        System.out.println("Set image in to HDMI");
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Set sound in computer to HDMI");
    }
}

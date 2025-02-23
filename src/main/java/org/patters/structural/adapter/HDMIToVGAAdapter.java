package org.patters.structural.adapter;

public class HDMIToVGAAdapter implements HDMI {

    private final VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("HDMI to VGA adapter created");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Set sound it's not possible to set sound in monitor");
    }
}

//package Tehtavasarja1_4;

public class Televisio {
    private int channel;
    private boolean isOn;

    public Televisio() {
        this.channel = 1;
        this.isOn = false;
    }
    public void changeChannel(int channel) {
        if (isOn) {
            this.channel = channel;
            System.out.println("Changed to channel " + channel );
        } else {
            System.out.println("Please turn on the TV to change the channel.");
        }
    }



}

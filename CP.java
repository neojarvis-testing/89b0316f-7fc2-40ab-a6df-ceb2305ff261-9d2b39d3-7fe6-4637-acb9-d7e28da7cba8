// TVRemote.java
public class TVRemote {
    private boolean powerOn;
    private int volume;
    private int channel;

    public TVRemote() {
        powerOn = false;
        volume = 50;
        channel = 1;
    }

    public void togglePower() {
        powerOn = !powerOn;
        if (powerOn) {
            System.out.println("TV is now ON");
        } else {
            System.out.println("TV is now OFF");
        }
    }

    public void changeVolume(int amount) {
        if (powerOn) {
            volume += amount;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Please turn on the TV first.");
        }
    }

    public void changeChannel(int channel) {
        if (powerOn) {
            this.channel = channel;
            System.out.println("Channel changed to: " + channel);
        } else {
            System.out.println("Please turn on the TV first.");
        }
    }

    public static void main(String[] args) {
        TVRemote remote = new TVRemote();

        // Simulate using the remote
        remote.togglePower();
        remote.changeVolume(10);
        remote.changeChannel(5);
        remote.togglePower();
    }
}

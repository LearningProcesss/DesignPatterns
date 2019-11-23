package command_pattern.receiver;

/**
 * Stereo
 */
public class Stereo {

    public Stereo() {

    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCD() {
        System.out.println("Stereo setCd");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo play volume:" + volume);
    }
}
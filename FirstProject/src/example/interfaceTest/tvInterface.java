package example.interfaceTest;

public interface tvInterface {
    public static int CHANEL_MAX = 99;
    public static int CHANEL_MIN = 1;

    public void turnOn();

    public void turnOff();

    public void changeCurrentChanel(int ChanelToChange);

    public void changeCurrentVolume(int VolumeToChange);
}

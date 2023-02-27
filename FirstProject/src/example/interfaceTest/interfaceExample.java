package example.interfaceTest;

public class interfaceExample implements SmartTvInterface,tvInterface{
    private int currentChanel = CHANEL_MIN;
    private int currentVolume = 0;
    @Override
    public void turnOn() {
        System.out.println("Tv On");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Off");
    }

    @Override
    public void changeCurrentChanel(int ChanelToChange) {
        System.out.println("You're Current Chanel is: "+currentChanel+"You have changed channel to "+ChanelToChange);
    }

    @Override
    public void changeCurrentVolume(int VolumeToChange) {
        System.out.println("You're Current Volume is: "+currentVolume+"You have changed Volume to "+VolumeToChange);
    }

    @Override
    public void searchMovie() {
        System.out.println("I will recomend movies that would be interesting you ");
    }

    public void ExecuteAll() {
        this.turnOn();
        this.turnOff();
        this.changeCurrentChanel(30);
        this.changeCurrentVolume(30);
        this.searchMovie();
    }
}

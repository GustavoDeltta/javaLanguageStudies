package methods;

public class smartTv {
    boolean status = false; int channel = 1; int volume = 10;
    public void on_off(){
        status = !status;
    }
    public void increaseVolume(){
        volume++;
    }
    public void decreaseVolume(){
        if (volume!=0){
            volume--;
        }
    }
    public void increaseChanel(){
        channel++;
    }
    public void decreaseChanel(){
        if (channel!=0){
            channel--;
        }
    }
    public void changeChannel(int input){
        channel = input;
    }
}

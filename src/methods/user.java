package methods;

public class user {
    public static void main(String[] args) throws Exception{

        smartTv SmartTv = new smartTv();

        System.out.println("Status: " + SmartTv.status);
        System.out.println("Volume: " + SmartTv.volume);
        System.out.println("Canal: " + SmartTv.channel);

        SmartTv.on_off();

        System.out.println("Status: " + SmartTv.status);

        SmartTv.increaseVolume();
        SmartTv.increaseVolume();
        SmartTv.increaseVolume();

        System.out.println("Volume: " + SmartTv.volume);

        SmartTv.decreaseVolume();

        System.out.println("Volume: " + SmartTv.volume);

        SmartTv.changeChannel(10);

        System.out.println("Canal: " + SmartTv.channel);

    }
}

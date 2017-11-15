/**
 * Created by paudie on 09/11/2017.
 */
public class Radio {

    private String station;
    private String freq;
    private String savedChannels;
    private int volume;
    private String make;

    public String savedChannels(int num){
        if(num == 1)
        {
            return "2Fm is saved on number 1";
        }else if(num == 2)
        {
            return "Radio Kerry is saved on number 2";
        }else if(num == 3)
        {
            return "Spin Southwest is saved on number 3";
        }else if(num == 4)
        {
            return "Today FM is saved on number 4";
        }else
        {
            return "choose a channel";
        }
    }

    public String station(double stationChoice){
        if(stationChoice == 90.6){
            return "You are listening to 2FM";
        }else if (stationChoice == 102.2) {
            return "You are listening to TodayFM";
        }else if (stationChoice == 96){
            return "You are listening to Radio Kerry";
        }else{
            return "change the channel";
        }
    }

    public String freq(String freqChoice){
        if(freqChoice.equals("AM")){
            return "You are on Amplitude Modulation";
        }else{
            return "You are on Frequency Modulation";
        }
    }

    public String volume(int volumeButton){
        if(volumeButton == 1){
            return "It is low";
        }else if (volumeButton == 10) {
            return "It is medium";
        }else if (volumeButton == 20){
            return "It is really high";
        }else{
            return "turn it off";
        }
    }

}

/**
 * Created by paudie on 09/11/2017.
 */
public class Radio {

    public String station(String stationChoice){
        if(stationChoice.equals("90")){
            return "You are listening to 2FM";
        }else if (stationChoice.equals("102")) {
            return "You are listening to TodayFM";
        }else if (stationChoice.equals("96")){
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


}

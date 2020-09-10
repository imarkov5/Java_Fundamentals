import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("We Will Rock You", "Buddy, you're a boy, make a big noise");
        trackList.put("Shine On You Crazy Dimond", "Remember when you were young, you shone like the sun");
        trackList.put("Come As You Are", "Come as you are, as you were, As I want you to be");
        trackList.put("Stuck In The Middle With You", "Well I don't know why I came here tonight");

        String song = trackList.get("We Will Rock You");
        System.out.println(song);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + ": " + trackList.get(key));
        }
        //another way
        for(String key : trackList.keySet()){
            System.out.println(String.format("Track: %s - Lyrics: %s", key, trackList.get(key)));
        }
    }
}

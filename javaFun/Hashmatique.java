import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("One","Lyrics for One");
        trackList.put("Two","Lyrics for Two");
        trackList.put("Three","Lyrics for Three");
        trackList.put("Four","Lyrics for Four");



        Set<String> tracks = trackList.keySet();
        for(String track: tracks) {
            System.out.println(track);
            System.out.println(trackList.get(track));
        }
    }
   


}
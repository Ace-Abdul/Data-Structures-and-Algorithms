import java.util.*;

public class UniqueNewYork {
    public int seen(String[] records) {
        HashSet<String> set = new HashSet<>();

        for(String plate: records){
            String [] state = plate.split(",");
            for(String s: state){
                set.add(s);
            }

        }

        return set.size();
    }
}
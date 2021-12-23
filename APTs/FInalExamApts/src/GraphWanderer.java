import java.util.*;

public class GraphWanderer {
    int ret = 0;
    ArrayList<Integer> visited = new ArrayList<>();

    public int pathLength(String[] connections, int start){
        char[] c = connections[start].replaceAll(" ", "").toCharArray();
        Arrays.sort(c);
        String [] begin = connections[start].split(" ");
        Arrays.sort(begin);
        ArrayList<String> list = new ArrayList(Arrays.asList(begin));
        if(visited.containsAll(list)){
            return ret;
        }
        for(char n: c){
            if(! visited.contains(n)){
                ret++;
                int k = n - '0';
                pathLength(connections, k);
            }

        }
        return ret;
    }
}
import java.util.*;

public class OlympicCandles{
    public int numberOfNights(int[] candles){
        // write code
        int night =0;
        for (night=1; night<=candles.length; night ++){
            Arrays.sort(candles);
            for(int k = 1; k<=night; k++) {
                candles[candles.length - k]--;

                if(candles[candles.length - k]<0){
                    return night-1;
                }
            }

           
        }

        return night-1;
    }
}
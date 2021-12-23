public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        // fill in code here
        int [] hlacc = getCounts(headlines);
        int acc = 0;
        boolean add = true;

        for(String m: messages){
            int [] wc = getCounts(m.split(" "));
            for(int k = 97; k<123; k++){
                if(! (hlacc[k] >= wc[k])){
                    add = false;
                    break;
                }
                else{
                    add = true;
                }
            }
            if(add){
                acc++;
            }
        }

        return acc;
    }

    public int [] getCounts (String [] string){
        int [] counts = new int[123];
        for(String s: string) {
            for(char ch : s.toLowerCase().toCharArray()){
                counts[ch] ++;
            }
        }
        return counts;
    }
}
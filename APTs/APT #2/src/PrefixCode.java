public class PrefixCode {
    public String isOne(String[] words) {
        // fill in body of this function

        for(int k = 0; k<words.length; k++){
            String current = words[k];

            for(String s:words){

                if (s.startsWith(current) & s!=current){

                    return ("No, " + k);
                }
            }
        }
    return "Yes";}
}
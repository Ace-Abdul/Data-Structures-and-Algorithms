import java.util.*;
public class SerialNumbers {
    public String[] sortSerials(String[] numbers) {
        Arrays.sort(numbers, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                }
                if (s1.length() < s2.length()) {
                    return -1;
                }
                int sum1 = 0;
                int sum2 = 0;

                    for (int k=0; k<s2.length(); k++){
                        if (Character.isDigit(s1.charAt(k))){
                            sum1 += Character.getNumericValue(s1.charAt(k));
                        }
                        if (Character.isDigit(s2.charAt(k))){
                            sum2 += Character.getNumericValue(s2.charAt(k));
                        }
                    }

                if (sum1 > sum2) {
                    return 1;
                }
                if (sum1 < sum2) {
                    return -1;
                }

                return s1.compareTo(s2);
            }
        });

        return numbers;
    }

    public int charSum(String s) {
        int sum = 0;
        for (int k = 0; k < s.length(); k++) {
            if (Character.isDigit(s.charAt(k))) {
                sum += Character.getNumericValue(s.charAt(k));
            }
    }
        return sum;
}}
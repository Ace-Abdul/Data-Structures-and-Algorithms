import java.util.*;

public class FoodStart {
    public int count(String[] meals) {
        HashSet<Character> uninqueLetters = new HashSet<>();

        for(String meal : meals){
            for (String food: meal.split(":")){
                uninqueLetters.add(food.charAt(0));
            }
        }
        return uninqueLetters.size();
    }
}
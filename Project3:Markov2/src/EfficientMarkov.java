import java.util.*;

public class EfficientMarkov extends BaseMarkov {
	private Map<String,ArrayList<String>> myMap;
	
	public EfficientMarkov(){
		this(3);
	}

	public EfficientMarkov(int order) {
		super(order);
		myMap = new HashMap<>();
	}

	@Override
	public void setTraining(String text) {
		super.setTraining(text);
		//TODO: Clear and initialize myMap
		myMap.clear();
		//myMap=new HashMap<>();


		for(int index = 0; index < (myText.length() - myOrder + 1); index++){
			String current = myText.substring(index, index + myOrder);
			if(! myMap.containsKey(current)){
			myMap.put(current, new ArrayList<>());
			}
			//myMap.putIfAbsent(current, new ArrayList<>());
			if (index+myOrder>= myText.length()){
				myMap.get(current).add(PSEUDO_EOS);
				break;
			}
			myMap.get(current).add(myText.substring(index + myOrder, index + myOrder + 1));

			//if(! myMap.containsKey(current)){
			//	myMap.put(current, new ArrayList<>());
			//}

			//myMap.get(current).add(myText.substring(index+myOrder, index+myOrder+1));
		}

	}

	//TODO: Complete this method
	@Override
	public ArrayList<String> getFollows(String key) {

			if (! myMap.containsKey(key)){
				throw new NoSuchElementException(key+" not in map");
			}

		return myMap.get(key);
	}
}	

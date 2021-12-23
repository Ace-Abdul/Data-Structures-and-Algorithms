
/**
 * A WordGram represents a sequence of strings
 * just as a String represents a sequence of characters
 * 
 * @author: Ace Abdulrahman
 *
 */
public class WordGram {
	
	private String[] myWords;   
	private String myToString;  // cached string
	private int myHash;         // cached hash value

	/**
	 * Create WordGram by creating instance variable myWords and copying
	 * size strings from source starting at index start
	 * @param source is array of strings from which copying occurs
	 * @param start starting index in source for strings to be copied
	 * @param size the number of strings copied
	 */
	public WordGram(String[] source, int start, int size) {
		myWords = new String[size];
		myToString = ""; // Leave this alone, you'll change myToString in toString
		myHash = 0; //Leave this alone, you'll change myHash in hashCode
		int acc=0;

		// TODO: Initialize myWords
		for (int k = start; k<(start + size); k++){
			myWords[acc] = source[k];
			acc++;
		}
	}

	/**
	 * Return string at specific index in this WordGram
	 * @param index in range [0..length() ) for string 
	 * @return string at index
	 */
	public String wordAt(int index) {
		if (index < 0 || index >= myWords.length) {
			throw new IndexOutOfBoundsException("bad index in wordAt "+index);
		}
		return myWords[index];
	}

	@Override
	public String toString(){
		// TODO: Complete this method, assign to myToString as needed
		myToString = String.join(" ", myWords);
		return myToString;
	}

	@Override
	public int hashCode(){
		// TODO: complete this method: assign to myHash as needed
		myHash = this.toString().hashCode();
		return myHash;
	}

	@Override
	public boolean equals(Object o) {
		if (! (o instanceof WordGram) || o == null){
			return false;
		}
		WordGram com = (WordGram) o;

		if(! (com.length() == this.length())){
			return false;
		}
		for( int k= 0; k<myWords.length; k++){
			if (!( com.myWords[k].equals(this.myWords[k]))){
				return false;
			}
		}
		// TODO: Complete this method

		return true;
	}

	public int length(){
		// TODO: change this

		/*i
		nt k = 0;

		for(String s: myWords){
			k++;
		}
		*/
		return myWords.length;
	}

	public WordGram shiftAdd(String last) {
		WordGram New = new WordGram(myWords,0,myWords.length);
		//for(int k = 0; k< myWords.length-1; k++){
		//	myWords[k] = myWords[k+1];
		//}
		;

		WordGram wg = new WordGram(myWords,0,myWords.length);


		// TODO: Complete this method
		for(int k = 0; k< myWords.length-1; k++){
		wg.myWords[k] = myWords[k+1];
		}
		wg.myWords[myWords.length-1]= last;

		return wg;
	}
}

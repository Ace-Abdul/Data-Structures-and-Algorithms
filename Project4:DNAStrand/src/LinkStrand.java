public class LinkStrand implements IDnaStrand {
    private class Node{
        String info;
        Node next;
        public Node(String s){
            info = s;
            next = null;
        }
    }

    private Node myFirst,myLast;
    private long mySize;
    private int myAppends;
    private int myIndex;
    private Node myCurrent;
    private int myLocalIndex;

    public LinkStrand(){
        this("");
    }
    public LinkStrand(String s){
        initialize(s);
    }

    @Override
    public long size() {
        return mySize;
    }

    @Override
    public void initialize(String source) {
        myFirst = new Node(source);
        myIndex = 0;
        myCurrent = myFirst;
        myLocalIndex = 0;
        myLast = myCurrent;
        myAppends = 0;
        mySize = source.length();

    }

    @Override
    public IDnaStrand getInstance(String source) {
        return new LinkStrand(source);
    }

    @Override
    public IDnaStrand append(String dna) {
        Node nn = new Node (dna);
        myLast.next = nn;
        myLast = nn;
        myAppends++;
        mySize+= dna.length();
        return this;
    }

    @Override
    public IDnaStrand reverse() {
        StringBuilder fnc = new StringBuilder(this.myFirst.info);
        fnc.reverse();
        LinkStrand dup = new LinkStrand(fnc.toString());
        Node temp = this.myFirst.next;
        while(temp != null){
            dup.frontAppend(temp.info);
            dup.mySize += temp.info.length();
            temp = temp.next;
        }
        return dup;
    }
    private void frontAppend(String s){
        StringBuilder copy= new StringBuilder(s);
        copy.reverse();
        Node rev = new Node(copy.toString());
        rev.next = this.myFirst;
        this.myFirst= rev;
    }

    @Override
    public int getAppendCount() {
        return myAppends;
    }

    @Override
    public char charAt(int index) {
        if (index<0 || index>=mySize){
            throw new IndexOutOfBoundsException();
        }

        Node temp = myFirst;
        int end = myFirst.info.length();
        int begin = 0;

        if(index<myIndex) {
            temp = myFirst;
            end = myFirst.info.length();
            begin = 0;
            myCurrent = myFirst;
            myIndex=0;
            myLocalIndex=0;
        }

        if(index==(myIndex+1) ){
            myIndex+=1;
            myLocalIndex+=1;
            begin= myIndex - myLocalIndex;
            end = begin + myCurrent.info.length();
            temp = myCurrent;
        }

        while (index>=end) {
            temp = temp.next;
            begin = end;
            end += temp.info.length();
            myCurrent = temp;
        }
        myLocalIndex = index - begin;
        myIndex = myLocalIndex + begin;

        return temp.info.charAt(myLocalIndex);
    }

    @Override
    public String toString(){
        Node temp = myFirst;
        StringBuilder ret =  new StringBuilder();

        while(temp != null){
            ret.append(temp.info);
            temp = temp.next;
        }

        return ret.toString();
    }


}

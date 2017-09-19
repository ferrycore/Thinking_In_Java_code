import java.util.*;
public class TestForIterator implements Iterable<String>{
protected String[]words =("Hello My India Mi Fans").split(" ");
public Iterator<String>iterator(){
	return new Iterator<String>() {
     private int index =0;
     public boolean hasNext() {
    	 return index<words.length;
     }
	 public String next() {
		 return words[index++];
	 }
	//public void remove() {
	//throw new UnsupportedOperationException();	
	//}
	
	};
	
}
public static void main(String[]args) {
	for(String s:new TestForIterator()) {
		System.out.println(s+" ");
	}
}
}

import java.util.*;
class ReversibleArrayList<T>extends ArrayList<T>{
	public  ReversibleArrayList(Collection<T>c) {super(c);}
	public Iterable<T>reserved(){
		return new Iterable<T>() {
             public Iterator<T>iterator(){
            	 return new Iterator<T>(){
            	 	
            	 int current =size()-1;
            	 	
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return  current>-1;
			}
/**iterable迭代器用法
 * public Iterable<T>fucname(){
 * return new Iterble<T>{
 * public Iterator<T>iterator(){
 * return new Iterator<T>(){
 * 
 * 
 * }
 * 
 *简而言之 在一个产生Interable的方法中 在返回的Iterator方法中返回的Iterator中重写hasNextnext()函数
 */
			@Override
			public T next() {
				// TODO Auto-generated method stub
				return get(current--);
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
            	 };
           
            	 }
             };
			
		
	}
	public Iterable<String>randomsort(){
		return new Iterable<String>(){
        public Iterator<String>iterator(){
        	List<String>shuffled =new ArrayList<String>(Arrays.asList("12","111"));
        	Collections.shuffle(shuffled,new Random(33));
        	return shuffled.iterator();
        }
		};
		
	}
	}

public class AdapterMethodIdiom {
public static void main(String[]args) {
	ReversibleArrayList<String> ral =new ReversibleArrayList<String>(Arrays.asList("To be or not to be is a question".split(" ")));
	for(String s:ral)
		System.out.println(s);
	for(String s:ral.reserved())
		System.out.println(s);
}
}

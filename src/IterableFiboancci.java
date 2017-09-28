import java.util.Iterator;

public class IterableFiboancci extends Fibonacci implements Iterable<Integer> {
    private int n;
    public IterableFiboancci (int count) {
    	n =count;
    }
    
	@Override
	public Iterator<Integer> iterator() {
	
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return n>0;
			}

			@Override
			public Integer next() {

				n--;
				return IterableFiboancci.this.next();
			}
			
		};
	}
 public static void main(String[]args) {
	 for(int i:new IterableFiboancci(18)) {
		 System.out.println(i);
	 }
 }
}

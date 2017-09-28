
public class Fibonacci implements Generator<Integer>{
    private int count =0;
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fib(count++);
	}

	private int fib(int i) {
    if(i<2) return 1;
    else {
    	return fib(i-1)+fib(i-2);
    }
    
}
	public static void main(String []args) {
		Fibonacci fib1 =new Fibonacci();
		for(int i =0;i<18;i++) {
			System.out.println(fib1.next());
		}
	}
	}
																																																																																																																																																																							

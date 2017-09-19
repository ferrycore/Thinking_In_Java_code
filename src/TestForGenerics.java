import java.util.ArrayList;
//包访问权限的缘故 不得不设为Apple1
class Apple1{
	private static long counter;
	private final long id =counter++;
	public long id() {
		return id;
	}
}
public class TestForGenerics {
  public static void main(String[]args) {
	  ArrayList<Apple1>apples =new ArrayList<Apple1>();
	  for(int i=0;i<5;i++) {
		  apples.add(new Apple1());
		  Apple1 newapple =apples.get(i);
		  long id1 =newapple.id();
		 System.out.println(id1);
	  }
  }
	
}


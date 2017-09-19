
public class TestTheExtend {
public TestTheExtend(int i) {
System.out.print("this is from parent "+i);	

}

public static void main(String []args) {
	Test2 test2 =new Test2(11);
	
}
}
class Test2 extends TestTheExtend { 
	public Test2(int i) {
		super(i);
		//
	}

}


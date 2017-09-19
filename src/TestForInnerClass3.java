
abstract class Base {
public Base(int i){
	System.out.println("Base Constructor: "+i);
	
}
public abstract void f();
}
public class TestForInnerClass3 {
public static Base getBase(int i) {
	return new Base(i) {
//		{System.out.println("");}	
	public void f() {
	System.out.println("In anonymous f()");	
	}
	};
}
public static void main(String []args) {
	Base base = getBase(2);
	base.f();
}
}

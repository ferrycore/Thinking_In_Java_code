class MyException extends Exception{
  public MyException() {};
  public MyException(String msg) {
	  super(msg);
  }
}
public class FullConstructions {
public static void f() throws MyException{
System.out.println("Throwing MyException from f()");
throw new MyException();
}
public static void g() throws MyException{
System.out.println("Throwing MyException from g()");
throw new MyException("originated from g()");

}
public static void main(String []args) {
	try {
	g();	
	}catch(MyException e){
	e.printStackTrace();	
	}
}
}

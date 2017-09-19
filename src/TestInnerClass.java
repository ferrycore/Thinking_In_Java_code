
public class TestInnerClass {
  void f() {
	 System.out.println("outerclass.f()");
  }
  public class innerclass {
	public TestInnerClass getOuter() { 
		return TestInnerClass.this;
	}
  }
  public innerclass getinnerclass() {
	  return new innerclass();
  }
  public static void main(String []args) {
	 TestInnerClass outer =new TestInnerClass();
	 /**
	  * 以下为两种内函数的初始方法 第一种通过外部类创建内部类的初始化并获取方法
	  * 第二种无需创建额外获取方法使用Outerclass.new Innerclass()来实现
	  * 此外 TestInnerClass.InnerClass 和InnerClass 在如下两种情况下均可互用
	  */
	 TestInnerClass.innerclass Innerclass1=outer.getinnerclass();
	 innerclass Innerclass2=outer.new innerclass();
	 Innerclass1.getOuter().f();
	 Innerclass2.getOuter().f();
  }
}

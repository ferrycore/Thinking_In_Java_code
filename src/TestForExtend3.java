
public class TestForExtend3 {
public static void main(String []args) {
	Super ss =new Sub();
	int a1 =ss.field;
	int a2 =ss.getfield();
	System.out.println(a1);
	System.out.println(a2);
}
}
//我所理解的动态绑定：编译器虽然无法知晓对象的类型，但是方法调用机制能够找到正确的方法体，并加以调用
//本例子是针对两种特殊情况中的一种，即JAVA中除了static和final方法(包括private方法)，其他的方法都是后期绑定
//与此同时 任何域访问操作都是由编译器编译，所以并不是多态的

class Super {
public int field =0;
public int getfield() {
	return field;
}
}
class Sub extends Super {
public int field =1;
public int getfield() {
	return field;
}
public int getSuperField() {
	return super.field;
}

}

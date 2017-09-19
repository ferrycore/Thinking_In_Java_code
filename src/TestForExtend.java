
public class TestForExtend {

private String name;

//修改name的值
public void changeName(String str) {
name =str;	
}

//初始化
protected TestForExtend(String name) {
	this.name =name;
}

}
class test3 extends TestForExtend {
private int number;
protected test3(String name,int nume) {
		super(name);
		this.number =nume;
}

public void changeint(int nume,String nme) {
	changeName(nme);
	this.number =nume;
	
}

}

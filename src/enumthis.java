
public class enumthis {
money mon;	
public enumthis(money ss) {
this.mon =ss;	
}
public void search() {
	switch(this.mon) {
	case DOLLAR:
		System.out.println("this is the dollar");
		break;
	case POUND:
		System.out.println("this is the pound");
		break;
	}
	
}
public static void main(String []args) {
	enumthis it =new enumthis(money.DOLLAR);
	it.search();
}
}
 enum money {
	DOLLAR,POUND
}

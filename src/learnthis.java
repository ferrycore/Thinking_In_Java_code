
public class learnthis {
int i = 0;
learnthis increment(){
	i++;
	return this;
}
void print() {
	System.out.println("i = " + i);
	
}
public static void main(String[]args) {
	learnthis x =new learnthis();
	x.increment().increment().increment().print();
}
}

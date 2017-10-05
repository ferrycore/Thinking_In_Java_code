public class Classtest {
public static void main(String []args){
    Class c =null;
    try {
        c =Class.forName("toy");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        System.err.println("We cannot find the class");
    }
    System.out.println(c.getName());
    System.out.println(c.getSimpleName());
    System.out.println(c.getCanonicalName());
}
}
class toy{
    toy(){

    }
    toy(int i ){

    }
}
interface  HasButter{}

class babytoy extends toy implements HasButter{
babytoy(){
    super(1);
}
}

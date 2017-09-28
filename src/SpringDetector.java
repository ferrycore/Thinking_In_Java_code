import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class SpringDetector {
    public static <T extends Groudhog> void detectSpring (Class<T>type )throws Exception{
        Constructor<T> ghog =type.getConstructor(int.class);
        Map<Groudhog,Predication>map =new HashMap<Groudhog,Predication>();
        for(int i=0;i<10;i++){
            map.put(ghog.newInstance(i),new Predication());
            System.out.println("map ="+map);

        }Groudhog gh =ghog.newInstance(3);
        System.out.println(gh);
        if(map.containsKey(gh)){
            System.out.println(map.get(gh));
        }
        else{
            System.out.println("Key not found");
        }
    }
    public static void main(String []args)throws Exception{
      detectSpring(GroundHog2.class);
    }
}

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.lang.reflect.Parameter;

public class Groudhog {
    protected int number;
    public Groudhog(int n){
        number =n;
    }
    public String toString(){
      return "Groundhog#"+number;
    }
}


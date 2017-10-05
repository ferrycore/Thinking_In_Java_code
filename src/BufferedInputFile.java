import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
  public static String read(String filename)throws IOException{
      BufferedReader in =new BufferedReader(new FileReader(filename));
      String s;
      StringBuilder builder = new StringBuilder();
      while((s=in.readLine())!=null){
         builder.append(s);
      }
      in.close();
      return builder.toString();

  }

  public static void main(String []args)throws IOException{
    System.out.println(read("DirList.java"));
  }
}

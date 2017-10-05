import java.io.*;

public class BasicFileOutput {
    static  String filename ="textforoi";
    public static int linecount =1;
    public static void main(String []args)throws IOException{
        BufferedReader reader =new BufferedReader(new StringReader(BufferedInputFile.read("DirList2.java")));
        PrintWriter writer =new PrintWriter(new BufferedWriter(new FileWriter(filename)));
        String s;
        while ((s=reader.readLine())!=null){
            writer.println(linecount++ +":"+s);

        }
        writer.close();
        System.out.println(BufferedInputFile.read(filename));
    }
}

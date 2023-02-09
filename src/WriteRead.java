import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteRead {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter(new File("src/inputoutput/hello.txt"));

        pw.println("Hello World");



        PrintWriter pw2 = new PrintWriter(new File("src/inputoutput/password.txt"));

        for(int i =0; i<10; i++){
            pw2.println(getRandomString());
        }
        pw2.close();

    }
    public static String getRandomString(){
        String str ="";
        for(int i=0; i<5; i++){
            str += (char)(97+Math.random()*26);
        }
        return str;
    }
}

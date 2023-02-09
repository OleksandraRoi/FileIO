import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromTheFile {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner scanner = new Scanner(new File("src/inputoutput/password.txt"));

        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        List<String> passwords = new ArrayList<>();

        while(scanner.hasNext()){
            passwords.add(scanner.next());
        }
        System.out.println(passwords);

    }
}

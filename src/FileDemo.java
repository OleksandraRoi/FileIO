import java.io.File;

public class FileDemo {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Alexandra\\IdeaProjects\\FileIO\\src\\desctop.txt");

        File path = new File("src/desctop.txt");
        File path2 =new File("projectLevelFile.txt");

        System.out.println(path.exists());
    }
}

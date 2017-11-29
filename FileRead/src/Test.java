import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test {



    public static void main(String[] args)
    {
        String content;
        String track = "C:\\Users\\Ruhul Ameen\\IdeaProjects\\FileRead\\src\\file1.txt";

        FileReader file = null;

        try {
            file = new FileReader(track);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(file);

        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            System.out.println(line);
        }

    }
}

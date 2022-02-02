import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;



public class WordCountRun extends Thread {


    private final String filename;


    public WordCountRun(String filename) {

        this.filename = filename;

    }


    @Override
    public void run() {

        try {

            List<String> lines = Files.readAllLines(Paths.get(filename));



            int num = 0;

            for (String line : lines) {
                StringTokenizer st = new StringTokenizer(line);
                num += st.countTokens();
            }


            System.out.println(filename + ": " + num);

        }

        catch (IOException e){System.out.println(filename+" Invalid!");


        }

    }

}
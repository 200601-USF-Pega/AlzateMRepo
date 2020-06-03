import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;

public class Driver {
    public static void main(String[] args) throws IOException {

        File animalFile = new File("src/info.txt");
        animalFile.createNewFile();

        FileWriter fileWriter = new FileWriter(animalFile);
        Wolf wolf1 = new Wolf("Balto", 50);

        fileWriter.write(wolf1.toString());
        fileWriter.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(animalFile));
        String content = fileReader.readLine();

        System.out.println(content);


    }
}

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Filedemo {
    public static void main(String[] args) {

        File file = new File("abc.txt");

        try {
            // there we are create a file and try to write some info in this file
            FileWriter fw = new FileWriter(file);
            fw.write("Hey! I am Saurabh Kumar.\n");
            fw.write("From Bhopal and now I am working on Internship project.\n");
            fw.close();
            

            // there is filereader and buffered reader file operation 
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("File content:\n");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

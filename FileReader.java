import java.io.*;
import java.util.Scanner;

public class FileReader {
    public void readFile(String FileName) throws IOException {

        FileInputStream fileinputstream = null;
        Scanner inFS = null;
        String fileNum;

        FileOutputStream fileoutputstream = null;
        PrintWriter outFS = null;

        fileinputstream = new FileInputStream(FileName);
        inFS = new Scanner(fileinputstream);

        fileoutputstream = new FileOutputStream("ParkPhotoInfo.txt");
        outFS = new PrintWriter(fileoutputstream);


        while (inFS.hasNextLine()) {
            fileNum = inFS.nextLine();
            outFS.println(replaceLine(fileNum));
        }
        outFS.close();

    }
    public String replaceLine(String ogLine) {
        String regex = "photo.jpg";
        return ogLine.replaceAll(regex, "info.txt");
    }
}

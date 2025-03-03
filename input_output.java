import java.io.*;

public class input_output {
    public static void main(String[] args) throws IOException {
        FileReader filereader = new FileReader();
        filereader.readFile("ParkPhotos.txt");
    }
}
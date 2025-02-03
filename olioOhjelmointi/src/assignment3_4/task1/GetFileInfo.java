package assignment3_4.task1;
import java.io.*;

public class GetFileInfo {
    private final static String FILENAME = "olioOhjelmointi//src//assignment3_4//task1//temploki.csv";
    public static void main(String[] args) {
        BufferedReader bufferedstream = null;
        String line;
        boolean header = true;
        double averageTempature=0;

        try {
            bufferedstream = new BufferedReader(new FileReader(FILENAME));

            int count = 0;
            while (count<145) {
                if (header) {
                    header = false;
                    line = bufferedstream.readLine();
                }else {
                    line = bufferedstream.readLine();
                    String[] columns = line.split(";");
                    //System.out.println(columns[1]);
                    count++;
                    //averageTempature += Double.parseDouble(columns[1]);
                    averageTempature += Double.parseDouble(columns[1].replace(",", "."));
                    //System.out.println(line);
                    //System.out.println(averageTempature);
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            averageTempature /= 144;
            System.out.println(averageTempature);
            try {
                // we will close the stream only if we were able to open it
                if (bufferedstream != null)
                    bufferedstream.close();
            } catch (Exception e) {
                System.out.println("Error while closing the file " + FILENAME);
            }
        }
    }
}
package ua.lviv.iot.athletics.managers;

import ua.lviv.iot.athletics.models.Athletics;

import java.io.*;
import java.util.List;

public class AthleticsWriter {
    public void writeToFile(final List<Athletics> athletics) {
        File myFile = new File("result.csv");

        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw)) {

            for (Athletics athletic : athletics) {
                bufWriter.write(athletic.getHeaders());
                bufWriter.newLine();
                bufWriter.write(athletic.toCSV());
                bufWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

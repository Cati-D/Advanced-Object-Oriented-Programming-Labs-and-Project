package readwrite.write;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;

public class ObjectWriter <T> extends Writer {

    private static File file;

    public void writeData(T object, String type) {
        try {
            file = new File("C:\\Users\\Cati\\Desktop\\Uni\\II\\Sem2\\PAO\\Proiect\\src\\resources\\Audit.csv");
            FileWriter outputFile = new FileWriter(file, true);

            CSVWriter writer = new CSVWriter(outputFile);

            String[] messageCSV = {object.toString()};
            writer.writeNext(messageCSV);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

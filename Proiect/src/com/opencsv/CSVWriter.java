package com.opencsv;

/**
 * trebuie sa fac si corpul functiilor, momentan nu am avut o idee exacta cum
 */

import java.io.*;

public class CSVWriter {
    FileWriter fileWriter;

    public CSVWriter(FileWriter output) throws IOException {
        fileWriter = new FileWriter(String.valueOf(output));
    }

    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new File(""))) {//NU UITA SA REVII AICI!!!

            StringBuilder sb = new StringBuilder();

            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeNext(String[] messageCSV) {

    }

    public void close() {
    }
}

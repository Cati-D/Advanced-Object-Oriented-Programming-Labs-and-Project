package com.opencsv;

/**
 * trebuie sa fac si corpul functiilor, momentan nu am avut o idee exacta cum
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public CSVReader(FileReader fileReader, char c, int i) {
    }

    public static void main(String[] args) {

        String csvFile = "";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] character = line.split(csvSplitBy);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String[] readNext() {
        return new String[0];
    }
}

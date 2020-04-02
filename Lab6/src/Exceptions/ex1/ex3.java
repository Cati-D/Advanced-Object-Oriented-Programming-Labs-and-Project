package Exceptions.ex1;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        int a, b;
        try {
            createFile();
            Scanner scanner = new Scanner(new File("test.txt"));
            a = scanner.nextInt();
            b = scanner.nextInt();
            double result = a / b;
            System.out.println(result);
            scanner.close();
        } /*catch (IOException e) {
            e.printStackTrace();
            e = new IOException();
        } catch (NoSuchElementException e) {
            System.out.println(e);
            //result= 0;
            a = 0;
        }catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
            //scanner
            b = 0;
        }*/
        catch (IOException | NoSuchElementException | ArithmeticException e){
            System.out.println(e);//este implicit finala, tipurile de exceptii trebuie sa fie disjuncte (sa nu faca parte din aceeasi ierarhie de exceptii)
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
            b = 0;//mai intai exceptii pe claseel simple si apoi pe superclase, incercarea exceptiilor cat mai granulare
        }


    }

    static void createFile() throws IOException {
        File file = new File ("test.txt");
        if (file.createNewFile()) {
            System.out.println("file created");
        } else {
            System.out.println("file already exists.");
        }
        throw new IOException("io exception while creating file.");
    }
}

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("Введите путь к файлу для считывания: ");
        Scanner scanR = new Scanner(System.in);
        String pathRead = scanR.next();
        File FileRead = new File(pathRead);
        System.out.println("Введите путь к файлу для записи: ");
        Scanner scanW = new Scanner(System.in);
        String pathWrite = scanW.next();
        File FileWrite = new File(pathWrite);
        ReaderAndSaver ras = new ReaderAndSaver();
        ras.ReadWrite(pathRead,pathWrite);
    }
}

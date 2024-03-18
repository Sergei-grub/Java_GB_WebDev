package Task1.ru.gb.start;

import Task1.ru.gb.date.GetDate;
import Task1.ru.gb.toFile.FileWrite;
import java.util.Scanner;

public class StartTest {
    public static void main(String[] args) {

        System.out.print("Введите заметку: ");
        Scanner in = new Scanner(System.in);
        String note = in.nextLine();

        System.out.println(note);

        GetDate date = new GetDate();
        String strOut = date + note + "\n";
        System.out.println(strOut);


        String path = args[0] + "MyNote.txt";
        FileWrite testFile = new FileWrite();
        testFile.FileWriter(path, strOut);
    }
}
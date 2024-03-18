package Task1.ru.gb.toFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public void FileWriter(String path, String note) {


        try
        {
            FileWriter fileWriter = new FileWriter(path, true);
            fileWriter.write(note);
            fileWriter.close();
            System.out.println("Запись успешно добавлена в файл!");
        } catch(
                IOException e)

        {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}


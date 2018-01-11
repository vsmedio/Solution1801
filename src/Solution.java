import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner consoleReader = new Scanner(System.in);

        FileInputStream f = new FileInputStream(consoleReader.nextLine());

        int max = 0;
        if (f.available() > 0)
            max = f.read();
        while (f.available() > 0) {
            int value = f.read();
            if (max < value)
                max = value;
        }
        System.out.println(max);
        f.close();
    }
}
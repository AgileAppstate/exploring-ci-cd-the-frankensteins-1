import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountStuff{
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++){
                String fileName = args[i];

                File in = new File(fileName);

                Scanner read = new Scanner(in);

                int characters = 0;
                int lines = 0;

                while (read.hasNextLine()) {
                    String line = read.nextLine();
                    characters += line.length();
                    lines += 1;
                }

                System.out.printf("%s, characters: %d, lines: %d", fileName, characters, lines);
            }
        }
    }
}
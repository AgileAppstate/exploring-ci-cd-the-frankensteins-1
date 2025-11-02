import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountStuff{
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length > 0) {
            //Doing it this way so the scanner can be closed
            int i = 0;
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

            System.out.printf("%s, characters: %d, lines: %d\n", fileName, characters, lines);

            i++;
            while (i < args.length)
            {
                fileName = args[i];

                in = new File(fileName);

                read = new Scanner(in);

                characters = 0;
                lines = 0;

                
                while (read.hasNextLine()) {
                    String line = read.nextLine();
                    characters += line.length();
                    lines += 1;
                }

                System.out.printf("%s, characters: %d, lines: %d\n", fileName, characters, lines);
                
                i++;
            }
            read.close();
        }
    }
}
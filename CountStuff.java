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
            int wordCount = 0;

            
            while (read.hasNextLine()) {
                String line = read.nextLine();
                characters += line.length();
                lines += 1;

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                    }
                }

            System.out.printf("%s, characters: %d, lines: %d, words: %d\n", fileName, characters, lines, wordCount);
            read.close();

            i++;
            while (i < args.length)
            {
                fileName = args[i];

                in = new File(fileName);

                read = new Scanner(in);

                characters = 0;
                lines = 0;
                wordCount = 0;
                
                while (read.hasNextLine()) {
                    String line = read.nextLine();
                    characters += line.length();
                    lines += 1;

                    String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                    }
                }

                System.out.printf("%s, characters: %d, lines: %d, words: %d\n", fileName, characters, lines, wordCount);
                
                i++;
            }
            read.close();
        }
    }
}
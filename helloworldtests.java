import java.io.ByteArrayOutputStream;     
import java.io.PrintStream;

// import static org.junit.test.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

 public class helloworldtests {
    private ByteArrayOutputStream baos;
    private PrintStream oldOut;

    @BeforeEach
    public void beforeEach()
    {
        this.oldOut = System.out;
        this.baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }

    @AfterEach
    public void afterEach()
    {
        System.setOut(oldOut);
    }

    @Test
    public void testMainPrintsHelloWorld() {
        // Call the main method
        helloworld.main(new String[] {});

        // Capture printed output
        String output = baos.toString().trim();

        // Verify it printed "Hello World"
        assertEquals("Hello World", output);
    }
}

package snippets.s12_pipedInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Program01 {
    public static void main(String[] args) throws IOException {
        PipedInputStream pin = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pin);

        PipedInputOutputTest p1 = new PipedInputOutputTest(System.in,pos);
        PipedInputOutputTest p2 = new PipedInputOutputTest(pin,System.out);

        p1.start();
        p2.start();
    }
}

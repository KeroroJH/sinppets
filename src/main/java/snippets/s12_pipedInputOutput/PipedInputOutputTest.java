package snippets.s12_pipedInputOutput;

import java.io.InputStream;
import java.io.OutputStream;

public class PipedInputOutputTest extends Thread{
    private InputStream in;
    private OutputStream out;

    public PipedInputOutputTest(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public void run() {
        doWork();
    }

    void doWork(){
        byte[] buf = new byte[1024];
        int count = 0;
        try {
            while (true) {
                count = in.read(buf);
                if (count != -1) {
                    out.write(buf, 0, count);
                } else {
                    return;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

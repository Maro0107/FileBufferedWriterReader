import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args)throws IOException {

        BufferedWriter bw = null;

        try {

            bw = new BufferedWriter(new FileWriter("files\\test.txt"));

            for (int i = 0; i < 5; i++){
                bw.write(i + " new text"  + "\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {

            if (bw != null) bw.close();

        }

    }
}

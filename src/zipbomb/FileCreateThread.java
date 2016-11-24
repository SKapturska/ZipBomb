package zipbomb;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileCreateThread implements Runnable{
    String fileName;
    
    public FileCreateThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try{
            DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName));
            Random r = new Random();
            for(int i = 0;i < 1000000;i++){
                dataOut.writeByte(r.nextInt(256));
            }
            dataOut.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}

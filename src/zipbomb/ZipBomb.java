package zipbomb;

public class ZipBomb{

    public static void main(String[] args) {
       for(int i = 0;i < 10;i++){
           new Thread(new FileCreateThread(i+".bin")).start();
       }
        
    }
    
}

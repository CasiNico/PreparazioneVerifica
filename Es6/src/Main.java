import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\nicoc\\OneDrive\\Desktop\\CARTELLE\\PreparazioneVerifica\\Es6\\src\\input.txt");
            boolean vuoto = true;
            int c;
            int parole = 0;
            while((c = fr.read())!= -1){
                vuoto = false;
                if((char) c == ' '){
                    parole++;
                }
            }
            if(!vuoto){
                parole++;
            }
            System.out.println("Parole: " + parole);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
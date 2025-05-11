import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci percorso file");
        try{
            FileReader fr = new FileReader(in.next());
            int c;
            while((c = fr.read()) != -1){
                System.out.print((char) c);
            }
            fr.close();
        }catch(IOException e){
            e.getMessage();
        }
    }
}
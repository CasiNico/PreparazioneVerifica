import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BufferedReader br;
        BufferedWriter bw;
        System.out.print("Percorso assoluto file: ");
        String filePath = in.next();
        File f = new File(filePath);
        System.out.print("Inserire il percorso del file dove verrà copiato il contenuto del testo: ");
        String pathFileCopia = in.next();
        if (!f.exists()) {
            System.out.println("Il file non esiste");
        } else if (f.isDirectory()) {
            System.out.println("il percorso non è un file");
        } else {
            try {
                br = new BufferedReader(new FileReader(filePath));
                bw = new BufferedWriter(new FileWriter(pathFileCopia, true));
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line + "\n");
                }
                bw.flush();
                bw.close();
                br.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
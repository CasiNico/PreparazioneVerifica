import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File file = new File("input.txt");
        HashMap<Integer, String> righe = new HashMap<>();
        try {
            // lettura del file e inserimento in hashmap
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            String linea;
            int numRiga = 1;
            while((linea = raf.readLine()) != null){
                righe.put(numRiga, linea);
                numRiga++;
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        // stampa del contenuto dell'HashMap
        System.out.println("contenuto del file:");
        for(int i = 0; i <= righe.size(); i++){
            System.out.println(righe.get(i));
        }

        // scelta della riga da modificare
        System.out.print("quale riga vuoi modificare? ");
        int rigaDaModPosition = in.nextInt();
        if(rigaDaModPosition <= 0 || rigaDaModPosition > righe.size()){
            System.out.println("Numero riga non possibile");
        } else{
            try {
                RandomAccessFile raf = new RandomAccessFile(file, "rws");
                System.out.println("Modifica riga " + rigaDaModPosition);
                System.out.print("Inserire contenuto: ");
                String rigaMod = in.nextLine();
                String rigaDaModContent = "";
                while(raf.readLine() != righe.get(rigaDaModPosition)){
                    raf.
                }
                raf.
            } catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
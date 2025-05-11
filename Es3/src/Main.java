import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nome file: ");
        try{
            FileWriter fw = new FileWriter(in.nextLine(), true);
            System.out.println("Inserisci 5 righe di testo:");
            for(int i = 1; i <= 5; i++){
                System.out.print("Riga: " + i + ": ");
                fw.write(in.nextLine() + "\n");
            }
            System.out.println("Righe salvate sul file");

            fw.flush();
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
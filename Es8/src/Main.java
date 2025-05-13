import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Gson gson = new Gson();
        ArrayList <Persona> persone = new ArrayList<>();

        // creazione persone
        for(int i = 0; i < 5; i++){
            System.out.print("Nome Persona: ");
            String tempNome = in.next();
            System.out.print("Cognome persona: ");
            String tempCognome = in.next();
            System.out.print("Età persona: ");
            int tempEta = in.nextInt();
            persone.add(new Persona(tempNome, tempCognome, tempEta));
        }

        // persone da arraylist a json (toJson)
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("lista_persone.json", true));
            for (int i = 0; i < persone.size(); i++){
                bw.write(gson.toJson(persone.get(i)) + "\n");
            }
            bw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
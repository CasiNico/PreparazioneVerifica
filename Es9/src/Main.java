import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<Persona> persone = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader( new FileReader("lista_persone.json"));
            String jsonToAL;
            while((jsonToAL = br.readLine()) != null){
                persone.add(gson.fromJson(jsonToAL, Persona.class));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        for(int i = 0; i < persone.size(); i ++){
            System.out.println(persone.get(i).toString());
        }
    }
}
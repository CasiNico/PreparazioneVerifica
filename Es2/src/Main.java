import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader(in.nextLine()));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
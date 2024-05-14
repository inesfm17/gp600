package Lab01;
import java.util.List;
import Utils.Utils;

public class WSSolver {
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("Usage: Lab01/java WSSolver [sdl_01.txt]"); 
            System.exit(1); 
        }

        String filename = args[0];
        List <String> fileLines = Utils.readFile(filename);
        Sopa sopa = new Sopa(fileLines);
        // obtem e imprime os resultados finais
        System.out.println(sopa.Results()); 
    }
}

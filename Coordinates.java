package Lab01; 

public class Coordinates {
    int x;
    int y; 

    public Coordinates (int x, int y){
        this.x = x; 
        this.y = y; 
    }

    public boolean equals(Object objeto){
        //Se for comparado a ele próprio e for igual -> true 
        if (objeto == this){
            return true; 
        }
        //Verifica se objeto é instancia de Coordinates
        if (!(objeto instanceof Coordinates)){
            return false; 
        }
        //Criar o objeto c 
        Coordinates c = (Coordinates) objeto; 
        //Verifica se as coordenadas do objeto atual são as mesmas que as do objeto criado(c)
        return x == c.x && y == c.y; 
    }
}



package Lab05.V1;

import java.util.ArrayList;
import java.util.List;

public class Rental {
    private String nome;
    private String telemovel; 
    private String email; 
    private List<Veiculo> stock; 

    public Rental(String nome, String telemovel, String email){
        this.nome = nome;
        this.telemovel = telemovel;
        this.email = email; 
        this.stock = new ArrayList<>();  
    }

    public String getNome(){
        return nome; 
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelemovel(){
        return telemovel; 
    }

    public void setTelemovel(String telemovel){
        this.telemovel = telemovel; 
    }

    public String getEmail(){
        return email; 
    }

    public void setEmail(String email){
        this.email = email; 
    }

    // Está a adicionar um veiculo ao stock da empresa de alugar
    public void addVeiculo(Veiculo veiculo){
        stock.add(veiculo); 
    }

    // Lista de veiculos disponiveis para alugar 
    public List<Veiculo> getStock(){
        return stock; 
    }

}

package modelo;

public class Hotel {
    
    int hotelID;
    String nome;
    String cidade;
    int quartos;
    double valorDiaria;
    int estrelas;

    public int getHotelID(){
        return hotelID;
    }
    
    public void setHotelID(int hotelID){
        this.hotelID = hotelID;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
        public String getCidade(){
        return cidade;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public int getQuartos(){
        return quartos;
    }
    
    public void setQuartos(int quartos){
        this.quartos = quartos;
    }
    
    public double getValorDiaria(){
        return valorDiaria;
    }
    
    public void setValorDiaria(double valorDiaria){
        this.valorDiaria = valorDiaria;
    }
    
    public int getEstrelas(){
        return estrelas;
    }
    
    public void setEstrelas(int estrelas){
        this.estrelas = estrelas;
    }

}


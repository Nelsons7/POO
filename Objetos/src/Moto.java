public class Moto {
    // definindo os atributos
    String marca;
    String modelo;
    int ano;
    float valor;
    boolean ligada;

    void ligar(){
        System.out.println("Ligado");
        this.ligada = true;
    }
    void desligar(){
        System.out.println("Desligado");
        this.ligada = false;
    }
    
    void acelerar(){
        System.out.println("RAN DANN DANN DANNN!!");
    }
}

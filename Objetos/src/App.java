public class App {
    public static void main(String[] args) throws Exception {
       
        // criando novo objeto 1
        System.out.println("________________________________");
        System.out.println("########### NOTEBOOK ###########");
        
        Notebook pc = new Notebook();        
      
        pc.marca = "Acer Nitro";
        pc.processador = "I5 8th";
        pc.ligado = true;
        
        System.out.println("Marca: "+pc.marca);
        System.out.println("Processador: "+pc.processador);
        System.out.println();

        //metodos
        pc.ligar();
        pc.digitar();

        System.out.println("____________________________");
        System.out.println("########### MOTO ###########");
        // criando novo objeto 2
        Moto motocicleta = new Moto();
        
      
        motocicleta.marca = "Yamaha";
        motocicleta.modelo = "MT-03";
        motocicleta.ano = 2020;
        
        System.out.println("Marca: "+motocicleta.marca);
        System.out.println("Modelo: "+motocicleta.modelo);
        System.out.println("Ano: "+motocicleta.ano);
        System.out.println();

        //metodos
        motocicleta.ligar();
        motocicleta.acelerar();
        motocicleta.desligar();
       
    }
}

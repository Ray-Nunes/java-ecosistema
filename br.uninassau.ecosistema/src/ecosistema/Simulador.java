package ecosistema;

import java.util.Scanner; 

public class Simulador {
    public static void main(String[] args) {
        Ecossistema ecossistema = new Ecossistema();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é a quantidade de lobos: ");
        int quantidadeLobos = scanner.nextInt();

        System.out.print("Qual é a quantidade de coelhos: ");
        int quantidadeCoelhos = scanner.nextInt();

        // Criar seres vivos
      
       Lobo lobo = new Lobo("lobo alfa" , quantidadeLobos, 10, 'f' , true);
 	   ecossistema.adicionarServivo(lobo);
 	   
 	  Coelho coelho = new Coelho("Coelho " ,quantidadeCoelhos, 10, 'm' ,false);
	   ecossistema.adicionarServivo(coelho);
        
        for (SerVivo serVivo : ecossistema.getSeresVivos()) {
            if (serVivo instanceof Animal) {
                Animal animal = (Animal) serVivo;
                System.out.println(animal.getNome() + ":");
                animal.comer(quantidadeCoelhos);
                animal.morrer(quantidadeCoelhos);
                animal.reproduzir();
                System.out.println();
                

                
            }
            
        }
    }
}

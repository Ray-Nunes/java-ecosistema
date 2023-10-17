package ecosistema;

public class Animal extends SerVivo {
	private boolean predador;
	

	public Animal(String nome, int qtdAnimal, int idade, char sexo, boolean predador) {
		super(nome, qtdAnimal, idade, sexo, predador);
		this.predador = predador;

	}

	public void comer(int quantidadeCoelhos) {
		int cont = quantidadeCoelhos;
		int ii = idade;
		
		for( ii = 1; ii<=10; ii++) { 
			System.out.println(nome + " esta envelhecendo e sua idade e de " + ii + " anos");
			System.out.println("_____________________________________________________");
		
		for (int i = 0; i < cont; i++) {
			
		}
			if (predador && quantidadeCoelhos > 0) {
				System.out.println(nome + " comeu um coelho agora so resta " + (quantidadeCoelhos) + " coelho ");
				System.out.println("-----------------------");
				quantidadeCoelhos--;
				
				
			} else if (quantidadeCoelhos <= 0) {
				System.out.println(nome + " está com fome, mas nao ha coelhos para comer.");
				System.out.println("-----------------------");
			} else {
				System.out.println(nome + " esta se alimentando de plantas.");
				System.out.println("-----------------------");
			}
			
		}
	}
	
	public void reproduzir() {
    	
        if (predador) {
        	
            System.out.println(nome + " está se reproduzindo.");
            
        } else {
            System.out.println(nome + " ainda não tem idade para se reproduzir.");
        }
    }
	 public void morrer (int idade) {
			if(this.idade == 10) {
				 System.out.println("|----------------------|" );
				 System.out.println(nome + "morreu de idade |");
				 System.out.println("|----------------------|" );
			}
	 }

	public String getNome() {
		return nome;
	}

	public boolean getPredador() {
		return predador;
	}

}

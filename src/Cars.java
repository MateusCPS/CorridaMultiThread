import java.util.Random;

public class Cars extends Thread{
	int carro;
	int velocidade;
	int distancia;
	float acel;
	Random random;
	long tempoInicial;
	long tempoFinal;
	int chegada;
	int offSet;
	int offSetTotal;
	
	public Cars(int chegada, int carro)
	{
		this.chegada = chegada;
		this.carro = carro;
		random = new Random();
	}
	
	public void RandomAccelerator() {
		this.acel = random.nextInt(10) + 1;
	}
	

	public void run()
	{
		for(int i = 0; distancia < chegada; i++) {
			tempoInicial = System.currentTimeMillis();
				
					RandomAccelerator();
					velocidade = (int) (velocidade + (acel * tempoFinal));
					
					
					offSet = (int) (velocidade * tempoFinal);
					offSetTotal += offSet;
					
					distancia = distancia + offSet;
					
					if(distancia > 0)
					{
						System.out.println("Carro " + carro + " Andou " + offSet + "m e ja percorreu: " + offSetTotal + "m");
					}
					tempoFinal += System.currentTimeMillis() - tempoInicial;
					
					
					if(offSetTotal >= chegada) {
						System.out.println("Carro " + carro + " Chegou ao seu destino");
					}
			}
	}

	
	
}

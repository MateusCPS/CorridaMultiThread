
public class Cars extends Thread{
	int carro;
	int velFinal;
	int desFinal;
	float acel;
	long tempoInicial;
	long tempoFinal;
	int chegada;
	int offSet;
	int offSetTotal;
	
	public Cars(int chegada, int carro)
	{
		this.chegada = chegada;
		this.carro = carro;
	}
	
	public void RandomAccelerator() {
		this.acel = (float) Math.random() * 10;
	}
	
	
	public void run()
	{
		for(int i = 1; desFinal < chegada; i++) {
			tempoInicial = System.currentTimeMillis();
				
					RandomAccelerator();
					velFinal = (int) (velFinal + (acel * tempoFinal));
					
					
					offSet = (int) (velFinal * tempoFinal);
					offSetTotal += offSet;
					
					desFinal = desFinal + offSet;
					
					
					System.out.println("Carro " + carro + " Andou " + offSet + "m e ja percorreu: " + offSetTotal + "m");
					tempoFinal += System.currentTimeMillis() - tempoInicial;
					
					if(offSetTotal >= chegada) {
						System.out.println("Carro " + carro + " Chegou ao seu destino");
					}
			}
	}
}

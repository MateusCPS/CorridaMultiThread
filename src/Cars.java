
public class Cars extends Thread{
	int carro;
	int velInicial;
	int velFinal;
	int desInicial;
	int desFinal;
	float acel;
	long tempoInicial;
	long tempoFinal;
	int chegada;
	int offSet;
	int offSetTotal;
	
	public Cars(int velInicial,int desInicial,int chegada, int carro)
	{
		this.velInicial = velInicial;
		this.desInicial = desInicial;
		this.chegada = chegada;
		this.carro = carro;
	}
	
	public void RandomAccelerator() {
		this.acel = (float) Math.random() * 2;
	}
	
	
	public void run()
	{
		for(int i = 1; desFinal < chegada; i++) {
			tempoInicial = System.currentTimeMillis();
				if(tempoInicial != 0) {
					RandomAccelerator();
					velFinal = (int) (velInicial + (acel * tempoFinal));
					velInicial = velFinal;
					
					
					desFinal = desInicial + offSet;
					desInicial = desFinal;
					
					offSetTotal += offSet;
					offSet = (int) (velFinal * tempoFinal);
					
					
					System.out.println("Carro " + carro + " Andou " + offSet + "m e ja percorreu: " + offSetTotal + "m");
					tempoFinal += System.currentTimeMillis() - tempoInicial;
				}
			}

		if(desFinal >= chegada) {
			System.out.println("Carro " + carro + " Chegou ao seu destino");
		}
	}
}

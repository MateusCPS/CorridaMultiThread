
public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chegada = 150;
		int nThreads = 2;
		int carro = 0;
		float accel;
		
		Cars cars[] = new Cars[nThreads];
		
		for(int i = 0; i < nThreads; i++) {
			carro++;
			cars[i] = new Cars(1, 1, chegada, carro);
		}
		
		
		for(int i = 0; i < nThreads; i++) {
			cars[i].start();
		}
		
	}

}
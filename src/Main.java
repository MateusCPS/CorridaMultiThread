
public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chegada = 150;
		int nThreads = 2;
		int carro = 0;
		
		Cars cars[] = new Cars[nThreads];
		
		for(int i = 0; i < nThreads; i++) {
			carro++;
			cars[i] = new Cars(chegada, carro);
			
		}
		
		for(int i = 0; i < nThreads; i++) {
			cars[i].start();
		}
		
		for(int i = 0; i < nThreads; i++) {
			try {
				cars[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package Thread;

public class ThreadID extends Thread{
	
	public String idThread;
	
	public ThreadID(int count) {
		count = 1;
		for (int i = 1 ; i >= 21 ; i++) {
			if (count%3==1) {
				idThread = "Calculos de 0,2 a 1,0 segundos \n Transacoes de BD por 1 segundo;";
				count++;
			}
				if(count%3==2) {
					idThread = "Calculos de 0,5 a 1,5 segundos \n Transacoes de BD por 1,5 segundos;";
					count++;
				}
				else {
					idThread = "Calculos de 1 a 2 segundos \n Transacoes de BD por 1,5 segundos;";
					count++;
				}
		}
	}
	@Override
	public void run() {
		
		System.out.println(idThread);
	}
	
}
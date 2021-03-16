package main;

import Thread.ThreadID;

public class main extends Thread{
	
	public static void Main(String [] args) {
		
		for (int idThread = 0 ; idThread <5 ; idThread++) {
			Thread threadId = new ThreadID(idThread);
			threadId.start();
		}
	}
}

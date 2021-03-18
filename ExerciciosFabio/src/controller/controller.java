package controller;

import javax.swing.*;

public class controller {
	private static int lista_d[];
	private static int tamanho = 0;
	private static int sus;
	private static int posicao;
	public static void Main(String [] args) {
		sus = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira 1 para verificar se a lista esta vazia; " + "Insira 2 para adicionar uma temperatura no inicio da lista; " + "Insira 3 para adicionar uma temperatura no final da lista; " + "Insira 4 para adicionar uma temperatura em uma determinada posicao da lista; " + "Insira 5 para remover a temperatura do inicio da lista e retornar o valor removido; " + "Insira 6 para remover a temperatura donfinal da lista e retornar o valor removido; " + "Insira 7 para remover a temperatura de uma determinada posicao e retornar o valor removido; " + "Insira 8 para mostrar todas as temperaturas da lista."));
		switch (sus) {
			case 1:
				if (tamanho == 0){
					System.out.print("true");
				}
				else {
					System.out.println("false");
				}
				break;
				
			case 2:
				if (lista_d[0] == 0) {
					lista_d[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor a ser adicionado no inicio da fila:"));
					tamanho++;
				}
				else {
					System.out.println("A operacao nao pode ser concluida.");
				}
				break;
				
			case 3:
				if (lista_d[tamanho] == 0) {
					lista_d[tamanho] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor a ser adicionado no final da fila:"));
					tamanho++;
				}
				else {
					System.out.println("A operacao nao pode ser concluida.");
				}
				break;
				
			case 4:
				
				if (lista_d[posicao] == 0) {
					lista_d[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser adicionado na posicao especifica da fila"));
					tamanho++;
				}
				else {
					System.out.println("A operacao nao pode ser concluida.");
				}
				break;
				
			case 5:
				if (lista_d[0] != 0) {
					System.out.println(lista_d[0]);
					lista_d[0] = (Integer) null;
					tamanho--;
				}
				else {
					System.out.println("A operacao nao pode ser concluida.");
				}
				break;
				
			case 6:
				if (lista_d[tamanho] != 0) {
					System.out.println(lista_d[tamanho]);
					lista_d[tamanho] = (Integer) null;
					tamanho--;
				}
				else {
					System.out.println("A operacao nao pode ser concluida.");
				}
			case 7:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Insira uma posicao de 0 a 10"));
				if (lista_d[posicao] != 0) {
					System.out.println(lista_d[posicao]);
					lista_d[posicao] = (Integer) null;
					tamanho--;
				}
				else {
					System.out.println("A operacao nao pode ser concluida.");
				}
				break;
				
			case 8:
				for (int i = 0 ; i >= 10 ; i++) {
					System.out.println(lista_d[i]);
					i++;
				}
				break;
				
			default:
				System.out.println("Codigo invalido, insira o valor corretamente.");
		}
	}
}

package controller2;

import javax.swing.JOptionPane;

public class aluno {
	private static String listaAlunos[][];
	private static String nome;
	private static String RA;
	private static String turma;
	private static int posicao;
	private static int susp;
	public static void Main(String [] args) {
		
	susp = Integer.parseInt(JOptionPane.showInputDialog("Insira 1 para adicionar um aluno ao final da lista " + "Insira 2 para adicionar um aluno no inicio da lista " + "Insira 3 pra adicionar um aluno no meio da lista " + "Insira 4 para remover um aluno do final da lista " + "Insira 5 para remover um aluno do inicio da lista " + "Insira 6 para remover um aluno do meio da lista " + "Insira 7 para apresentar a lista de alunos  "));
	switch (susp) {
		case 1:
			nome = String.valueOf(JOptionPane.showInputDialog("Insira o nome do aluno"));
			RA = String.valueOf(JOptionPane.showInputDialog("Insira o RA do aluno"));
			turma = String.valueOf(JOptionPane.showInputDialog("Insira a turma do aluno"));
			listaAlunos[14][0] = nome;
			listaAlunos[14][1] = RA;
			listaAlunos[14][2] = turma;
			break;
			
		case 2:
			nome = String.valueOf(JOptionPane.showInputDialog("Insira o nome do aluno"));
			RA = String.valueOf(JOptionPane.showInputDialog("Insira o RA do aluno"));
			turma = String.valueOf(JOptionPane.showInputDialog("Insira a turma do aluno"));
			listaAlunos[0][0] = nome;
			listaAlunos[0][1] = RA;
			listaAlunos[0][2] = turma;
			break;
		
		case 3:
			nome = String.valueOf(JOptionPane.showInputDialog("Insira o nome do aluno"));
			RA = String.valueOf(JOptionPane.showInputDialog("Insira o RA do aluno"));
			turma = String.valueOf(JOptionPane.showInputDialog("Insira a turma do aluno"));
			posicao = Integer.parseInt(JOptionPane.showInputDialog("insira a posicao da lista que sera inserido o aluno"));
			listaAlunos[posicao][0] = nome;
			listaAlunos[posicao][1] = RA;
			listaAlunos[posicao][2] = turma;
			break;
			
		case 4:
			listaAlunos[14][0] = null;
			listaAlunos[14][1] = null;
			listaAlunos[14][2] = null;
			break;
			
		case 5:
			listaAlunos[0][0] = null;
			listaAlunos[0][1] = null;
			listaAlunos[0][2] = null;
			break;
		
		case 6:
			posicao = Integer.parseInt(JOptionPane.showInputDialog("insira a posicao da lista que sera removido o aluno"));
			listaAlunos[posicao][0] = null;
			listaAlunos[posicao][1] = null;
			listaAlunos[posicao][2] = null;
			break;
			
		case 7:
			for (int i = 0 ; i >= 15 ; i++) {
				for (int j = 0 ; j >= 2 ; j++){
					System.out.println(listaAlunos[i][j]);
					j++;
				}
				i++;
			}
			break;
			
		default:
			System.out.println("Codigo invalido, insira o valor corretamente.");
				
	}
	}
}

package fag;

import java.util.Scanner;
import java.util.ArrayList;

public class atividade1 {

	public static void main(String[] args) {
		Scanner notas = new Scanner(System.in);
		
		double[] nota = new double[5];
		double[] aluno = new double[5];
		double soma=0, media=0;
		int i;
		//double menor=0, maior=0;
		
		for(i=0;i<=4;i++)
		{
			System.out.println("Aluno "+(i+1)+":");
			for(i=0;i<=4;i++)
			{
				System.out.println("Insira a nota "+(i+1)+" do aluno:");
				nota[i] = notas.nextDouble();
				notas.nextLine();
			}
			media = calcularMedia(soma, nota, i);
		}
		
	}
	public static double calcularMedia(double soma, double nota[], int i) {
		for(i=0;i<=4;i++)
		{
			soma+=nota[i];
		}
		return soma/(nota.length-1);
	}
}
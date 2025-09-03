package fag;

import java.util.Scanner;

public class Principal {

   public static void main(String[] args) {
	   
	   Scanner dados=new Scanner(System.in);
	   for(int aluno=1;aluno<=3;aluno++)
	   {
		 System.out.println("Insira o nome do aluno:");
		 String nome = dados.nextLine();
		 System.out.println("Insira a primeira nota:");
		 double nota1 = dados.nextDouble();
		 System.out.println("Insira a segunda nota:");
		 double nota2 = dados.nextDouble();
		 System.out.println("Insira a terceira nota:");
		 double nota3 = dados.nextDouble();
		 dados.nextLine();
		 double media = calcularMedia(nota1, nota2, nota3);
		 boolean aprovado = verificarStatus(media);
		 exibirResultado(nome, nota1, nota2, nota3, media, aprovado);
	   }
   }
   
   		public static double calcularMedia(double nota1, double nota2, double nota3) {
   		return (nota1+nota2+nota3)/3;
   }
   		public static boolean verificarStatus(double media) {
   			if(media>=7)
   			{
   				return true;
   			}else{
   				return false;
   			}
   		}
   		public static void exibirResultado(String nome, double nota1, double nota2, double nota3, double media, boolean aprovado) {
   	        System.out.println("Aluno: " + nome + ".");
   	        System.out.println("Nota 1: " + nota1 + ".");
   	        System.out.println("Nota 2: " + nota2 + ".");
   	        System.out.println("Nota 3: " + nota3 + ".");
   	        System.out.println("Media: " + media + ".");
   	        if(aprovado==true)
   	        {
   	        	System.out.println("Status: Aprovado.");
   	        }else{
   	        	System.out.println("Status: Reprovado.");
   	        }
   	        }
   		}
package aula01.exercicios;
import java.util.Scanner;

public class Exerc_Lab1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			Curso c1=new Curso();
			System.out.println("Entre com o nome do curso 1:");
			c1.nome = sc.nextLine();
			
			System.out.println("Entre com a area do curso 1:");
			c1.area = sc.nextLine();
			
			System.out.println("Entre com o tipo do curso 1:");
			c1.tipo = sc.nextLine();
			
			System.out.println("Entre com a dura��o do curso 1:");
			c1.dura��o = Integer.parseInt(sc.nextLine());
		
			Curso c2=new Curso();
			System.out.println("Entre com o nome do curso 2:");
			c2.nome = sc.nextLine();
			
			System.out.println("Entre com a area do curso 2:");
			c2.area = sc.nextLine();
			
			System.out.println("Entre com o tipo do curso 2:");
			c2.tipo = sc.nextLine();
			
			System.out.println("Entre com a dura��o do curso 2:");
			c2.dura��o = Integer.parseInt(sc.nextLine());
				
			Curso c3=new Curso();
			System.out.println("Entre com o nome do curso 3:");
			c3.nome = sc.nextLine();
			
			System.out.println("Entre com a area do curso 3:");
			c3.area = sc.nextLine();
			
			System.out.println("Entre com o tipo do curso 3:");
			c3.tipo = sc.nextLine();
			
			System.out.println("Entre com a dura��o do curso 3:");
			c3.dura��o = Integer.parseInt(sc.nextLine());
				
			Curso c4=new Curso();
			System.out.println("Entre com o nome do curso 4:");
			c4.nome = sc.nextLine();
			
			System.out.println("Entre com a area do curso 4:");
			c4.area = sc.nextLine();
			
			System.out.println("Entre com o tipo do curso 4:");
			c4.tipo = sc.nextLine();
			
			System.out.println("Entre com a dura��o do curso 4:");
			c4.dura��o = Integer.parseInt(sc.nextLine());
			
			System.out.println("Curso 1: " + "Nome: " + c1.nome + " - " + "Area: "  + c1.area + " - " + "Tipo: " + c1.tipo + " - " + "Dura��o: " + c1.dura��o);
			System.out.println("Curso 2: " + "Nome: " + c2.nome + " - " + "Area: "  + c2.area + " - " + "Tipo: " + c2.tipo + " - " + "Dura��o: " + c2.dura��o);
			System.out.println("Curso 3: " + "Nome: " + c3.nome + " - " + "Area: "  + c3.area + " - " + "Tipo: " + c3.tipo + " - " + "Dura��o: " + c3.dura��o);
			System.out.println("Curso 4: " + "Nome: " + c4.nome + " - " + "Area: "  + c4.area + " - " + "Tipo: " + c4.tipo + " - " + "Dura��o: " + c4.dura��o);
		
	}

}

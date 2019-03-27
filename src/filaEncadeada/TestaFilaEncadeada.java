package filaEncadeada;

import java.util.Scanner;

public class TestaFilaEncadeada 
{
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		FilaEncadeada<String> fila = new FilaEncadeada<>();
		int opcao = 0;
		do
		{
			menu();
			opcao = input.nextInt();
			processaOpcao(opcao, fila);
		}while(opcao != 0);
		
	}
	
	private static void menu()
	{
		System.out.println("\n	1 - enfileirar");
		System.out.println("	2 - desenfileirar");
		System.out.println("	0 - encerrar");
		System.out.print("	digite sua opção: ");
	}
	
	private static void processaOpcao(int opcao, FilaEncadeada<String> fila)
	{
		switch(opcao)
		{
		case 1:
			System.out.print("\ndigite uma String: ");
			String string = input.next();
			fila.enqueue(string);
			mostrarFila(fila);
			break;
		case 2:
			try
			{	
				fila.dequeue();
			}
			catch(IllegalArgumentException e) {
				System.out.println("\n"+e);
				break;
			}
			mostrarFila(fila);
			break;
		case 0:
			System.out.println("Programa encerrado.");
			break;
		default:
			System.out.println("Opção inválida.");
		}

	}
	
	private static void mostrarFila(FilaEncadeada<String> fila)
	{
		System.out.println("\nFila: "+fila);
	}
	
}

package pilha;

import java.util.Scanner;

public class TestaPilha
{
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		Pilha<Double> pilha = new Pilha<>();
		
		System.out.print("Digite uma expressão númerica: ");
		String entrada = input.nextLine();
		
		for(int i = 0; i < entrada.length(); i++)
		{
			char c = entrada.charAt(i);
			if(c >= 48 && c <= 57)
			{
				pilha.push(((double)c-48));
			}
			else
			{
				double n1 = pilha.pop();
				double n2 = pilha.pop();
				switch(c)
				{
				case '-':
					pilha.push((n2 - n1));
					break;
				case '+':
					pilha.push((n2 + n1));
					break;
				case '*':
					pilha.push((n2 * n1));
					break;
				case '/':
					pilha.push((n2 / n1));
				}
				
			}
			
		}
		System.out.println("O resultado da expressão é "+pilha);
	}

}

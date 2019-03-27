package listaEncadeada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDados 
{
	private static Scanner input = new Scanner(System.in);
	
	public static String leString() 
	{
		String s = input.next();
		if (input.hasNextLine())
			s = s+input.nextLine();
		return s;
	}
	
	public static int leInt() 
	{
		while(true)
		{
			try 
			{
				int i = input.nextInt();
				return i;
			}
			catch (InputMismatchException e) 
			{
				System.out.print(e + " - Não é número inteiro!!! Tente novamente: ");
				input.nextLine();
			}
			
		}
		
	}
	
	public static float leFloat() 
	{
		while(true)
		{
			try 
			{
				float f = input.nextFloat();
				return f;
			}
			catch (InputMismatchException e) 
			{
				System.out.print(e + " - Não é número real!!! Tente novamente: ");
				input.nextLine();
			}
			
		}
		
	}
	
	public static double leDouble()
	{
		while(true)
		{
			try
			{
				double d = input.nextDouble();
				return d;
			}
			catch(InputMismatchException e)
			{
				System.out.print(e + " - Não é número real!!! Tente novamente: ");
				input.nextDouble();
			}
			
		}
		
	}
	
}

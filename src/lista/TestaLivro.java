package lista;

import java.util.List;

public class TestaLivro
{

	public static void main(String[] args)
	{
		List<Livro> livros = new ListaArranjo<Livro>();

		int opcao = 0;
		do {
			menuPrincipal();
			opcao = EntradaDados.leInt();
			if (opcao == 4)
			{
				subMenu();
				opcao = EntradaDados.leInt();
			}
			processaOpcao(livros, opcao);
		}while(opcao != 0);
		
	}
	
	private static void menuPrincipal()
	{
		System.out.println("\n\n            MENU  \n");
		System.out.println("   1 - Inclui novo livro");
		System.out.println("   2 - Exclui livro");
		System.out.println("   3 - Atualizar quantidade");
		System.out.println("   4 - Consultar");
		System.out.println("   0 - Encerrar \n");
		System.out.print  ("              Informe sua opção: ");
		
	}
	
	private static void subMenu()
	{
		System.out.println("\n	5 - Consulta por título");
		System.out.println("	6 - Consulta Por autor");
		System.out.println("	7 - Listagem completa");
		System.out.print  ("              Informe sua opção: ");
	}
	
	private static void processaOpcao(List<Livro> livros, int opcao)
	{
		switch(opcao)
		{
		case 1:
			incluiLivro(livros);
			break;
		case 2:
			excluiLivro(livros);
			break;
		case 3:
			atualizaQuant(livros);
			break;
		case 4:
		case 5:
			consultaTitulo(livros);
			break;
		case 6:
			consultaAutor(livros);
			break;
		case 7:
			listagemCompleta(livros);
			break;
		case 0:
			System.out.println("PROGRAMA TERMINADO!!!");
			break;
		default:
			System.out.println("Opção inválida.");
		}
		
	}
	
	private static void incluiLivro(List<Livro> livros)
	{
		Livro livro = new Livro();
		obtemNomeLivro(livro);
		obtemAutorLivro(livro);
		obtemDemaisDados(livro);
		if(livros.add(livro))
			System.out.println("Livro adicionado com sucesso!");
		else
			System.out.println("Livro não foi adicionado!");
	}
	
	private static void excluiLivro(List<Livro> livros)
	{
		Livro livro = new Livro();
		obtemNomeLivro(livro);
		int pos = livros.indexOf(livro);
		if(livros.remove(pos) != null)
			System.out.println("Livro removido com sucesso.");
		else
			System.out.println("Esse livro não existe.");
			
	}
	
	private static void atualizaQuant(List<Livro> livros)
	{
		Livro livro = new Livro();
		obtemNomeLivro(livro);
		int pos = livros.indexOf(livro);
		if (pos == -1)
			System.out.println("Livro "+livro.getNome()+" não existe.");
		else
		{
			livro = livros.get(pos);
			System.out.printf("O livro %s tem %d %s \n", livro.getNome(), livro.getQuant(),
					(livro.getQuant()) == 1 ? "exemplar" : "exemplares");
			System.out.print("Digite a quantidade atualizada: ");
			int quant = EntradaDados.leInt();
			livro.setQuant(quant);
			livros.set(pos, livro);
			System.out.println("Quantidade atualizada com sucesso.");
		}
		
	}
	
	private static void consultaTitulo(List<Livro> livros)
	{
		Livro livro = new Livro();
		obtemNomeLivro(livro);
		int pos = livros.indexOf(livro);
		if (pos == -1)
			System.out.println("O livro "+livro.getNome()+" não existe.");
		else
			System.out.println(livros.get(pos));
	}
	
	private static void consultaAutor(List<Livro> livros)
	{
		Livro livro = new Livro();
		livro.setNome(null);
		System.out.println();
		obtemAutorLivro(livro);
		int pos = livros.indexOf(livro);
		if (pos == -1)
			System.out.println("O Autor "+livro.getAutor()+" não existe.");
		else
		{
			System.out.println(livros.get(pos));
		}
		
	}
	
	private static void listagemCompleta(List<Livro> livros)
	{
		System.out.println("\nLivros disponíveis na biblioteca:");
		System.out.println(livros);
	}
	
	private static void obtemNomeLivro(Livro a)
	{
		System.out.print("\nInforme o nome do livro: ");
		String nome = EntradaDados.leString();
		a.setNome(nome);
	}
	
	private static void obtemAutorLivro(Livro a)
	{
		System.out.print("Informe o autor do livro: ");
		String autor = EntradaDados.leString();
		a.setAutor(autor);
	}
	
	private static void obtemDemaisDados(Livro a)
	{
		System.out.print("Informe o ano de publicação: ");
		int ano = EntradaDados.leInt();
		a.setAno(ano);
		System.out.print("Informe a quantidade de exemplares: ");
		int quant = EntradaDados.leInt();
		a.setQuant(quant);
		
	}
	
}

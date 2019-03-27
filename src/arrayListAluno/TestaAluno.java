package arrayListAluno;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;

public class TestaAluno {
	public static void main(String[] args){	
		List<Aluno> lista = new ArrayList<Aluno>();	
		int opcao;
		do {
			menuPrincipal();
			opcao = EntradaDados.leInt();
			processaOpcao(lista, opcao);
		} while(opcao != 0);
	}
	
	private static void menuPrincipal(){
		System.out.println("\n\n            MENU  \n");
		System.out.println("   1 - Insere aluno no final");
		System.out.println("   2 - Exclui aluno pelo nome");
		System.out.println("   3 - Altera nota de aluno");
		System.out.println("   4 - Mostra aluno pelo nome");
		System.out.println("   5 - Ordena listagem pelo nome");
		System.out.println("   6 - Mostra listagem completa");
		System.out.println("   0 - Encerra \n");
		System.out.print  ("              Informe sua opção: ");
	}	
	private static void processaOpcao (List<Aluno> lista, int opcao){
		switch (opcao) {
			case 1:
				insereNoFinal(lista);
				break;
			case 2:
				excluiAluno(lista);
				break;
			case 3:
				alteraNota(lista);
				break;
			case 4:
				recuperaAluno(lista);
				break;
			case 5:
				ordenaListagem(lista);
				break;
			case 6:
				mostraListagem(lista);
				break;
			case 0:
				System.out.println("\n Programa encerrado... Obrigado!!!");
				break;
			default:
				System.out.println("\n Opção Inválida!!!");
		}
	}
	private static void insereNoFinal(List<Aluno> lista) {
		Aluno aluno = new Aluno();
		obtemNomeAluno(aluno);
		obtemDemaisDadosAluno(aluno);
		if (lista.add(aluno))
			System.out.println("Aluno inserido com sucesso!");
		else
			System.out.println("Aluno não inserido!");
	}	
	private static void excluiAluno(List<Aluno> lista) {
		Aluno aluno = new Aluno();
		obtemNomeAluno(aluno);
		if (lista.remove(aluno))
			System.out.println("\n"+aluno.getNome()+" excluído(a) com sucesso!");
		else
			System.out.println("\n"+aluno.getNome()+" não existente na lista!");
	}
	private static void recuperaAluno(List<Aluno> lista) {
		Aluno aluno = new Aluno();
		obtemNomeAluno(aluno);
		int pos = lista.indexOf(aluno);
		if(pos == -1)
			System.out.println("\n"+aluno.getNome()+" não existente na lista!");
		else {
			System.out.println("\n"+aluno.getNome()+" encontrado(a) na posição "
						+pos+": "+lista.get(pos)+".");
		}
	}
	private static void alteraNota(List<Aluno> lista) {
		Aluno aluno = new Aluno();
		obtemNomeAluno(aluno);
		int pos = lista.indexOf(aluno);
		if(pos == -1)
			System.out.println("\n"+aluno.getNome()+" não existente na lista!");
		else {
			aluno = lista.get(pos);
			System.out.println("\n"+aluno.getNome()+" tem nota = "+aluno.getNota());
			System.out.print("Informe nova nota do(a) aluno(a): ");
			float nota = EntradaDados.leFloat();
			aluno.setNota(nota);
			lista.set(pos, aluno);
		}
	}
	private static void ordenaListagem(List<Aluno> lista) {
		Collections.sort((List<Aluno>) lista);
	//	System.out.println("\n Listagem ordenada com sucesso!");
		mostraListagem(lista);
	}
	private static void mostraListagem(List<Aluno> lista) {
		System.out.print("\n    - LISTAGEM COMPLETA - \n");
		System.out.print(lista.toString());
		System.out.print("\n\n    -  FIM DA LISTAGEM  - \n");
	}
	private static void obtemNomeAluno(Aluno a) {
		System.out.print("\nInforme nome do(a) aluno(a): ");
		String nome = EntradaDados.leString();
		a.setNome(nome);
	}
	private static void obtemDemaisDadosAluno(Aluno a) {
		System.out.print("Informe matrícula do(a) aluno(a): ");
		String matr = EntradaDados.leString();
		a.setMatr(matr);
		System.out.print("Informe nota do(a) aluno(a): ");
		float nota = EntradaDados.leFloat();
		a.setNota(nota);
	}
}
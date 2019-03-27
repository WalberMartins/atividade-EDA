package pizzaria;

public class Pizzaria 
{

	public static void main(String[] args) 
	{
		Fila<Pedido> filaNormal = new Fila<>();
		Fila<Pedido> filaPrioritaria = new Fila<>();
		int opcao;
		
		do
		{
			mostrarFila(filaNormal, filaPrioritaria);
			menu();
			opcao = EntradaDados.leInt();
			processaOpcao(opcao, filaNormal, filaPrioritaria);
			
		}while(opcao != 0);
		
	}
	
	private static void menu()
	{
		System.out.println("\n 1 - Registrar pedidos");
		System.out.println(" 2 - Atender pedidos");
		System.out.println(" 0 - Encerrar");
		System.out.print("    Digite sua opção: ");
	}
	
	private static void processaOpcao(int opcao, Fila<Pedido> filaNormal, Fila<Pedido> filaPrioritaria)
	{
		switch(opcao)
		{
		case 1:
			registrarPedido(filaNormal, filaPrioritaria);
			break;
		case 2:
			atenderPedido(filaNormal, filaPrioritaria);
			break;
		case 0:
			System.out.println("PROGRAMA ENCERRADO!!!");
			break;
		default:
			System.out.println("Opção inválida, tente novamente.");
		}
		
	}

	private static void registrarPedido(Fila<Pedido> filaNormal, Fila<Pedido> filaPrioritaria) 
	{
		Pedido pedido = new Pedido();
		int opcao;
		
		System.out.print("\nDigite o nome do cliente: ");
		pedido.setNomeDoCliente(EntradaDados.leString());
		System.out.print("Digite o endereço do cliente: ");
		pedido.setEnderecoDeEntrega(EntradaDados.leString());	
		do
		{
			System.out.println("\n1 - Mussarela       \tR$31,00");
			System.out.println("2 - Presunto        \tR$32,00");
			System.out.println("3 - Calabresa       \tR$33,00");
			System.out.println("4 - Peito de frango \tR$34,00");
			System.out.println("5 - Portuguesa      \tR$35,00");
			System.out.print("    Digite o sabor escolhido: ");
			opcao = EntradaDados.leInt();
			switch(opcao)
			{
			case 1:
				pedido.setTipoDePizza("Mussarela");
				pedido.setValorDaPizza(31);
				break;
			case 2:
				pedido.setTipoDePizza("Presunto");
				pedido.setValorDaPizza(32);
				break;
			case 3:
				pedido.setTipoDePizza("Calabresa");
				pedido.setValorDaPizza(33);
				break;
			case 4:
				pedido.setTipoDePizza("Peito de frango");
				pedido.setValorDaPizza(34);
				break;
			case 5:
				pedido.setTipoDePizza("Portuguesa");
				pedido.setValorDaPizza(35);
				break;
			default:
				System.out.println("sabor inválido, tente novamente.");
			}
			
		}while(opcao < 1 || opcao > 5);
		
		if(filaPrioritaria.size() < 3)
		{
			System.out.print("\nO cliente Deseja entrar na fila Prioritaria por mais R$10,00: [s/n] ");
			char resposta = EntradaDados.leString().toUpperCase().charAt(0);
			if(resposta == 'S')
			{
				pedido.setValorDaPizza(pedido.getValorDaPizza()+10);
				filaPrioritaria.enqueue(pedido);
				System.out.println("\nO pedido "+pedido+"\nincluido na fila prioritaria com sucesso.");
			}
			else
			{
				filaNormal.enqueue(pedido);
				System.out.println("\nO pedido "+pedido+"\nincluido na fila com sucesso.");
			}
			
		}
		else
		{
			filaNormal.enqueue(pedido);
			System.out.println("\nO pedido "+pedido+"\nincluido na fila com sucesso.");
		}
		
	}
	
	private static void atenderPedido(Fila<Pedido> filaNormal, Fila<Pedido> filaPrioritaria) 
	{
		Pedido pedido = new Pedido();
		if(!filaPrioritaria.isEmpty())
		{
			pedido = filaPrioritaria.dequeue();
			pedido.setValorDaPizza(pedido.getValorDaPizza()+5);
			System.out.println("\nO pedido "+pedido+"\natendido com sucesso.");
		}
		else if(!filaNormal.isEmpty())
		{
			pedido = filaNormal.dequeue();
			pedido.setValorDaPizza(pedido.getValorDaPizza()+5);
			System.out.println("\nO pedido "+pedido+"\natendido com sucesso");
		}
		else
		{
			System.out.println("\nNão a nenhum pedido na fila no momento.");
		}
		
	}

	private static void mostrarFila(Fila<Pedido> filaNormal, Fila<Pedido> filaPrioritaria)
	{
		if(filaPrioritaria.isEmpty() && filaNormal.isEmpty())
			System.out.println("\nA fila de atendimento está vazia");
		else
		{
			System.out.println("\n	Fila de Atendimento ");
			if(!filaPrioritaria.isEmpty())
				System.out.println(filaPrioritaria);
			if(!filaNormal.isEmpty())
				System.out.println(filaNormal);
		}
		
	}

}

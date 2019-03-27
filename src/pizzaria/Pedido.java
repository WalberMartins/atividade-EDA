package pizzaria;

public class Pedido
{
	private String nomeDoCliente;
	private String enderecoDeEntrega;
	private String tipoDePizza;
	private double valorDaPizza;
	
	public Pedido()
	{
		this(null, null, null, 0);
	}
	
	public Pedido(String nome, String endereco, String tipo, double valor)
	{
		nomeDoCliente = nome;
		enderecoDeEntrega = endereco;
		tipoDePizza = tipo;
		valorDaPizza = valor;
	}
	
	public String getNomeDoCliente()
	{
		return nomeDoCliente;
	}
	
	public void setNomeDoCliente(String nomeDoCliente)
	{
		this.nomeDoCliente = nomeDoCliente;
	}
	
	public String getEnderecoDeEntrega()
	{
		return enderecoDeEntrega;
	}
	
	public void setEnderecoDeEntrega(String enderecoDeEntrega)
	{
		this.enderecoDeEntrega = enderecoDeEntrega;
	}
	
	public String getTipoDePizza()
	{
		return tipoDePizza;
	}
	
	public void setTipoDePizza(String tipoDePizza)
	{
		this.tipoDePizza = tipoDePizza;
	}
	
	public double getValorDaPizza()
	{
		return valorDaPizza;
	}
	
	public void setValorDaPizza(double valorDaPizza)
	{
		this.valorDaPizza = valorDaPizza;
	}

	@Override
	public String toString() {
		return "[Nome do cliente = " + nomeDoCliente + ", Endereço De Entrega = " + enderecoDeEntrega + ", Tipo De Pizza = "
				+ tipoDePizza + ", Valor da pizza = " + valorDaPizza + "]";
	}
	
}

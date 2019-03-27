package listaEncadeada;

public class Celula 
{
	private Object elemento;
	private Celula proxima;
	
	public Celula(Object elemento)
	{
		this.elemento = elemento; 
	}
	
	public Celula(Object elemento, Celula proxima)
	{
		this.elemento = elemento;
		this.proxima = proxima;
	}
	
	public void setProxima(Celula proxima)
	{
		this.proxima = proxima;
	}
	
	public Celula getProxima()
	{
		return proxima;
	}
	
	public void setElemento(Object elemento)
	{
		this.elemento = elemento;
	}
	
	public Object getElemento()
	{
		return elemento;
	}
	
	public String toString()
	{
		return ""+elemento;
	}

}

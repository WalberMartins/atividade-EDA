package pilhaEncadeada;

public class Celula 
{
	private Object elemento;
	private Celula abaixo;
	
	public Celula(Object elemento)
	{
		this.elemento = elemento; 
	}
	
	public Celula(Object elemento, Celula abaixo)
	{
		this.elemento = elemento;
		this.abaixo = abaixo;
	}
	
	public void setAbaixo(Celula abaixo)
	{
		this.abaixo = abaixo;
	}
	
	public Celula getAbaixo()
	{
		return abaixo;
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

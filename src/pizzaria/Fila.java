package pizzaria;

public class Fila<E>
{
	private Object[] objetos;
	private int inicio;
	private int fim;
	private int tamanho;
	
	public Fila()
	{
		this(10);
	}
	
	public Fila(int capacidade)
	{
		objetos = new Object[capacidade];
	}
	
	private int sucessor(int pos)
	{
		return ((pos + 1) % objetos.length);
	}
	
	private int antecessor(int pos)
	{
		return ((pos - 1 + objetos.length) % objetos.length);
	}
	
	public boolean isEmpty()
	{
		return (inicio == fim);
	}
	
	public boolean isFull()
	{
		return (sucessor(fim) == inicio);
	}
	
	public void enqueue(E objeto)
	{
		if(isFull())
			throw new IllegalArgumentException("Fila cheia!!!");
		objetos[fim] = objeto;
		fim = sucessor(fim);
		tamanho++;
	}
	
	public E dequeue()
	{
		if(isEmpty())
			throw new IllegalArgumentException("Fila vazia!!!");
		@SuppressWarnings("unchecked")
		E objeto = (E) objetos[inicio];
		inicio = sucessor(inicio);
		tamanho--;
		return objeto;
	}
	
	public int size()
	{
		return tamanho;
	}

	public String toString()
	{
		if(isEmpty())
			return "[]";
		StringBuilder s = new StringBuilder();
		int i = inicio;
		s.append("[");
		while(i != antecessor(fim))
		{
			s.append(objetos[i]+", \n");
			i = sucessor(i);
		}
		s.append(objetos[antecessor(fim)]+"]");
		
		return s.toString();
	}
	
}

package pilha;

public class Pilha<E>
{
	private Object[] objetos;
	private int topo;
	
	public Pilha()
	{
		objetos = new Object[10];
		topo = 0;
	}
	
	public boolean empty()
	{
		return topo == 0;
	}
	
	public void push(Object obj)
	{
		if(topo == objetos.length)
			throw new IllegalArgumentException("Pilha cheia!!!"); 
		objetos[topo] = obj;
		topo++;
	}
	
	@SuppressWarnings("unchecked")
	public E pop()
	{
		if(empty())
			throw new IllegalArgumentException("Pilha vazia!!!");
		topo--;
		return (E) objetos[topo];
	}
	
	@SuppressWarnings("unchecked")
	public E peek()
	{
		if(empty())
			throw new IllegalArgumentException("Pilha vazia!!!");
		return (E) objetos[topo-1];
	}

	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i < topo-1; i++)
		{
			s.append(objetos[i]);
			s.append(", ");
		}
		if(topo > 0)
			s.append(objetos[topo-1]);
		s.append("]");
		
		return s.toString();
	}
		
}

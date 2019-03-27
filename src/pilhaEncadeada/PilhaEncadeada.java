package pilhaEncadeada;

public class PilhaEncadeada<E> 
{
	private Celula topo;
	private int tamanho;
	
	
	public PilhaEncadeada()
	{
		topo = null;
		tamanho = 0;
	}
	
	public boolean isEmpty()
	{
		return topo == null;
	}
	
	public void push(E elemento)
	{
		Celula auxiliar = topo;
		Celula nova = new Celula(elemento);
		nova.setAbaixo(auxiliar);
		topo = nova;
		tamanho++;
	}
	
	public E pop()
	{
		if(isEmpty())
			throw new IllegalArgumentException("Pilha vazia!");
		@SuppressWarnings("unchecked")
		E elemento = (E) topo.getElemento();
		topo = topo.getAbaixo();
		tamanho--;
		return elemento;
	}
	
	public E peek()
	{
		if(isEmpty())
			throw new IllegalArgumentException("Pilha vazia!");
		@SuppressWarnings("unchecked")
		E elemento = (E) topo.getElemento();
		return elemento;
	}
	
	public int size()
	{
		return tamanho;
	}
	
	private Celula getCelula(int posicao)
	{
		Celula atual = topo;
		for(int i = 0; i < posicao; i++)
			atual = atual.getAbaixo();
		return atual;
	}
	
	public String toString() 
	{
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < tamanho; i++)
			s.append(getCelula(i)+"\n");
		return s.toString();
	}
	
}

package filaEncadeada;

public class FilaEncadeada <E>
{
	private Celula inicio;
	private Celula fim;
	private int tamanho;
	
	public FilaEncadeada() 
	{
		inicio = null;
		fim = null;
		tamanho = 0;
	}
	
	public Boolean isEmpty()
	{
		return inicio == null;
	}
	
	public void enqueue(E elemento)
	{
		Celula auxiliar = fim;
		Celula nova = new Celula(elemento);
		fim = nova;
		if(isEmpty())
			inicio = fim;
		else
			auxiliar.setProxima(fim);
		tamanho++;
			
	}
	
	public E dequeue()
	{
		if(isEmpty())
			throw new IllegalArgumentException("Fila vazia!");
		@SuppressWarnings("unchecked")
		E elemento = (E) inicio.getElemento();
		inicio = inicio.getProxima();
		tamanho--;
		return elemento;
	}
	
	private Celula getCelula(int posicao)
	{
		Celula atual = inicio;
		for(int i = 0; i < posicao; i++)
			atual = atual.getProxima();
		return atual;
	}
	
	public String toString()
	{
		if(isEmpty())
			return "[ ]";
		StringBuilder s = new StringBuilder();
		s.append("[ ");
		for(int i = 0; i < tamanho-1; i++)
			s.append(getCelula(i)+", ");
		s.append(getCelula(tamanho-1)+" ]");
		return s.toString();
	}
	
}

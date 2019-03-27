package lista;

public class Livro
{
	private String nome;
	private String autor;
	private int quant;
	private int anoPublic;
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getAutor()
	{
		return autor;
	}
	
	public void setAutor(String autor)
	{
		this.autor = autor;
	}
	
	public int getQuant()
	{
		return quant;
	}
	
	public void setQuant(int quant)
	{
		this.quant = quant;
	}
	
	public int getAno()
	{
		return anoPublic;
	}
	
	public void setAno(int ano)
	{
		this.anoPublic = ano;
	}
	
	@Override
	public String toString()
	{
		return "\n Título = " + nome + "\n Autor = " + autor + "\n "
				+ "Ano de publicação = " + anoPublic + "\n Quantidade = " + quant + "";
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (nome == null) {
			if(autor.equals(other.autor))
				return true;
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}

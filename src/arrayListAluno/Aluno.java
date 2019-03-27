package arrayListAluno;

//import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{ 
	//Atributos de instância
	private String nome;
	private String matr;
	private float nota;
	// Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatr() {
		return matr;
	}
	public void setMatr(String matr) {
		this.matr = matr;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "\n Alun@: [nome="+nome+", matr="+matr+", nota="+nota+"]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public int compareTo(Aluno outro) {
		return(this.nome.compareTo(outro.nome));
	}
}

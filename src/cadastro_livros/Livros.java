package cadastro_livros;

public class Livros {
	private String nome;
	private String autor;
	private String anoDePubli;
	private String generoLitera;
	
	public Livros(String nome, String autor, String anoDePubli, String generoLitera) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.anoDePubli = anoDePubli;
		this.generoLitera = generoLitera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAnoDePubli() {
		return anoDePubli;
	}

	public void setAnoDePubli(String anoDePubli) {
		this.anoDePubli = anoDePubli;
	}

	public String getGeneroLitera() {
		return generoLitera;
	}

	public void setGeneroLitera(String generoLitera) {
		this.generoLitera = generoLitera;
	}

	@Override
	public String toString() {
		return "Título = " + nome + "\nAutor = " + autor + "\nAno De Publicação = " + anoDePubli + "\nGenero = "
				+ generoLitera;
	}
	
	
}

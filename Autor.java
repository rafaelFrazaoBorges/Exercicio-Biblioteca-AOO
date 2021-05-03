
public class Autor extends Pessoa {

	String nacionalidade;

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Autor(String nome, String nacionalidade) {
		super(nome);
		this.nacionalidade = nacionalidade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Nacionalidade: " + nacionalidade;
	}
}


public class Professor extends Pessoa {

	String codigo;

	public Professor(String nome, String codigo) {
		super(nome);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Codigo: " + codigo;
	}
}

package funcionarioPOO;

public class Funcionario {

	private String nome;;
	private int idade;
	private String setor;
	private String cargo;
	private String telefone;

	public Funcionario(String nome, int idade, String setor, String cargo, String telefone) {

		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.setor = setor;
		this.telefone = telefone;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void visualizar() {

		System.out.println("Nome Cliente: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Setor: " + setor);
		System.out.println("Cargo: " + cargo);
		System.out.println("Telefone: " + telefone);

	}
}
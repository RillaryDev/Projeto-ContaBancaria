package clientePOO;

public class Cliente {

	private String nome;
	private String email;
	private int idade;
	private String cpf;
	private String telefone;

	public Cliente(String nome, String email, int idade, String cpf, String telefone) {

		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void visualizar() {

		System.out.println("Nome Cliente: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("Idade: " + idade);
		System.out.println("Cpf: " + cpf);
		System.out.println("Telefone: " + telefone);

	}

}
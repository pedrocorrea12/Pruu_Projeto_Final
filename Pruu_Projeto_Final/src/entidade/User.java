package entidade;

import java.util.ArrayList;

public class User {

	private String nome;
	private String email;
	private String cpf;
	private ArrayList<Pruu> pruus;
	private String nomePerfil;
		
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.nomePerfil = "@" + this.nome;
	}
	
	public void darLike(Pruu pruuParaCurtir) {
		pruuParaCurtir.adicionarLike();
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Pruu> getPruus() {
		return pruus;
	}

	public void setPruus(ArrayList<Pruu> pruus) {
		this.pruus = pruus;
	}

	@Override
	public String toString() {
		return nomePerfil;
	}

	
}

package entidade;

public class Adm extends User {

	public Adm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adm(String nome, String email, String cpf) {
		super(nome, email, cpf);
		// TODO Auto-generated constructor stub
	}

	
	public void bloquearPruu(Pruu pruuBloquear) {
		pruuBloquear.setBloqueado(true);
	}
	
	public void desbloquearPruu (Pruu pruuDesbloquear) {
		pruuDesbloquear.setBloqueado(false);
	}
}

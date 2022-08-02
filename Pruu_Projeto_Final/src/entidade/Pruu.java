package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pruu {

	private static int id;
	private int idPruu;
	private String texto;
	private Date dataCriacao;
	private String dataFormatada;
	private int qtdLikes;
	private boolean bloqueado;
	private User usuario;
	private boolean textoValido = true;
	
	
	public Pruu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Pruu(String texto, User userMaria) {
		super();
		validarTexto(texto);
		if (textoValido == true) {
			this.texto = texto;
			this.usuario = userMaria;
			this.dataCriacao = new Date();
			SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
			String dataFormatada = formatador.format(dataCriacao);
			this.dataFormatada = dataFormatada;
			Pruu.id++;
			idPruu = Pruu.id;
		} else if (textoValido == false) {
			this.texto = "Fale algo que valha mais que o silêncio, ou não fale nada.";
			this.usuario = userMaria;
			this.dataCriacao = new Date();
			SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
			String dataFormatada = formatador.format(dataCriacao);
			this.dataFormatada = dataFormatada;
		}
				
	}
	//metodos
	
	public boolean validarTexto(String texto) {
		if ((texto.length() > 300) || (texto.trim().length() < 1)) {
			textoValido = false;
		} 
		return textoValido;
	}
	
	public void adicionarLike() {
		this.qtdLikes++;
	}
	
		
	public int getId() {
		return id;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public int getQtdLikes() {
		return qtdLikes;
	}
	public void setQtdLikes(int qtdLikes) {
		this.qtdLikes = qtdLikes;
	}
	public boolean isBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}


	public boolean isTextoValido() {
		return textoValido;
	}

	public void setTextoValido(boolean textoValido) {
		this.textoValido = textoValido;
	}

	@Override
	public String toString() {
		if (bloqueado) {
			return "\nID:" + idPruu + "\n Pruu Bloqueado." + "\nPostado em " + dataFormatada
					 + "\nPostado por: " + usuario + "\n";
		} else {
			
		return "\nID:" + idPruu + "\nPruuuuuu: " + texto + "\nPostado em " + dataFormatada + "\n" + qtdLikes
				+ " curtidas" + "\nPostado por: " + usuario + "\n";
		}
	}


	
	
}

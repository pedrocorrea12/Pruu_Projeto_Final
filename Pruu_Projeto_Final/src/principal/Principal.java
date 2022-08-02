package principal;

import java.util.ArrayList;
import java.util.Iterator;

import entidade.Adm;
import entidade.Pruu;
import entidade.User;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Pruu> pruusFeed = new ArrayList();
		
		User admin = new Adm("AdminUser","admin@admin","123456789");
		
		User id_victor = new User("Victor Assis", "@victordajoaca", "2001");
		Pruu pruvictor1 = new Pruu("Alô Alô Marciano, aqui quem fala é da terra", id_victor);
		Pruu pruvictor2 = new Pruu("Pra variar estamos em guerra, vc n imagina a loucura", id_victor);
		pruusFeed.add(pruvictor1);
		pruusFeed.add(pruvictor2);
		ArrayList<Pruu> victorpruus = new ArrayList();
		id_victor.setPruus(victorpruus);
		victorpruus.add(pruvictor1);
		victorpruus.add(pruvictor2);
		
		User id_gado = new User("Gado_17", "@Gado_1717", "1717");
		Pruu prugado = new Pruu("Ame o mito e tome cloroquinmuuuuuuuuu", id_gado);
		Pruu prugado2 = new Pruu("", id_gado);
		pruusFeed.add(prugado);
		pruusFeed.add(prugado2);
		ArrayList<Pruu> gadopruus = new ArrayList();
		id_gado.setPruus(gadopruus);
		gadopruus.add(prugado);
		gadopruus.add(prugado2);
		
		
		
		User id_ana = new User("Anna Rita", "@anabanana", "2002");
		Pruu pruana = new Pruu("Você que inventou o pecado, esqueceu-se de inventar o perdão", id_ana);
		Pruu pruana2 = new Pruu("", id_ana);
		pruusFeed.add(pruana);
		pruusFeed.add(pruana2);
		ArrayList<Pruu> anapruus = new ArrayList();
		id_ana.setPruus(anapruus);
		anapruus.add(pruana);
		anapruus.add(pruana2);
		
		
		
		
		
		
		
		id_victor.darLike(pruana);
		id_ana.darLike(pruvictor2);
		
		
		((Adm) admin).bloquearPruu(prugado);
		
		System.out.println("---------------");
		System.out.println("------FEED-----");
		System.out.println("---------------");
		for (int i = 0; i < pruusFeed.size(); i++) {
			System.out.println(pruusFeed.get(i));
			System.out.println("**********************************************");
			}
		System.out.println("");
		System.out.println("---------------");
		System.out.println("------VICTOR-----");
		System.out.println("---------------");
		for (int i = 0; i < victorpruus.size(); i++) {
			System.out.println(victorpruus.get(i));
			System.out.println("-----------------------");
			}
		
		System.out.println("");
		System.out.println("---------------");
		System.out.println("------GADO-----");
		System.out.println("---------------");
		for (int i = 0; i < gadopruus.size(); i++) {
			System.out.println(gadopruus.get(i));
			System.out.println("--------------------");
			}
		
		System.out.println("");
		System.out.println("---------------");
		System.out.println("------ANA-----");
		System.out.println("---------------");
		for (int i = 0; i < anapruus.size(); i++) {
			System.out.println(anapruus.get(i));
			System.out.println("----------------");
			}
		
		
		
		
		
	}
}


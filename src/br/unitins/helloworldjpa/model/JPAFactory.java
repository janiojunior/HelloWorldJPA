package br.unitins.helloworldjpa.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldJPA");
	
	private JPAFactory() {
		// construtor privado para nao deixar criar uma instancia dessa classe
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}

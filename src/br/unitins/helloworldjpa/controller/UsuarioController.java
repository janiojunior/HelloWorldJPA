package br.unitins.helloworldjpa.controller;

import javax.persistence.EntityManager;

import br.unitins.helloworldjpa.model.JPAFactory;
import br.unitins.helloworldjpa.model.Usuario;


public class UsuarioController {
	
	public static void main(String[] args) {
		// Obtendo um administrador de entidades
		EntityManager em = JPAFactory.getEntityManager();
		
		// Criando um objeto usuario 
		Usuario usu = new Usuario(1, "Pedro", "pedro", "123");
		
		// Iniciando uma transacao com o banco de dados
		em.getTransaction().begin();
		
		em.persist(usu);
		
		em.getTransaction().commit();

		System.out.println("Funcionou.");
	}

}

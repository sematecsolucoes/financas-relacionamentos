package br.com.sematec.financas.teste;

import javax.persistence.EntityManager;

import br.com.sematec.financas.modelo.Conta;
import br.com.sematec.financas.util.JPAUtil;

public class TesteEstadosJPA {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();

		// ID de uma conta que exista no banco de dados, no caso ID: 1
		Conta conta = manager.find(Conta.class, 1);

		System.out.println(conta.getTitular());

		conta.setTitular("Luiz Ferreira");

		System.out.println(conta.getTitular());

		manager.getTransaction().commit();

		manager.close();

	}
}

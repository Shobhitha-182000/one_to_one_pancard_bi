package com.ty_one_to_one_pancard_bi_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty_one_to_one_pancard_bi_dto.Pancard;
import com.ty_one_to_one_pancard_bi_dto.Person;

public class Pancardmain {
	public static void main(String[] args) {
		Person person = new Person();
		Pancard pancard = new Pancard();

		person.setId(1);
		person.setName("ram");
		person.setPhone(948939289);
		person.setAddress("hsn");
		person.setAge(22);

		pancard.setPanNo("A1");
		pancard.setHolder_name("ram.j");
		pancard.setAddress("hassan");

		person.setPanCard(pancard);
		pancard.setPerson(person);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pancard);
		entityTransaction.commit();
	}
}

package com.ty_one_to_one_pancard_bi_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty_one_to_one_pancard_bi_dto.Person;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		//cashing 1st level
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityManager entityManager1=entityManagerFactory.createEntityManager();
		Person person=entityManager.find(Person.class, 1);
		System.out.println(person);
		EntityManager entityManager11=entityManagerFactory.createEntityManager();
		Person person1=entityManager11.find(Person.class, 1);
		System.out.println(person1);
		
		
	}
}

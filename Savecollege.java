package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Savecollege {
	public static void main (String [] args) {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		 EntityManager entitymanager = entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction = entitymanager.getTransaction();
		 College s = new College();
		 s.setName("sarin");
		 s.setWebsite("www.kiran.com");
		 s.setPhnno(12413144l);
		 s.setNobranchers(3);
		 
		 
		 entityTransaction.begin();
		 entitymanager.persist(s);
		 entityTransaction.commit();
	}
		 

	
}


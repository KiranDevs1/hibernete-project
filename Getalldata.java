package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Getalldata {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select a from College a where a.nobranchers>2");
//		query.setParameter(2, 2);
		  List<College> colleges=query.getResultList();
	        for (College college: colleges) {
		System.out.println("College ID: "+college.getId());
		System.out.println("College Name: "+college.getName());
		System.out.println("Colllege Phno: "+college.getPhnno());
		System.out.println("College No of Branches: "+college.getNobranchers());
		System.out.println("College Website: "+college.getWebsite());
		System.out.println("_");
		
	}}

	
	
}

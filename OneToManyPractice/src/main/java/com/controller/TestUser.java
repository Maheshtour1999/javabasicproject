package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Post;
import com.model.User;

public class TestUser {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("otomp");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		User u=new User();
		u.setUserId(501);
		u.setUserName("Mahesh");
		
		Post p1=new Post();
		p1.setId(601);
	    p1.setName("Developer");
		
	    Post p2=new Post();
	    p2.setId(602);
        p2.setName("Tester");
        
        List<Post> list=new ArrayList<Post>();
        list.add(p1);
        list.add(p2);
        
        u.setPost(list);
        
        em.persist(u);
        em.persist(p1);
        em.persist(p2);
        
        em.getTransaction().commit();
        System.out.println("Persist data");
        
        
        
	}

}

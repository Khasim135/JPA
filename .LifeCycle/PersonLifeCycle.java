package org.SRK;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonLifeCycle {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	Person p=new Person();//Trancient
	p.setName("ABC");
	p.setMail("AB@gmail.com");
	
	m.persist(p);// Persistent
	t.begin();
	t.commit();
	System.err.println("object is in persistent state");
	System.out.println("__________________");
	m.detach(p);//Detached State
	t.begin();
	t.commit();
	System.err.println("object is detached from the session");
	System.out.println("__________________");
//	m.remove(p);
	t.begin();
	t.commit();
	System.err.println("trying to delete detached object ");
	System.err.println("but it throws an exception Removing Detached Instance ");
	System.out.println("__________________");
	Person p1=m.find(Person.class, 3);//Persistent State
	p1.setMail("BC@gmail.com");
	p1.setName("DEF");
	t.begin();
	t.commit();
	System.err.println("object is updated without calling merge method");
	System.out.println("__________________");
	m.remove(p1);//Removed State
	t.begin();
	t.commit();
	System.err.println("object is in Removed State");
}
}

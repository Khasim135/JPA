package org.SRK;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Person p=new Person();
	p.setAge(20);
	p.setName("BABU");
	PersonID id=new PersonID();
	id.setMail("AB@gmail.com");
	id.setPhon(888);
	p.setId(id);
	m.persist(p);
	t.begin();
	t.commit();
}
}

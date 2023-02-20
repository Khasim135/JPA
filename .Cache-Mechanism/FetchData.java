package org.SRK;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityManager m2=f.createEntityManager();
	User u1=m.find(User.class, 1);
  User u3=m.find(User.class, 1);
  
	User u2=m2.find(User.class, 1);
  User u4=m2.find(User.class, 1);
}
}

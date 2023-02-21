package org.SRK.UserApp.controller;

import org.SRK.UserApp.dao.Userdao;
import org.SRK.UserApp.dto.User;

public class UpdateUser {
public static void main(String[] args) {
	Userdao dao=new Userdao();
	User u=new User();
	u=dao.findUser(1);
	System.out.println("name "+u.getName());
	System.out.println("phon :"+u.getPhon());
	u.setName("babu");
	u.setMail("Babu@gmail.com");
	u.setPhon(999);
	u.setPassword("12345");
	u=dao.UpdateUser(u);
	System.out.println("name :"+u.getName());
}
}

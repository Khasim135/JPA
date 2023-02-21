package org.SRK.UserApp.controller;

import org.SRK.UserApp.dao.Userdao;
import org.SRK.UserApp.dto.User;

public class SaveUser {
public static void main(String[] args) {
	User u=new User();
	u.setName("harsha");
	u.setMail("ghC@gmail.com");
	u.setPassword("1234");
	u.setPhon(888);
	Userdao dao=new Userdao();
	u=dao.SaveUser(u);
	System.out.println("user is saved with id :"+u.getId());
}
}

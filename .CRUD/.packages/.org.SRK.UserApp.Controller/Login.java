package org.SRK.UserApp.controller;

import java.util.Scanner;

import org.SRK.UserApp.dao.Userdao;
import org.SRK.UserApp.dto.User;

public class Login {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Userdao dao=new Userdao();
	System.out.println("enter phon number");
	long ph=sc.nextLong();
	System.out.println("enter Password");
	String psw=sc.next();
	User u=dao.verify(ph, psw);
	if(u!=null)
	{
		System.out.println("id  :"+u.getId());
		System.out.println("name  :"+u.getName());
		System.out.println("mail  :"+u.getMail());
		System.out.println("phon  :"+u.getPhon());
		System.out.println("password :"+u.getPassword());
	}
	
}
}

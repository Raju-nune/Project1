package com.bean;

import com.bean.Account;
import com.service.AccountService;
public class App {

	public static void main(String[] args) {
		AccountService as=new AcccountService();
        Account acc=new Account();
        acc.setAccno(1);
        acc.setName("Raju");
        acc.setAmount(500);
        String result=as.createAccount(acc);
        System.out.println(result);
        
	}

}

package br.com.casadocodigo.loja.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountTransactionController {

	@Autowired
	private AccountTransactionDao accounts;
	
	@RequestMapping(value = "/account/form")
	public String form() {
		return "account/form";
	}
	
	@RequestMapping(value = "/account/addAccount", method = RequestMethod.POST)
	public String add(AccountTransaction account) {
		System.out.println(account);
		accounts.add(account);
		
		return "account/account-transaction-added";
	}
}

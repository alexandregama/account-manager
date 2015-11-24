package br.com.casadocodigo.loja.account;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class AccountTransactionDao {

	private Map<Long, AccountTransaction> accounts = new HashMap<>();
	
	private Long id = 1L;
	
	public void add(AccountTransaction account) {
		Long newId = id++;
		account.setId(newId);
		accounts.put(newId, account);
	}
	
}

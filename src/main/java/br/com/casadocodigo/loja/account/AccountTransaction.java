package br.com.casadocodigo.loja.account;

import java.math.BigDecimal;

public class AccountTransaction {

	private Long id;
	
	private String description;
	
	private BigDecimal value;
	
	private AccountTransactionType type;
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", description=" + description + ", value=" + value + ", type=" + type + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public AccountTransactionType getType() {
		return type;
	}

	public void setType(AccountTransactionType type) {
		this.type = type;
	}
	
}

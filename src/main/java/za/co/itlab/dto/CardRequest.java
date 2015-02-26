package za.co.itlab.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CardRequest {

	private int transactionId;
	
	@JsonIgnore
	private String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	
}

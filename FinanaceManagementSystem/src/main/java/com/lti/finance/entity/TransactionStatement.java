package com.lti.finance.entity;




	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	@Entity
	@Table(name = "TBL_STMT")
	public class TransactionStatement {
		@Id         //primary key
	    @GeneratedValue  //auto generate primary key
	   
		private int txno;
		
		 @Column(name = "date_and_time") 
		private Date date;
		 
		 @Column(name = "tx_type") 
		private String type;
		 
		private double amount;
		
		@ManyToOne
		@JoinColumn(name="acno")
		private Account account;
		
		public int getTxno() {
			return txno;
		}
		public void setTxno(int txno) {
			this.txno = txno;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public Account getAccount() {
			return account;
		}
		public void setAccount(Account account) {
			this.account = account;
		}
		
	}
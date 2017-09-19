package com.datastax.banking.model;

import java.util.Date;
import java.util.Set;

import com.datastax.driver.mapping.annotations.ClusteringColumn;
import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "bank", name = "transaction")
public class Transaction {

	@PartitionKey
	@Column(name = "account_no")
	private String accountNo;

	@ClusteringColumn
	@Column(name = "tranPostDt")
	private Date transactionTime;

	@Column(name = "tranId")
	private String transactionId;
	@Column(name = "account_type")
	private String accountType;
	@Column(name = "amount_type")
	private String amountType;
	private Double	amount;
	private String	cardNum;
	private String	first_name;
	private String	full_name;
	private String	last_name;
	private String	middle_name;
	private String	city;
	private String	country_code;
	private String	country_name;
	private String	address_line1;
	private String	address_line2;
	private String	address_type;
	private String	state_abbreviation;
	private String	zipcode;
	private String	zipcode4;
	private String	merchantCtygCd;
	private String	merchantCtgyDesc;
	@Column(name = "merchantName")
	private String	merchant;
	private String	origTranAmt;
	private String	referenceKeyType;
	private String	referenceKeyValue;
	private double	tranAmt;
	private String	tranCd ;
	private String	tranDescription;
	private String	tranExpDt;
	private Date	tranInitDt;
	private String	tranStat;
	private String	tranType;
	private String transRsnCd;
	private String transRsnDesc;
	private String transRsnType;
	private String transRespCd;
	private String transRespDesc;
	private String transRespType;

	private String bucket = "1";
	private String location;
	private Set<String> customers;
	private Set<String> tags;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getaccountType() {
		return accountType;
	}
	public void setaccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getamountType() {
		return amountType;
	}
	public void setamountType(String amountType) {
		this.amountType = amountType;
	}
	public String getcardNum() {
		return cardNum;
	}
	public void setcardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Set<String> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<String> customers) {
		this.customers = customers;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	// customer columns
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first) {
		this.first_name = first;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getmiddle_name() {
		return this.middle_name;
	}
	public void setmiddle_name(String middleName) {
		this.middle_name = middleName;
	}

	public String getstate_abbreviation() {
		return this.state_abbreviation;
	}
	public void setstate_abbreviation(String state_abbreviation) {
		this.state_abbreviation = state_abbreviation;
	}
	public String getzipcode() {
		return this.zipcode;
	}
	public void setzipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getZipcode4() {
		return this.zipcode4;
	}
	public void setzipcode4(String zipcode4) {
		this.zipcode4 = zipcode4;
	}

	public void defineAllCustomerColumns(Customer customer) {

		this.first_name = customer.getFirstName();
		this.last_name = customer.getLast_name();
		this.middle_name = customer.getmiddle_name();
		this.full_name = customer.getfull_name();
		this.address_line1 = customer.getAddress_line1();
		this.address_line2 = customer.getAddress_line2();
		this.city = customer.getCity();
		this.address_type = customer.getAddress_type();
		this.country_code = customer.getCountry_code();
		this.state_abbreviation = customer.getstate_abbreviation();
		this.zipcode = customer.getzipcode();
		this.zipcode4 = customer.getZipcode4();

	}

	public enum Status {
		CHECK, APPROVED, DECLINED, CLIENT_APPROVED, CLIENT_DECLINED, CLIENT_APPROVAL, TIMEOUT
	}
}

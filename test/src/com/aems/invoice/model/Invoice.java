package com.aems.invoice.model;

import java.util.Date;

public class Invoice {

	//发票id
	private Integer id;
	//发票号码
	private String invNo;
	//发票日期
	private Date invDate;
	//来往科目
	private String interSub;
	//供应商
	private String supplier;
	//开户银行
	private String accBank;
	//地址
	private String address;
	//付款日期
	private Date payDate;
	//采购方式
	private String purWay;
	//纳税登记号
	private String taxNo;
	//币种
	private String currencyType;
	//摘要
	private String abstracts;
	//汇率
	private Double exchangeRate;
	//数量
	private Integer amount;
	//发票金额
	private double invAmount;
	//开票人
	private String drawer;
	//原发票号
	private String orinvNo;
	//发票类型
	private String invType;
	//状态
	private String status;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInvNo() {
		return invNo;
	}
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	public Date getInvDate() {
		return invDate;
	}
	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}
	public String getInterSub() {
		return interSub;
	}
	public void setInterSub(String interSub) {
		this.interSub = interSub;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getAccBank() {
		return accBank;
	}
	public void setAccBank(String accBank) {
		this.accBank = accBank;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public String getPurWay() {
		return purWay;
	}
	public void setPurWay(String purWay) {
		this.purWay = purWay;
	}
	public String getTaxNo() {
		return taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getCurrencyType() {
		return currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
	public Double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public double getInvAmount() {
		return invAmount;
	}
	public void setInvAmount(double invAmount) {
		this.invAmount = invAmount;
	}
	public String getDrawer() {
		return drawer;
	}
	public void setDrawer(String drawer) {
		this.drawer = drawer;
	}
	public String getOrinvNo() {
		return orinvNo;
	}
	public void setOrinvNo(String orinvNo) {
		this.orinvNo = orinvNo;
	}
	public String getInvType() {
		return invType;
	}
	public void setInvType(String invType) {
		this.invType = invType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
}

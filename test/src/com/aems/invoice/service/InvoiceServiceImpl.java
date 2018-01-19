package com.aems.invoice.service;

import com.aems.invoice.dao.InvoiceDao;
import com.aems.invoice.model.Invoice;

public class InvoiceServiceImpl implements InvoiceService {

	private InvoiceDao invoiceDao;
	
	public Invoice getInvoiceInfoByInvno(String invno) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveInvoiceRecord(Invoice invoice)throws Exception {
		// TODO Auto-generated method stub
		invoiceDao.saveInvoiceRecord(invoice);
	}

}

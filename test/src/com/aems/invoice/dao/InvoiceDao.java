package com.aems.invoice.dao;

import com.aems.invoice.model.Invoice;

public interface InvoiceDao {

	void saveInvoiceRecord(Invoice invoice)throws Exception;

}

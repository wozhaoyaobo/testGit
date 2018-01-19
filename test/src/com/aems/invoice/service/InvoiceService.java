package com.aems.invoice.service;

import com.aems.invoice.model.Invoice;

public interface InvoiceService {

	Invoice getInvoiceInfoByInvno(String invno);

	void saveInvoiceRecord(Invoice invoice)throws Exception;

}

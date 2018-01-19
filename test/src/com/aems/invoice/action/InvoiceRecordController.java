package com.aems.invoice.action;

import com.aems.invoice.model.Invoice;
import com.aems.invoice.service.InvoiceService;
/**
 * 发票录入及发票查询
 * @author 
 *
 */
public class InvoiceRecordController {

	private InvoiceService invoiceService;
	
	
	/**
	 * 发票信息录入
	 * @param
	 * @throws Exception
	 */
	public void saveInvoiceRecord(Invoice invoice)throws Exception{
		
		try {
			invoiceService.saveInvoiceRecord(invoice);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 根据条件查询发票信息
	 * @param
	 * @throws Exception
	 */
	public void getInvoiceInfoByConditions()throws Exception{
		
		
	}
	
	
}

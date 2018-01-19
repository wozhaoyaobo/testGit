package com.aems.invoice.action;

import com.aems.invoice.model.Invoice;
import com.aems.invoice.service.InvoiceService;

/**
 * 发票红冲
 * @author 
 *
 */
public class InvoiceRedFlushController {

	private InvoiceService invoiceService;
	
	/**
	 * 根据发票号码异步查询单个发票信息
	 * @param invno发票号码
	 * @throws Exception
	 */
	public void getInvoiceInfoByInvno(String invno)throws Exception{
		Invoice invoice=invoiceService.getInvoiceInfoByInvno(invno);
		
	}
	
	
	/**
	 * 根据发票号码完成发票红冲业务
	 * @param  invno 发票号码
	 * @throws Exception
	 */
	public void executeInvoiceRedFlush(String invno)throws Exception{
		
		
	}
	
}

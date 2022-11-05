package com.binar.challenge4.service;

import com.binar.challenge4.entity.Dummy;
import com.lowagie.text.DocumentException;
import net.sf.jasperreports.engine.JRException;
import java.io.FileNotFoundException;

public interface InvoiceService {
    Dummy generateFileInvoice(String filename) throws JRException, DocumentException, FileNotFoundException;
}

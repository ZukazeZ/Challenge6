package com.Binar.Challenge4.service.impl;
import com.Binar.Challenge4.entity.Dummy;

import com.Binar.Challenge4.service.InvoiceService;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.io.InputStream;
import java.util.HashMap;

@Slf4j
@Service
public class InvoiceServiceImpl implements InvoiceService {

//    @Autowired
//    private InvoiceRepository invoiceRepository;

    @Override
    public Dummy generateFileInvoice(String filename) throws JRException {

        HashMap<String, Object> map = new HashMap<>();
        map.put("id", "1");
        map.put("username", "Nico");
        map.put("film_name", "Gotoubun No Hanayome The Movie 2022");
        map.put("seat_code", "13");
        map.put("studio_id", "C");
        map.put("schedule_id", "2022-09-01");
        map.put("ticket_price", "50000");
        InputStream employeeReportStream = getClass().getResourceAsStream("/Invoice.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(employeeReportStream);

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map);
        byte[] data = JasperExportManager.exportReportToPdf(jasperPrint);
        Dummy fileDataDB = new Dummy();
        fileDataDB.setData(data);
        fileDataDB.setFilename(filename);
        fileDataDB.setFileType("application/pdf");
        return fileDataDB;
    }


}





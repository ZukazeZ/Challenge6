package com.binar.challenge4.controller;

import com.binar.challenge4.entity.Dummy;
import com.binar.challenge4.service.InvoiceService;
import com.lowagie.text.DocumentException;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JRException;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.io.*;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@RestController
@RequestMapping("/Invoice")
@Service

public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;


    @GetMapping("/downloadFile")
    public ResponseEntity<Object> fileDownloadJasper(@RequestParam(required = false,value = "filename") String filename) throws IOException, DocumentException {
        try {
            Dummy databases = invoiceService.generateFileInvoice(filename);
            log.info(databases + " file ada");
            return ResponseEntity.ok().contentType(MediaType.parseMediaType(databases.getFileType()))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename\"" + filename + "\"")
                    .body(new ByteArrayResource(databases.getData()));
        } catch (JRException e) {
            log.error("file not found: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}





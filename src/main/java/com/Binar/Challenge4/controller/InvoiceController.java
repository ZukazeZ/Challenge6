package com.Binar.Challenge4.controller;

import com.Binar.Challenge4.entity.Dummy;
import com.Binar.Challenge4.entity.FilmEntity;

import com.Binar.Challenge4.service.InvoiceService;
import com.lowagie.text.DocumentException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JRException;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@RestController
@RequestMapping("/Invoice")
@Service

public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;


    @GetMapping("/downloadFile")
    public ResponseEntity<?> fileDownloadJasper(@RequestParam(required = false,value = "filename") String filename) throws IOException, DocumentException {
        try {
            Dummy Databases = invoiceService.generateFileInvoice(filename);
            System.out.println(Databases + " file ada");
            return ResponseEntity.ok().contentType(MediaType.parseMediaType(Databases.getFileType()))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename\"" + filename + "\"")
                    .body(new ByteArrayResource(Databases.getData()));
        } catch (JRException e) {
            System.out.println("file not found: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}





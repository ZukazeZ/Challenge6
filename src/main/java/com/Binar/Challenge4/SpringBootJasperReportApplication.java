package com.Binar.Challenge4;


import com.Binar.Challenge4.entity.InvoiceEntity;
import com.Binar.Challenge4.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@SpringBootApplication

public class SpringBootJasperReportApplication {

    @Autowired
    private InvoiceRepository repository;


    @GetMapping("/getInvoice")
    public List<InvoiceEntity> getInvoice() {
        return repository.findAll();
    }
}

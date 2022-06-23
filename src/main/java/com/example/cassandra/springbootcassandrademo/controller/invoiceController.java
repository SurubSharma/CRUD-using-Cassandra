package com.example.cassandra.springbootcassandrademo.controller;

import com.example.cassandra.springbootcassandrademo.model.invoice;
import com.example.cassandra.springbootcassandrademo.repository.invoiceRepository;
import com.example.cassandra.springbootcassandrademo.service.invoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class invoiceController {

    private static final String ID_NOT_AVAILABLE = "There is no such entry ";

    @Autowired
private invoiceRepository invoiceRepo;

    @Autowired
    private invoiceService inserv;

    @PostMapping("/addInvoice")
    public invoice addUser(@RequestBody invoice inv){
    invoiceRepo.save(inv);
    return inv;
    }

    @GetMapping("/getAllInvoice")
    public List<invoice> getAllInvoices(){
        List<invoice> invoiceList=invoiceRepo.findAll();
        return invoiceList;
    }

        @PostConstruct
            public void saveInvoice(){
        invoice inv=new invoice(2,"invoice2","123333",777.77);
        invoiceRepo.save(inv);
        }

        @DeleteMapping("/removeByID")
        public ResponseEntity<HttpStatus> removeProductFromCart(@RequestParam("id") int id)  {
            inserv.deleteInvoice(id);
            return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
        }


        @PutMapping("/updateInvoice")
        public invoice updateInvoice(@RequestBody invoice product) {
            return invoiceRepo.save(product);
        }

}

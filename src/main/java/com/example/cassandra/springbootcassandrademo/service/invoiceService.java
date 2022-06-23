package com.example.cassandra.springbootcassandrademo.service;

import com.example.cassandra.springbootcassandrademo.model.invoice;
import com.example.cassandra.springbootcassandrademo.repository.invoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class invoiceService {
    @Autowired
    private invoiceRepository invoiceRepo;
public void deleteInvoice(int id){
        Optional<invoice> inv = invoiceRepo.findById(id);
        if (inv == null) {
        throw null;
        }
        invoiceRepo.deleteById(id);
        }
        }

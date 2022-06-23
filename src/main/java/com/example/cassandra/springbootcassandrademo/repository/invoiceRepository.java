package com.example.cassandra.springbootcassandrademo.repository;

import com.example.cassandra.springbootcassandrademo.model.invoice;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface invoiceRepository extends CassandraRepository<invoice,Integer> {

}

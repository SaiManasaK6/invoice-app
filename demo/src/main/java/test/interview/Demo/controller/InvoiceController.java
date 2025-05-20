package test.interview.Demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.interview.Demo.domain.Invoice;
import test.interview.Demo.repository.FakeDB;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @GetMapping("/{id}")
    public ResponseEntity<Invoice> getInvoiceById(@PathVariable("id") UUID id) {
        Invoice invoice = FakeDB.idToInvoiceMap.get(id);
        if (invoice == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(invoice);
    }
    @GetMapping
    public ResponseEntity<List<Invoice>> getAllInvoices() {
        return ResponseEntity.ok(new ArrayList<>(FakeDB.idToInvoiceMap.values()));
    }
}
